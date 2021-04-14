package model;

/**
 * @author Murad Salmanov (legenda)
 * @created 14/04/2021 - 23:38
 * @project DeloperTeams
 */
public enum  TeamStatus {
    ACTIVE,
    DELETED;

    private String status;

    TeamStatus(String status) {
        this.status = status;
    }

    TeamStatus() {

    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
