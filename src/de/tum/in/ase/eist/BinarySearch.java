package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {
        int arraySize = 0;
        if (book != null) {
            arraySize = book.size();
        }
        int lowerBound = 0;
        int upperBound = arraySize - 1;
        boolean isFound = false;
        int pageNumber = -1;

        while (!isFound) {
            if (upperBound < lowerBound) {
                break;
            } else {
                int midPoint = lowerBound + (upperBound - lowerBound) / 2;
                if (book.get(midPoint).getName().equalsIgnoreCase(name)) {
                    pageNumber = book.get(midPoint).getPageNumber();
                    isFound = true;
                    break;
                } else {
                    if (book.get(midPoint).getName().charAt(0) < name.charAt(0)) {
                        lowerBound = midPoint + 1;
                    } else if (book.get(midPoint).getName().charAt(0) >= name.charAt(0)) {
                        upperBound = midPoint - 1;
                    }
                }
            }
        }
        return pageNumber;
    }
}
