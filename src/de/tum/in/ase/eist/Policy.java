package de.tum.in.ase.eist;

import java.sql.Connection;

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
