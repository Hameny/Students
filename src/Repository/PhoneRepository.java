package Repository;

import DTO.Phone;

import java.util.List;
import java.util.UUID;

public interface PhoneRepository {
    void addPhoneByStudentID(UUID studentID,String phoneNumber);

    List<Phone> getPhoneByStudentID(UUID fromString);
}
