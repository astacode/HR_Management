package GUI;

import static java.awt.Label.CENTER;

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Register extends Frame implements ActionListener{

  JFrame register_frame=null;
  Register()
  {
    JFrame register_frame=new JFrame();

    JLabel label1=new JLabel("Welcome to XYZ College");
    label1.setBounds(20, 50, 350, 20);
    label1.setHorizontalAlignment(SwingConstants. CENTER);
   // label1.setAlignmentX(Component.CENTER_ALIGNMENT);
   // label1.getHorizontalTextPosition(JLabel.);
    JLabel label2=new JLabel("This portal is functional for college teachers and staff only");
    label2.setBounds(20, 80, 500, 20);



    JButton login = new JButton("Login");
    login.setBounds(80, 130, 100, 30);

    JButton register = new JButton("Register");
    register.setBounds(210, 130, 100, 30);

    register_frame.add(label1);
    register_frame.add(label2);
    register_frame.add(login);
    register_frame.add(register);

    login.addActionListener(this);


    register_frame.setSize(420, 240);
    register_frame.setLayout(null);
    register_frame.setVisible(true);

  }
  public void actionPerformed(ActionEvent e) {
    try{
      CollegeGUI college = new CollegeGUI();
      college.setVisible(true);
      register_frame.setVisible(false);
    }catch(Exception ex){System.out.println(ex);}
  }
  public static void main(String[] args) {

    Register register = new Register();


  }

}
