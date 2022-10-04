package Person.Staff;

public class Lab_Technician extends Staff {

  Lab_Technician() {

  }

  public Lab_Technician(int staff_id, String duty, int workdone) {
    super(staff_id, duty, workdone);
  }

  public Lab_Technician(int staff_id, String duty, Workload workload, int workdone) {
    super(staff_id, duty, workload, workdone);
  }
}
