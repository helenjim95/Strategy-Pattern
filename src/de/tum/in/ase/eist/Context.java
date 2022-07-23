package de.tum.in.ase.eist;

import java.util.Iterator;
import java.util.List;

public class Context {

    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;

    public Context() { }

    public List<Chapter> getBook() { return book; }

    public void setBook(List<Chapter> book) { this.book = book; }

    public boolean isChaptersSortedByName() {
        boolean isSorted = false;
        if (book.isEmpty() || book.size() == 1) {
            isSorted = true;
        }
        Iterator<Chapter> iter = book.iterator();
        Chapter previous = iter.next();
        Chapter current;
        while (iter.hasNext()) {
            current = iter.next();
            if (previous.getName().compareTo(current.getName()) > 0) {
                isSorted = false;
            }
            previous = current;
        }
        return isSorted;
    }

    public int search(String name) {
        if (!isChaptersSortedByName()) {
            setSearchAlgorithm(new LinearSearch());
        } else {
            setSearchAlgorithm(new BinarySearch());
        }
        return searchAlgorithm.performSearch(book, name);
    }

    public SearchStrategy getSearchAlgorithm() { return searchAlgorithm; }
    public void setSearchAlgorithm(SearchStrategy searchStrategy) {
        this.searchAlgorithm = searchStrategy;
    }

}
