import java.awt.*;
import java.util.*;
import javax.swing.*;

public class FitnessApp extends JFrame{
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;

	private JList exerciseJList;	
	
	private JTextField textfield1;
	private JTextField textfield2;
    private JTextField textfield3;
    ;
	
	public FitnessApp() {
		super("Fitness App");
		setLayout(new FlowLayout(FlowLayout.CENTER, 20,40));
		label1= new JLabel("Name");
       	label1.setToolTipText("Enter Name: ");
		add(label1);

		textfield1 = new JTextField(15);
		textfield1.setBounds(10,100, 75,75); 
		add(textfield1);

		label2= new JLabel("Age", SwingConstants.LEFT);
        label2.setToolTipText("Enter Age");
		add(label2);
		textfield2 = new JTextField(5);
		add(textfield2);

        label3= new JLabel("Weight", SwingConstants.LEFT);
        label3.setToolTipText("Enter Weight");
		add(label3);
		textfield3 = new JTextField(10);
		add(textfield3);

        String exercise[] = {"Push Up", "Pull up", "Sit up", "Squat", "Bench press"};

        JComboBox combo = new JComboBox(exercise);
        label4= new JLabel("Exercise", SwingConstants.LEFT);
		add(label4);
        add(combo);

		JButton next = new JButton("Add");
		add(next);
		
		exerciseJList = new JList(exercise);
		exerciseJList.setVisibleRowCount(3);
		add(new JScrollPane(exerciseJList));

		JButton submit = new JButton("Submit");
		add(submit);        
    }


        public static void main(String[] args) {
            FitnessApp labelLayout= new FitnessApp();
            labelLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            labelLayout.setSize(600,320);
            labelLayout.setVisible(true);
			labelLayout.getContentPane().setBackground(Color.getHSBColor(177, 240, 215));
        }

}
