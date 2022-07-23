package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {
        System.out.println("performing Linear Search");
        int pageNumber = -1;
        for (Chapter chapter : book) {
            if (chapter.getName().equalsIgnoreCase(name)) {
                pageNumber = chapter.getPageNumber();
                break;
            }
        }
        return pageNumber;
    }
}
