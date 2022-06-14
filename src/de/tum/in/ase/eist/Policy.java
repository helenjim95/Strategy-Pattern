package de.tum.in.ase.eist;


public class Policy {

    Context context;
    String optimalSearch = "";

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {
        if (!context.isChapterSortedByName()) {
            optimalSearch = "BinarySearch";
        } else {
            optimalSearch = "LinearSearch";
        }
    }
}
