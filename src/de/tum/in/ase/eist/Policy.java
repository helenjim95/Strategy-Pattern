package de.tum.in.ase.eist;

public class Policy {

//    TODO: referecnce to context class
    private Context context;

//    TODO: referecnce to context class
    public Policy(Context context) {
        this.context = context;
    }

//    TODO: Configure which strategy to use in conditional statement
    public void configure() {
        if (this.context.isChaptersSortedByName()) {
            this.context.setSearchAlgorithm(new BinarySearch());
        } else {
            this.context.setSearchAlgorithm(new LinearSearch());
        }
    }
}
