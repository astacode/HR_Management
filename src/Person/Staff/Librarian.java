package Person.Staff;

public class Librarian extends Staff {

  Librarian() {

  }

  public Librarian(int staff_id, String duty, int workdone) {
    super(staff_id, duty, workdone);
  }

  public Librarian(int staff_id, String duty, Workload workload, int workdone) {
    super(staff_id, duty, workload, workdone);
  }
}
