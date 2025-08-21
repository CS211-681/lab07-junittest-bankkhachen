package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList s;

    @BeforeEach
    void setUp(){
        s = new StudentList();
        s.addNewStudent("6710400001", "First");
        s.addNewStudent("6710400002", "Second");
        s.addNewStudent("6710400003", "Third");
        s.addNewStudent("6710400004", "Fourth");
    }

    @Test
    void testFindStudentById() {
        assertNotNull(s.findStudentById("6710400002"));
    }

    @Test
    void testGiveScoreToId() {
        s.giveScoreToId("6710400001", 10.5);

        assertEquals(10.5, s.findStudentById("6710400001").getScore());
    }

    @Test
    void testViewGradeId() {
        s.giveScoreToId("6710400001", 99);

        assertEquals("A", s.viewGradeOfId("6710400001"));
    }

    @Test
    void testFilterByName() {
        StudentList filtered = s.filterByName("First");

        assertNull(filtered.findStudentById("6710400002"));
    }

    @Test
    void testAddNewStudent() {
        s.addNewStudent("testId", "testName");

        assertNotNull(s.findStudentById("testId"));
    }
}