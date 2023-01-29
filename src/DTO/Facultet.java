package DTO;

import java.util.UUID;

public class Facultet {
    public UUID id;
    public String nameOfFacultet;

    public Facultet(UUID id, String nameOfFacultet) {
        this.id = id;
        this.nameOfFacultet = nameOfFacultet;
    }

    public Facultet(String nameOfFacultet) {
        this.id = UUID.randomUUID();
        this.nameOfFacultet = nameOfFacultet;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNameOfFacultet() {
        return nameOfFacultet;
    }

    public void setNameOfFacultet(String nameOfFacultet) {
        this.nameOfFacultet = nameOfFacultet;
    }

    @Override
    public String toString() {
        return "Facultet{" +
                "id=" + id +
                ", NameOfFacultet='" + nameOfFacultet + '\'' +
                '}';
    }
}
