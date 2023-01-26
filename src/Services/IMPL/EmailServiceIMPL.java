package Services.IMPL;

import Repository.EmailRepository;
import Repository.IMPL.EmailRepositoryIMPL;
import Services.EmailService;

import java.util.UUID;

public class EmailServiceIMPL implements EmailService {
    @Override
    public void addEmailByStudentID(UUID studentID, String email) {
        EmailRepository emailRepository = new EmailRepositoryIMPL();
        emailRepository.addEmailByStudentID(studentID,email);

    }
}
