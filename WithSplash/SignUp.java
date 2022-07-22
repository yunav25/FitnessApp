package WithSplash;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SignUp extends JFrame implements ActionListener {

    Container container=getContentPane();
    JLabel NameLabel=new JLabel("FULL NAME");
    JLabel AgeLabel=new JLabel("AGE");
    JLabel WeightLabel=new JLabel("WEIGHT");
    JLabel HeightLabel=new JLabel("HEIGHT");
    JLabel userLabel=new JLabel("USERNAME");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
    JTextField userTextField=new JTextField();
    JTextField NameTextField=new JTextField();
    JTextField AgeTextField=new JTextField();
    JTextField WeightTextField=new JTextField();
    JTextField HeightTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JButton SignUpButton=new JButton("SIGN UP");
    JButton resetButton=new JButton("RESET");
    JCheckBox showPassword=new JCheckBox("Show Password");

    SignUp()
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
        NameLabel.setBounds(150,30, 100, 30);
        AgeLabel.setBounds(150,100, 100, 30);
        WeightLabel.setBounds(150,170, 100, 30);
        HeightLabel.setBounds(150,240, 100, 30);
        userLabel.setBounds(150,310,100,30);
        passwordLabel.setBounds(150,380,100,30);
        confirmPasswordLabel.setBounds(150, 450, 130, 30);
        
        NameTextField.setBounds(290,30,150,30);
        AgeTextField.setBounds(290,100,150,30);
        WeightTextField.setBounds(290,170,150,30);
        HeightTextField.setBounds(290,240,150,30);
        userTextField.setBounds(290,310,150,30);
        passwordField.setBounds(290,380,150,30);
        confirmPasswordField.setBounds(290, 450, 150, 30 );
        showPassword.setBounds(290,480,150,30);

        SignUpButton.setBounds(150,510,100,30);
        resetButton.setBounds(300,510,100,30);
  
    }

    public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(passwordLabel);
       container.add(userTextField);
       container.add(passwordField);
       container.add(confirmPasswordField);
       container.add(confirmPasswordLabel);
       container.add(showPassword);
       container.add(SignUpButton);
       container.add(resetButton);
       container.add(NameLabel);
       container.add(AgeLabel);
       container.add(WeightLabel);
       container.add(HeightLabel);
       container.add(AgeTextField);
       container.add(WeightTextField);
       container.add(HeightTextField);
       container.add(NameTextField);
      
   }

   public void addActionEvent()
   {
      //adding Action listener to components
       SignUpButton.addActionListener(this);
       resetButton.addActionListener(this);
       showPassword.addActionListener(this);
   }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        //Login button Script
        if (e.getSource() == SignUpButton) {
            String userText;
            String pwdText;
            String confirmPwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            confirmPwdText = confirmPasswordField.getText();

            if (!userText.equalsIgnoreCase("")) {
                if(pwdText == confirmPwdText){
                JOptionPane.showMessageDialog(this, "Sign Up Successful");
                Workout workout = new Workout();
                }
                
            } 
            else {
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
                confirmPasswordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
                confirmPasswordField.setEchoChar('*');
            }
 
 
        }
    }
    
}
