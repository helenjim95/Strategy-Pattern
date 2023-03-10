package de.tum.in.ase.eist;

import java.util.List;

//TODO: context class
public class Context {

    private List<Chapter> book;
//    TODO: add a field for storing a reference to a strategy interface/object
    private SearchStrategy searchAlgorithm;

    public Context() { }

//    TODO: define an interface which lets the strategy access its data.
    public List<Chapter> getBook() { return this.book; }

    public void setBook(List<Chapter> book) { this.book = book; }

    public boolean isChaptersSortedByName() {
        for (int i = 0; i < book.size() - 1; i++) {
            Chapter current = book.get(i);
            Chapter next = book.get(i + 1);
            if (current.getName().compareTo(next.getName()) > 0) {
                return false;
            }
        }
        return true;
    }

//    TODO: Delegate method calls to strategy object.
    public int search(String name) {
        return this.searchAlgorithm.performSearch(book, name);
    }

    public SearchStrategy getSearchAlgorithm() { return this.searchAlgorithm; }

//    TODO: setter for replacing values of the field strategy object.
    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

}
