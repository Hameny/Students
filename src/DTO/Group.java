package DTO;

import java.util.UUID;

public class Group {
    private UUID id;
    private int numberOfGroup;
    private UUID facultyID;
    private UUID studentID;

    public Group(UUID id, int numberOfGroup, UUID facultyID) {
        this.id = id;
        this.numberOfGroup = numberOfGroup;
        this.facultyID = facultyID;
    }

    public Group(int numberOfGroup, UUID facultyID) {
        this.id = UUID.randomUUID();
        this.numberOfGroup = numberOfGroup;
        this.facultyID = facultyID;
    }

    public Group( UUID studentID) {
        this.id = id;
        this.studentID = studentID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public UUID getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(UUID facultyID) {
        this.facultyID = facultyID;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public void setStudentID(UUID studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", numberOfGroup=" + numberOfGroup +
                ", facultyID=" + facultyID +
                '}';
    }
}
