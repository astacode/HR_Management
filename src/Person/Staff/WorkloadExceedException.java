package Person.Staff;

public class WorkloadExceedException extends RuntimeException {

  WorkloadExceedException()
  {
    System.out.println("The workload exceeds the limit ie. 40 hours per week");
  }

}
