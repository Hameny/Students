package Repository.IMPL;

import DTO.Email;
import Repository.EmailRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmailRepositoryIMPL implements EmailRepository {

    @Override
    public void addEmailByStudentID(UUID studentIDD, String email) {

        try (FileWriter fileWriter = new FileWriter("resources/emails.txt", true)) {

            Email email1 = new Email(email, studentIDD);
            String s =email1.getId() + "," + email1.getEmail() + "," + email1.getStudentID();
            fileWriter.write(s + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Email> getEmailByStudentID(UUID studentID) {
        List<Email> emailArrayList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("resources/emailArrayList.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                String[] s = line.split(",");
                Email email = new Email(UUID.fromString(s[0]), s[1], UUID.fromString(s[2]));
                if (email.getStudentID().equals(studentID)) {
                    emailArrayList.add(email);
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emailArrayList;
    }
}
