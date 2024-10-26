package outlier;

import java.util.ArrayList;
import java.util.List;

class ObjectiveGroup {
    private String name;
    private String reference;
    private ObjectiveGroup parent;

    // Constructor
    public ObjectiveGroup(String name, String reference, ObjectiveGroup parent) {
        this.name = name;
        this.reference = reference;
        this.parent = parent;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getReference() {
        return reference;
    }

    public ObjectiveGroup getParent() {
        return parent;
    }

    // Check if it's a root objective group (no parent)
    public boolean isRoot() {
        return this.parent == null;
    }
}
