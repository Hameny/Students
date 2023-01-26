package DTO;

import java.util.UUID;

public class Specialization {

    private UUID specializationID;
    private String specialization;


    public Specialization(UUID specializationID, String specialization) {
        this.specializationID = specializationID;
        this.specialization = specialization;
    }

    public Specialization(String specialization) {
        this.specializationID = UUID.randomUUID();
        this.specialization = specialization;
    }

    public UUID getSpecializationID() {
        return specializationID;
    }

    public void setSpecializationID(UUID specializationID) {
        this.specializationID = specializationID;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "specializationID=" + specializationID +
                ", specialization='" + specialization + '\'' +
                '}'+'\n';
    }
}
