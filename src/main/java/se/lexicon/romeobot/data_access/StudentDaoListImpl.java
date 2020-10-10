package se.lexicon.romeobot.data_access;

import se.lexicon.romeobot.models.Student;
import se.lexicon.romeobot.sequencer.idSequencer;

import java.util.ArrayList;
import java.util.List;

// @Component ("StudentDao")
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        student.setId(idSequencer.nextStudentId());
        students.add(student);
        return student;
    }

    @Override
    public Student find(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                break;
            }
        }
    }

}
