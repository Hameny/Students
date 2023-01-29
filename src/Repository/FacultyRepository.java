package Repository;

import DTO.Facultet;

import java.util.List;


public interface FacultyRepository {
    List<Facultet> getALLFacultets();

    List<Facultet> addNewFacultet(String nameOfFacultet);
}
