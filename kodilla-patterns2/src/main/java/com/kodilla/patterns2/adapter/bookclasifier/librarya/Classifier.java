package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import java.awt.print.Book;
import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}