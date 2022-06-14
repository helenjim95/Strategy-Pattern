package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {
        boolean isFound = false;
        for (Chapter chapter : book) {
            if (chapter.getName().equals(name)) {
                isFound = true;
                return chapter.getPageNumber();
            }
        }
        if (!isFound) {
            return -1;
        }
        return 0;
    }
}
