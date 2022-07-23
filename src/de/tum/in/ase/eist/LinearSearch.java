package de.tum.in.ase.eist;

import java.util.List;

//TODO: concrete strategy implementing strategy interface
public class LinearSearch implements SearchStrategy {

//    TODO: implement method body
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
