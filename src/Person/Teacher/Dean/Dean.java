package Person.Teacher.Dean;

import Person.Teacher.Teacher;
import java.util.ArrayList;

public class Dean extends Teacher {

  //Dean could be Singleton, but here every department has its exclusive Dean

  Dean()
  {
  }

  public Dean(int teacher_id, String email) {
    super(teacher_id, email);
  }

  public Dean(int teacher_id, String email, String qualification) {
    super(teacher_id, email, qualification);
  }

  public Dean(int teacher_id, String email, String qualification, String designation,
      int teaching_experience_in_years, String subject_taught,
      ArrayList<String> area_of_interest) {
    super(teacher_id, email, qualification, designation, teaching_experience_in_years,
        subject_taught,
        area_of_interest);
  }

  public Dean(int teacher_id, String email, String qualification, String designation,
      int teaching_experience_in_years, String subject_taught) {
    super(teacher_id, email, qualification, designation, teaching_experience_in_years,
        subject_taught);
  }
}
