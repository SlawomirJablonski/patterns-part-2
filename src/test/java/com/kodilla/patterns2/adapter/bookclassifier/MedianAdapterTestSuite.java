package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Book b1 = new Book("aaa1", "ttt1",2010,"12345");
        Book b2 = new Book("aaa2", "ttt2",2011,"12346");
        Book b3 = new Book("aaa3", "ttt3",2011,"12347");
        Book b4 = new Book("aaa4", "ttt4",2018,"12348");
        Book b5 = new Book("aaa5", "ttt5",2019,"12349");
        Set<Book> bookSet = Stream.of(b1,b2,b3,b4,b5).collect(Collectors.toSet());
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2011,median);
    }
}
