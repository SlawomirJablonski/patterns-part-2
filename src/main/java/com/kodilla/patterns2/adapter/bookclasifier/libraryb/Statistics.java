package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {

        return (int) books.entrySet().stream()
                .map(Map.Entry::getValue)
                .map(Book::getYearOfPublication)
                .mapToInt(Integer::intValue)
                .average().orElse(0.0);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;

        List<Integer> years = books.entrySet().stream()
                .map(Map.Entry::getValue)
                .map(Book::getYearOfPublication)
                .sorted()
                .collect(toList());

        return years.size() % 2 == 0 ?
                (years.get(years.size() / 2 - 1) + years.get(years.size() / 2)) / 2 : years.get(years.size() / 2);
    }
}
