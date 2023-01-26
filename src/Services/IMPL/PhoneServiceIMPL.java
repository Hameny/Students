package Services.IMPL;

import Repository.IMPL.PhoneRepositoryIMPL;
import Repository.PhoneRepository;
import Services.PhonesService;

import java.util.UUID;

public class PhoneServiceIMPL implements PhonesService {
    @Override
    public void addPhoneByStudentID(UUID studentID,String phoneNumber) {
        PhoneRepository phoneRepository = new PhoneRepositoryIMPL();
        phoneRepository.addPhoneByStudentID(studentID,phoneNumber);
    }
}
