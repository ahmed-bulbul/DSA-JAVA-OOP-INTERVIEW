package outlier;

import java.util.ArrayList;
import java.util.List;

public class ObjectiveGroupTest {

    public static void main(String[] args) {
        // Create a list to hold ObjectiveGroup objects
        List<ObjectiveGroup> objectiveGroups = new ArrayList<>();

        // Insert sample data
        ObjectiveGroup group1 = new ObjectiveGroup("Group 1", "REF001", null);  // Root group
        ObjectiveGroup group2 = new ObjectiveGroup("Group 2", "REF002", group1); // Child of Group 1
        ObjectiveGroup group3 = new ObjectiveGroup("Group 3", "REF003", null);   // Root group
        ObjectiveGroup group4 = new ObjectiveGroup("Group 4", "REF004", group3); // Child of Group 3
        ObjectiveGroup group5 = new ObjectiveGroup("Group 5", "REF005", null);   // Root group

        // Add groups to the list
        objectiveGroups.add(group1);
        objectiveGroups.add(group2);
        objectiveGroups.add(group3);
        objectiveGroups.add(group4);
        objectiveGroups.add(group5);

        // Get the total number of root objective groups
        int totalRootGroups = getTotalRootObjectiveGroup(objectiveGroups);
        System.out.println("Total root objective groups: " + totalRootGroups);
    }

    // Method to calculate total root ObjectiveGroups
    public static int getTotalRootObjectiveGroup(List<ObjectiveGroup> objectiveGroups) {
        int count = 0;
        for (ObjectiveGroup group : objectiveGroups) {
            if (group.isRoot()) {
                count++;
            }
        }
        return count;
    }
}
