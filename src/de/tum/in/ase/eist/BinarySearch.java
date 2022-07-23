package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {
        int arraySize = book.size();
        int lowerBound = 0;
        int upperBound = arraySize - 1;
        boolean isFound = false;
        int pageNumber = 0;

        while (!isFound) {
            if (upperBound < lowerBound) {
                return -1;
            }
            int midPoint = lowerBound + (upperBound - lowerBound) / 2;
            if (book.get(midPoint).getName().equals(name)) {
                isFound = true;
                pageNumber = book.get(midPoint).getPageNumber();
            } else {
                if (book.get(midPoint).getName().charAt(0) < name.charAt(0)) {
                    lowerBound = midPoint + 1;
                }
                else if (book.get(midPoint).getName().charAt(0) >= name.charAt(0)) {
                    upperBound = midPoint - 1;
                }
            }
        }
        return pageNumber;
    }
}
