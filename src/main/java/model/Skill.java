package model;

/**
 * @author Murad Salmanov (legenda)
 * @created 14/04/2021 - 23:37
 * @project DeloperTeams
 */
public class Skill {
    long id;
    String name;

    public Skill() {
    }

    public Skill(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

