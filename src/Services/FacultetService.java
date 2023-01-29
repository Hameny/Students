package Services;

import DTO.Facultet;

import java.util.List;

public interface FacultetService {

    void addFacultet(String nameOfFacultet);

    List<Facultet> getAllfacultets();
}
