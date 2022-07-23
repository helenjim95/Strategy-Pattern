package de.tum.in.ase.eist;

import java.util.List;

public class Context {

    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;

    public Context() { }

    public List<Chapter> getBook() { return book; }

    public void setBook(List<Chapter> book) { this.book = book; }

    public boolean isChaptersSortedByName() {
        boolean isSorted = true;
        if (book == null || book.size() <= 1) {
            isSorted = true;
        } else {
            for (int i = 0; i < book.size() - 1; i++) {
                Chapter current = book.get(i);
                Chapter next = book.get(i + 1);
                if (current.getName().compareTo(next.getName()) > 0) {
                    isSorted = false;
                    break;
                }
            }
        }
        return isSorted;
    }

    public int search(String name) {
        return this.searchAlgorithm.performSearch(book, name);
    }

    public SearchStrategy getSearchAlgorithm() { return searchAlgorithm; }
    public void setSearchAlgorithm() {
        if (isChaptersSortedByName()) {
            this.searchAlgorithm = new BinarySearch();
        } else {
            this.searchAlgorithm = new LinearSearch();
        }
    }

}
