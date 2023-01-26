package DTO;

import java.util.UUID;

public class Email {
    private UUID id;
    private String email;
    private UUID studentID;

    public Email(UUID id, String email, UUID studentID) {
        this.id = id;
        this.email = email;
        this.studentID = studentID;
    }

    public Email(String email, UUID studentID) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.studentID = studentID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getStudentID() {
        return studentID;
    }

    public void setStudentID(UUID studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email +
                '}';
    }
}
