package WithSplash;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 //testing
//Creating LoginFrame class
public class FitnessLoginFrame extends JFrame implements ActionListener {

    Container container=getContentPane();
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JTextField userTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JButton loginButton=new JButton("LOGIN");
    JButton resetButton=new JButton("RESET");
    JCheckBox showPassword=new JCheckBox("Show Password");
 
    //Creating constructor of LoginFrame() class
    FitnessLoginFrame()
    {
        //Calling setLayoutManger() method inside the constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();//calling addActionEvent() method
    }

    public void setLayoutManager()
   {
       //Setting layout manager of Container to null
       container.setLayout(null);
   }

   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,30);
       passwordLabel.setBounds(50,220,100,30);
       userTextField.setBounds(150,150,150,30);
       passwordField.setBounds(150,220,150,30);
       showPassword.setBounds(150,250,150,30);
       loginButton.setBounds(50,300,100,30);
       resetButton.setBounds(200,300,100,30);
 
   }

   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(showPassword);
       container.add(loginButton);
       container.add(resetButton);
   }
 
   public void addActionEvent()
   {
      //adding Action listener to components
       loginButton.addActionListener(this);
       resetButton.addActionListener(this);
       showPassword.addActionListener(this);
   }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        //Login button Script
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("fitness") && pwdText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                Workout workout = new Workout();
                
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Reset button Script
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
       //showPassword button script
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
}