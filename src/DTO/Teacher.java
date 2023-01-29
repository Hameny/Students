package DTO;

import java.util.UUID;

public class Teacher {
    private UUID id;
    private String firstNameOfTeacher;
    private String secondNameOfTeacher;
    private UUID subjectID;

    public Teacher(UUID id, String firstNameOfTeacher, String secondNameOfTeacher, UUID subjectID) {
        this.id = id;
        this.firstNameOfTeacher = firstNameOfTeacher;
        this.secondNameOfTeacher = secondNameOfTeacher;
        this.subjectID = subjectID;
    }

    public Teacher(String firstNameOfTeacher, String secondNameOfTeacher, UUID subjectID) {
        this.id = UUID.randomUUID();
        this.firstNameOfTeacher = firstNameOfTeacher;
        this.secondNameOfTeacher = secondNameOfTeacher;
        this.subjectID = subjectID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstNameOfTeacher() {
        return firstNameOfTeacher;
    }

    public void setFirstNameOfTeacher(String firstNameOfTeacher) {
        this.firstNameOfTeacher = firstNameOfTeacher;
    }

    public String getSecondNameOfTeacher() {
        return secondNameOfTeacher;
    }

    public void setSecondNameOfTeacher(String secondNameOfTeacher) {
        this.secondNameOfTeacher = secondNameOfTeacher;
    }

    public UUID getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(UUID subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstNameOfTeacher='" + firstNameOfTeacher + '\'' +
                ", secondNameOfTeacher='" + secondNameOfTeacher + '\'' +
                ", subjectID=" + subjectID +
                '}';
    }
}
