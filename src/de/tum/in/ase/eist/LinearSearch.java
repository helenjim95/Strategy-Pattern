package de.tum.in.ase.eist;

import java.util.List;

//TODO: concrete strategy implementing strategy interface
public class LinearSearch implements SearchStrategy {

//    TODO: implement method body
    public int performSearch(List<Chapter> book, String name) {
        System.out.println("performing Linear Search");
        for (Chapter chapter : book) {
            if (chapter.getName().equalsIgnoreCase(name)) {
                return chapter.getPageNumber();
            }
        }
        return -1;
    }
}
