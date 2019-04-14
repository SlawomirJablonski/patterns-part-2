package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class StatisticsTestSuite {
    @Test
    public void averagePublicationYearTest(){
        //Given
        Book b1 = new Book("aaa1", "ttt1",2010);
        Book b2 = new Book("aaa2", "ttt2",2010);
        Book b3 = new Book("aaa3", "ttt3",2015);
        Book b4 = new Book("aaa4", "ttt4",2018);
        Book b5 = new Book("aaa5", "ttt5",2018);

        Map<BookSignature, Book> books = new HashMap<>();
        books.put(new BookSignature("123"),b1);
        books.put(new BookSignature("234"),b2);
        books.put(new BookSignature("345"),b3);
        books.put(new BookSignature("456"),b4);
        books.put(new BookSignature("567"),b5);
        Statistics statistics = new Statistics();

        //When
        int average = statistics.averagePublicationYear(books);

        //Then
        Assert.assertEquals(2014,average);
    }

    @Test
    public void averagePublicationYearWhenEmptyCollectionTest() {
        //Given
        Map<BookSignature, Book> books = new HashMap<>();
        Statistics statistics = new Statistics();

        //When
        int average = statistics.averagePublicationYear(books);

        //Then
        Assert.assertEquals(0, average);
    }
}
