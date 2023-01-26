package Services;

import java.util.UUID;

public interface PhonesService {

    void addPhoneByStudentID(UUID studentID,String phoneNumber);
}
