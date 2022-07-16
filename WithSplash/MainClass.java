package WithSplash;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args){
        new FitnessAppSplashScreen();//Creating object of SplashScreenDemo class

            //Creating object of LoginFrame class and setting some of its properties
            FitnessLoginFrame frame=new FitnessLoginFrame();
            frame.setTitle("Login Form");
            frame.setVisible(true);
            frame.setBounds(10,10,370,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
 
    }
}
