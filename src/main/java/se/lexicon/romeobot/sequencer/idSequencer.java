package se.lexicon.romeobot.sequencer;

public class idSequencer {

    private static int studentId = 1000; // This looks better if we have more than 100 students

    public static int nextStudentId() { // New Id for each new student, starts with 1001
        studentId++;
        return studentId;
    }

    public static void reset() { // Resets the Id to start with 1001 again
        studentId = 1000;
    }
}
