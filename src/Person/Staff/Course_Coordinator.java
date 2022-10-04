package Person.Staff;

public class Course_Coordinator extends Staff{

  Course_Coordinator()
  {

  }
  public Course_Coordinator(int staff_id, String duty, int workdone) {
    super(staff_id, duty, workdone);
  }

  public Course_Coordinator(int staff_id, String duty, Workload workload, int workdone) {
    super(staff_id, duty, workload, workdone);
  }
}
