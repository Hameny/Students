package Repository;

import DTO.Facultet;

import java.util.List;


public interface FacultyRepository {
    List<Facultet> getALLFaculty();

    List<Facultet> addNewFaculty(String nameOfFacultet);
}
