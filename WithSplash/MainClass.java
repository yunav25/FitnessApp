package WithSplash;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args){
        new FitnessAppSplashScreen();//Creating object of SplashScreenDemo class

            //Creating object of LoginFrame class and setting some of its properties
            SignUp frame=new SignUp();
            frame.setTitle("Sign Up Form");
            frame.setVisible(true);
            frame.setSize(700,800);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);

            
 
    }
}
