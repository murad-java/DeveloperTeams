package model;

import java.util.List;

/**
 * @author Murad Salmanov (legenda)
 * @created 14/04/2021 - 23:37
 * @project DeloperTeams
 */
public class Team {
    long id;
    String Name;
    List<Developer> developers;

    public Team(long id, String name, List<Developer> developers) {
        this.id = id;
        Name = name;
        this.developers = developers;
    }

    public Team() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }
}
