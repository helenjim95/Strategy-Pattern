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
        if (context.isChaptersSortedByName()) {
            context.setSearchAlgorithm(new BinarySearch());
        } else {
            context.setSearchAlgorithm(new LinearSearch());
        }
    }

    public Context getContext() { return context; }

    public void setContext(Context context) { this.context = context; }

}
