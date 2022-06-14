package de.tum.in.ase.eist;

import java.util.List;

public interface SearchStrategy {

    public int performSearch(List<Chapter> book, String name);

}
