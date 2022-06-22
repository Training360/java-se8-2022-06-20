package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    private final List<String> skills = new ArrayList<>();

    public List<String> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }
}
