package Person.Teacher;

import Payment.TeacherPayroll;
import Person.Person;
import java.io.Serializable;
import java.util.ArrayList;

public class Teacher extends Person implements TeacherPayroll, Serializable, Cloneable {

  private static final long serialVersionUID = 1L;
  private int teacher_id;
  private String email;
  private String qualification;
  private String designation;
  private int teaching_experience_in_years;
  private String subject_taught;
  private ArrayList<String> area_of_interest;

  //Constructor

  public Teacher(int teacher_id, String email) {
    this.teacher_id = teacher_id;
    this.email = email;
  }

  public Teacher(int teacher_id, String email, String qualification) {
    this.teacher_id = teacher_id;
    this.email = email;
    this.qualification = qualification;
  }

  public Teacher() {
  }

  public Teacher(int teacher_id, String email, String qualification, String designation,
      int teaching_experience_in_years, String subject_taught,
      ArrayList<String> area_of_interest) {
    this.teacher_id = teacher_id;
    this.email = email;
    this.qualification = qualification;
    this.designation = designation;
    this.teaching_experience_in_years = teaching_experience_in_years;
    this.subject_taught = subject_taught;
    this.area_of_interest = area_of_interest;
  }

  public Teacher(int teacher_id, String email, String qualification, String designation,
      int teaching_experience_in_years, String subject_taught) {
    this.teacher_id = teacher_id;
    this.email = email;
    this.qualification = qualification;
    this.designation = designation;
    this.teaching_experience_in_years = teaching_experience_in_years;
    this.subject_taught = subject_taught;
  }

  //Factory method to create Teacher object
  public static Teacher getTeacher() {
    Teacher teacher = null;
    return teacher;
  }

  //Serialization and Deserialization

//  private void writeObject(ObjectOutputStream oos) throws IOException {
//    oos.defaultWriteObject();
//    oos.writeObject(address.getHouseNumber());
//  }
//
//  private void readObject(ObjectInputStream ois)
//      throws ClassNotFoundException, IOException {
//    ois.defaultReadObject();
//    Integer houseNumber = (Integer) ois.readObject();
//    Address a = new Address();
//    a.setHouseNumber(houseNumber);
//    this.setAddress(a);
//  }

  @Override
  public float ComputePayRoll(Teacher teacher) {
    int degree_rate = 0;
    switch (teacher.qualification) {
      case "phd":
        degree_rate = 112;
        break;
      case "master":
        degree_rate = 82;
        break;
      case "bachelor":
        degree_rate = 42;
        break;
    }
    float payroll = (float) ((32 * degree_rate * 2) * 0.85);
    return payroll;
  }

  //getters and setters


  public int getTeacher_id() {
    return teacher_id;
  }

  public void setTeacher_id(int teacher_id) {
    this.teacher_id = teacher_id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public int getTeaching_experience_in_years() {
    return teaching_experience_in_years;
  }

  public void setTeaching_experience_in_years(int teaching_experience_in_years) {
    this.teaching_experience_in_years = teaching_experience_in_years;
  }

  public String getSubject_taught() {
    return subject_taught;
  }

  public void setSubject_taught(String subject_taught) {
    this.subject_taught = subject_taught;
  }

  public ArrayList<String> getArea_of_interest() {
    return area_of_interest;
  }

  public void setArea_of_interest(ArrayList<String> area_of_interest) {
    this.area_of_interest = area_of_interest;
  }
}
