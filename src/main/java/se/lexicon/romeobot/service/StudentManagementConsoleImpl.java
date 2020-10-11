package se.lexicon.romeobot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.romeobot.data_access.StudentDao;
import se.lexicon.romeobot.models.Student;
import se.lexicon.romeobot.util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{

    private UserInputService scannerService;
    private StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService scannerService, StudentDao studentDao) {
        this.scannerService = scannerService;
        this.studentDao = studentDao;
    }
    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {

        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {

        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {

        studentDao.delete(id);
        return find(id);
    }

    @Override
    public List<Student> findAll() {

        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
