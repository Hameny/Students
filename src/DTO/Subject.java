package DTO;

import java.util.UUID;

public class Subject {

    private UUID subjectID;
    private String subjectName;


    public Subject(UUID subjectID, String subjectName) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }

    public Subject(String subjectName) {
        this.subjectID = UUID.randomUUID();
        this.subjectName = subjectName;
    }

    public UUID getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(UUID subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "subjectID=" + subjectID +
                ", subject='" + subjectName + '\'' +
                '}'+'\n';
    }
}
