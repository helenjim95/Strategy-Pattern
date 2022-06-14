package de.tum.in.ase.eist;

public interface SearchStrategy {

    default void performSearch(String book, String name) {};

}
