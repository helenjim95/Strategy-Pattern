package de.tum.in.ase.eist;

public class Policy {

    private Context context;

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {
    }

    public Context getContext() { return context; }

    public void setContext(Context context) { this.context = context; }

}
