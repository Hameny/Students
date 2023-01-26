package DTO;

import java.util.UUID;

public class Phone {
    private UUID id;

    private String numberPhone;

    private UUID studentID;

    public Phone(UUID id, String numberPhone, UUID studentID) {
        this.id = id;
        this.numberPhone = numberPhone;
        this.studentID = studentID;
    }

    public Phone(String numberPhone, UUID studentID) {
        this.id = UUID.randomUUID();
        this.numberPhone = numberPhone;
        this.studentID = studentID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }


    public UUID getStudentID() {
        return studentID;
    }

    public void setStudentID(UUID studentID) {
        this.studentID = studentID;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "numberPhone='" + numberPhone +
                '}';
    }
}
