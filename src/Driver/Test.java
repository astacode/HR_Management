package Driver;

import Assets.Teacher_Qualification;
import Organization.Department;
import Person.Staff.Cleaner;
import Person.Staff.Course_Coordinator;
import Person.Staff.Lab_Technician;
import Person.Staff.Staff;
import Person.Teacher.Dean.Dean;
import Person.Teacher.Teacher;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

  public static void main(String[] args) {

    //Swing code

//    JFrame f = new JFrame("XYZ College");//creating instance of JFrame
//
//    JButton b = new JButton("click");//creating instance of JButton
//    b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
//
//    f.add(b);//adding button in JFrame
//    f.setSize(400, 500);//400 width and 500 height
//    f.setLayout(null);//using no layout managers
//    f.setVisible(true);//making the frame visible

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Let's add cse_teachers

    Teacher teacher1 = new Teacher(2, "rohit@gmail.com", Teacher_Qualification.Bachelor.toString());
    Teacher teacher2 = new Teacher(3, "dinesh@gmail.com", Teacher_Qualification.PHD.toString());
    Teacher teacher3 = new Teacher(4, "roshan@gmail.com", Teacher_Qualification.Master.toString());

    //List of cse_teachers

    ArrayList<Teacher> cse_teachers = new ArrayList<Teacher>();
    cse_teachers.add(teacher1);
    cse_teachers.add(teacher2);
    cse_teachers.add(teacher3);

    //Add Dean
    Dean cse_dean = new Dean(1, "prasad@gmail.com");

    //Add Staff
    Staff staff1 = new Cleaner(101, "cleaning", 18);
    Staff staff2 = new Course_Coordinator(201, "course coordination", 30);
    Staff staff3 = new Lab_Technician(301, "handle technical issues", 30);

    //List of Staff
    ArrayList<Staff> cse_staff = new ArrayList<Staff>();
    cse_staff.add(staff1);
    cse_staff.add(staff2);
    cse_staff.add(staff3);

    //Create a department, suppose CSE
    Department department = new Department("CSE", 1, cse_teachers, cse_dean, cse_staff);

    //Test Serialization

    try {
      FileOutputStream fos = new FileOutputStream("saved.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(department);
      oos.flush();
      oos.close();
      System.out.println("Success");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    //Test deserialization
    try {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("saved.txt"));
      Department dd = (Department) ois.readObject();
      System.out.println(dd);
//      for (Teacher i : dd.getTeacher_list()) {
//        System.out.println(i.getTeacher_id() + " " + i.getEmail() + " " + i.getQualification());
//      }
      System.out.println("Success");
      ois.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    //Serializing Object to XML
//    XMLEncoder encoder = null;
//    try {
//      //encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("save.xml")));
//      encoder = new XMLEncoder(new FileOutputStream("save.xml"));
//      encoder.writeObject(department);
//      encoder.close();
//    } catch (FileNotFoundException fileNotFound) {
//      System.out.println("ERROR: While Creating or Opening the File save.xml");
//    }
//    catch(IOException e)
//    {
//      e.printStackTrace();
//    }

    //Deserializing Object to XML
//    XMLDecoder decoder = null;
//    try {
//      decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("save.xml")));
//      Department saved_department = (Department) decoder.readObject();
//      System.out.println(saved_department);
//    } catch (
//        FileNotFoundException e) {
//      System.out.println("ERROR: File save.xml not found");
//    }
  }
}
