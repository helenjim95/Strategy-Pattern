package de.tum.in.ase.eist;

import java.util.List;

//TODO: strategy interface
public interface SearchStrategy {

    int performSearch(List<Chapter> book, String name);

}
