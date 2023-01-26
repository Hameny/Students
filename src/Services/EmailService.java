package Services;

import java.util.UUID;

public interface EmailService {
    void addEmailByStudentID(UUID studentID, String Email);
}
