package Services.IMPL;

import DTO.Facultet;
import Repository.FacultyRepository;
import Repository.IMPL.FacultyRepositoryIMPL;
import Services.FacultetService;

import java.util.List;

public class FacultetServiceIMPL implements FacultetService {
    @Override
    public void addFacultet(String nameOfFacultet) {
        FacultyRepository facultyRepository = new FacultyRepositoryIMPL();
        facultyRepository.addNewFacultet(nameOfFacultet);

    }

    @Override
    public List<Facultet> getAllfacultets() {

        FacultyRepository facultyRepository = new FacultyRepositoryIMPL();
        return facultyRepository.getALLFacultets();
    }
}
