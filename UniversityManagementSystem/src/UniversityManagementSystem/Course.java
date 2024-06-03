package UniversityManagementSystem;

import java.util.List;

public class Course {
    String courseCode;
    Professor professor;
    //TODO You have to make sure that a participant can’t be
    // enrolled twice to the same course. Methods: void enrollParticipant(Enrollable enrollable);
    private boolean isCourseCodeValid(String courseCode){
        return (courseCode.matches("[A-Z]{3}-\\d{3}$"));
    }
}
