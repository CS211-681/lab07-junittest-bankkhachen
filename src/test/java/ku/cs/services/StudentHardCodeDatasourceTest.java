package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentHardCodeDatasourceTest {
    private StudentHardCodeDatasource datasource;

    @BeforeEach
    void setup() {
        datasource = new StudentHardCodeDatasource();
    }

    @Test
    void testReadData() {
        StudentList list = datasource.readData();
        assertEquals(4, list.getStudents().size());
    }
}