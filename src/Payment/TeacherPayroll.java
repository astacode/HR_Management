package Payment;

import Person.Teacher.Teacher;

public interface TeacherPayroll extends PayRoll {

  float ComputePayRoll(Teacher teacher);

}
