package Person.Staff;

import Payment.StaffPayRoll;
import Person.Person;
import java.io.Serializable;

public class Staff extends Person implements StaffPayRoll, Serializable, Cloneable {

  int staff_id;
  String duty;
  Workload workload;
  int workdone;

  //Constructor

  public Staff() {
  }

  public Staff(int staff_id, String duty, int workdone) {
    this.staff_id = staff_id;
    this.duty = duty;
    this.workdone = workdone;
  }

  public Staff(int staff_id, String duty, Workload workload, int workdone) {
    this.staff_id = staff_id;
    this.duty = duty;
    this.workload = workload;
    this.workdone = workdone;
  }

  @Override
  public float ComputePayRoll(Staff staff) {
    //The working hours cannot exceed 40.
    int workload = staff.workdone;
    if (workload > 40) {
      throw new WorkloadExceedException();
    }
    return (float) ((workload * 32 * 2) * 0.75);
  }

  public Staff getStaff() {
    Staff staff = null;
    return staff;
  }

  public int getStaff_id() {
    return staff_id;
  }

  //getters and setters

  public void setStaff_id(int staff_id) {
    this.staff_id = staff_id;
  }

  public String getDuty() {
    return duty;
  }

  public void setDuty(String duty) {
    this.duty = duty;
  }

  public Workload getWorkload() {
    return workload;
  }

  public void setWorkload(Workload workload) {
    this.workload = workload;
  }

  public int getWorkdone() {
    return workdone;
  }

  public void setWorkdone(int workdone) {
    this.workdone = workdone;
  }

  class Workload {

    int start_hour, start_minute, end_hour, end_minute;

    //add method to print the work timing
  }
}
