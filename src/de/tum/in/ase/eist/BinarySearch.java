package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {
        System.out.println("performing Binary Search");
        int arraySize = 0;
        if (book != null) {
            arraySize = book.size();
        }
        int lowerBound = 0;
        int upperBound = arraySize - 1;

        while (upperBound >= lowerBound) {
            int midPoint = lowerBound + (upperBound - lowerBound) / 2;
            if (book.get(midPoint).getName().equalsIgnoreCase(name)) {
                return book.get(midPoint).getPageNumber();
            } else if (book.get(midPoint).getName().compareTo(name) < 0) {
                    lowerBound = midPoint + 1;
            } else {
                    upperBound = midPoint - 1;
            }
        }
        return -1;
    }
}
