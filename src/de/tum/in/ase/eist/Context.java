package de.tum.in.ase.eist;

import java.util.Iterator;
import java.util.List;

public class Context {

    private List<Chapter> book;

    public Context() {
    }

    public List<Chapter> getBook() { return book; }

    public void setBook(List<Chapter> book) { this.book = book; }

    public boolean isChapterSortedByName() {
        if (book.isEmpty() || book.size() == 1) {
            return true;
        }

        Iterator<Chapter> iter = book.iterator();
        Chapter current, previous = iter.next();
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.getName().compareTo(current.getName()) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }

    public int search(String name) {
        if (!isChapterSortedByName()) {
            LinearSearch linearSearch = new LinearSearch();
            return linearSearch.performSearch(book, name);
        } else {
            BinarySearch binarySearch = new BinarySearch();
            return binarySearch.performSearch(book, name);
        }
    }
}