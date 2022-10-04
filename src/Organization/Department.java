package Organization;

import Person.Staff.Staff;
import Person.Teacher.Dean.Dean;
import Person.Teacher.Teacher;
import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable, Cloneable {

  private String department_name;
  private int department_id;
  private ArrayList<Teacher> teacher_list;
  private Dean dean;
  private ArrayList<Staff> staff_list;

  //Constructor

  public Department() {
  }

  public Department(String department_name, int department_id,
      ArrayList<Teacher> teacher_list, Dean dean, ArrayList<Staff> staff_list) {
    this.department_name = department_name;
    this.department_id = department_id;
    this.teacher_list = teacher_list;
    this.dean = dean;
    this.staff_list = staff_list;
  }

  //toString

  @Override
  public String toString() {
    return "Department{" +
        "department_name='" + department_name + '\'' +
        ", department_id=" + department_id +
        ", teacher_list=" + teacher_list +
        ", dean=" + dean +
        ", staff_list=" + staff_list +
        '}';
  }

  //getter and setters for above properties

  public String getDepartment_name() {
    return department_name;
  }

  public void setDepartment_name(String department_name) {
    this.department_name = department_name;
  }

  public int getDepartment_id() {
    return department_id;
  }

  public void setDepartment_id(int department_id) {
    this.department_id = department_id;
  }

  public ArrayList<Teacher> getTeacher_list() {
    return teacher_list;
  }

  public void setTeacher_list(ArrayList<Teacher> teacher_list) {
    this.teacher_list = teacher_list;
  }

  public Dean getDean() {
    return dean;
  }

  public void setDean(Dean dean) {
    this.dean = dean;
  }

  public ArrayList<Staff> getStaff_list() {
    return staff_list;
  }

  public void setStaff_list(ArrayList<Staff> staff_list) {
    this.staff_list = staff_list;
  }
}
