package Services.IMPL;

import DTO.Facultet;
import Repository.FacultyRepository;
import Repository.IMPL.FacultyRepositoryIMPL;
import Services.FacultyService;

import java.util.List;

public class FacultyServiceIMPL implements FacultyService {
    @Override
    public void addFaculty(String nameOfFacultet) {
        FacultyRepository facultyRepository = new FacultyRepositoryIMPL();
        facultyRepository.addNewFaculty(nameOfFacultet);

    }

    @Override
    public List<Facultet> getAllFaculties() {

        FacultyRepository facultyRepository = new FacultyRepositoryIMPL();
        return facultyRepository.getALLFaculty();
    }
}
