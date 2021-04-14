package model;

import java.util.List;

/**
 * @author Murad Salmanov (legenda)
 * @created 14/04/2021 - 23:37
 * @project DeloperTeams
 */
public class Developer {
    long id;
    String lastName;
    String firstName;
    List<Skill> skills;

    public Developer() {
    }

    public Developer(long id, String lastName, String firstName, List<Skill> skills) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.skills = skills;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
