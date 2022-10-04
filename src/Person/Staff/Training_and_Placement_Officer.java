package Person.Staff;

public class Training_and_Placement_Officer extends Staff{

  Training_and_Placement_Officer()
  {

  }

  public Training_and_Placement_Officer(int staff_id, String duty, int workdone) {
    super(staff_id, duty, workdone);
  }

  public Training_and_Placement_Officer(int staff_id, String duty, Workload workload,
      int workdone) {
    super(staff_id, duty, workload, workdone);
  }
}
