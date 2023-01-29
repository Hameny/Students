package Services.IMPL;

import DTO.Mark;
import Repository.IMPL.MarkRepositoryIMPL;
import Repository.MarkRepository;
import Services.MarkService;

import java.util.List;
import java.util.UUID;

public class MarkServiceIMPL implements MarkService {
    @Override
    public void addMarkToStudentBySpecializationID(UUID studentSpecializationID, UUID teacherID,int mark) {
        MarkRepository markRepository = new MarkRepositoryIMPL();
        markRepository.addMArkBySpecializationID(studentSpecializationID,teacherID,mark);
    }

    @Override
    public List<Mark> getAllMarks() {
        MarkRepository markRepository = new MarkRepositoryIMPL();
        return markRepository.getAllMarks();
    }
}
