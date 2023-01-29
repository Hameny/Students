package Services;

import DTO.Facultet;

import java.util.List;

public interface FacultyService {

    void addFaculty(String nameOfFacultet);

    List<Facultet> getAllFaculties();
}
