package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;

    @BeforeAll
    static void initial() {
    }

    @BeforeEach
    void setup() {
        s = new Student("6xxxxxxxxx", "StudentTest");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 80")
    void testAddScore() {
        s.addScore(80);
        assertEquals(80, s.getScore());
    }

    @Test
    void testCalculateGrade(){
        s.addScore(70);
        assertEquals("B", s.grade());
    }

    @Test
    void testChangeName(){
        s.changeName("Bean");
        assertEquals("Bean", s.getName());
    }

    @Test
    void testIsId() {
        assertFalse(s.isId("5x"));
        assertTrue(s.isId("6xxxxxxxxx"));
    }

    @Test
    void testIsNameContain() {
        assertTrue(s.isNameContains("Stu"));
    }
}