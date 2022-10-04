package Person.Staff;

public class Cleaner extends Staff {

  Cleaner() {
  }

  public Cleaner(int staff_id, String duty, int workdone) {
    super(staff_id, duty, workdone);
  }

  public Cleaner(int staff_id, String duty, Workload workload, int workdone) {
    super(staff_id, duty, workload, workdone);
  }
}
