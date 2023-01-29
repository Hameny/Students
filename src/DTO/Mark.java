package DTO;

import java.util.Date;
import java.util.UUID;

public class Mark {
    private UUID id;
    private UUID subjectStudentID;
    private UUID teacherID;
    Date dateOfMark;
    int mark;

    public Mark(UUID subjectStudentID, UUID teacherID, Date dateOfMark,int mark) {
        this.id = UUID.randomUUID();
        this.subjectStudentID = subjectStudentID;
        this.teacherID = teacherID;
        this.dateOfMark = dateOfMark;
        this.mark = mark;
    }

    public Mark(UUID id, UUID subjectStudentID, UUID teacherID, Date dateOfMark, int mark) {
        this.id = id;
        this.subjectStudentID = subjectStudentID;
        this.teacherID = teacherID;
        this.dateOfMark = dateOfMark;
        this.mark = mark;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSubjectStudentID() {
        return subjectStudentID;
    }

    public void setSubjectStudentID(UUID subjectStudentID) {
        this.subjectStudentID = subjectStudentID;
    }

    public UUID getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(UUID teacherID) {
        this.teacherID = teacherID;
    }

    public Date getDateOfMark() {
        return dateOfMark;
    }

    public void setDateOfMark(Date dateOfMark) {
        this.dateOfMark = dateOfMark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
