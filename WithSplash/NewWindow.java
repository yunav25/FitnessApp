package WithSplash;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame{
	JFrame frame = new JFrame();
	Container container = getContentPane();

	JLabel Exerciselabel = new JLabel("Select Exercise");
	String exercise[] = {"Push Up", "Pull up", "Sit up", "Squat", "Bench press"};
	JComboBox combo = new JComboBox(exercise);
	
	JLabel Replabel = new JLabel("Enter Reps");
	JTextField Repfield = new JTextField();

	JLabel Setlabel = new JLabel("Enter Sets");
	JTextField Setfield = new JTextField();

	JLabel Durationlabel = new JLabel("Enter Duration");
	JTextField Durationfield = new JTextField();

	JLabel Calorielabel = new JLabel("Enter Calories");
	JTextField Caloriefield = new JTextField();

	
	
	JButton next = new JButton("Add");
	JButton submit = new JButton("Submit");

	JList<String> exerciseJList = new JList(exercise);
	
	
	
	//constructor of newWindow() class
	public NewWindow(){
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		
		frame.getContentPane().setBackground(Color.getHSBColor(177, 240, 215));
		

	 	frame.add(Exerciselabel);
	 	frame.add(combo);
		
		frame.add(Replabel);
		frame.add(Repfield);
		frame.add(Setlabel);
		frame.add(Setfield);
		frame.add(Durationlabel);
		frame.add(Durationfield);
		frame.add(Calorielabel);
		frame.add(Caloriefield);

	 	frame.add(next);
	 	frame.add(submit);
	 	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1200,400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void setLayoutManager(){
		container.setLayout(null);
	}

	public void setLocationAndSize(){
		exerciseJList.setVisibleRowCount(3);
		
		
	
		
		Exerciselabel.setBounds(5,20,100,25);
		combo.setBounds(5,30,100,20);
		Replabel.setBounds(120, 130, 75, 20);
		next.setBounds(400,300,100,25);
		submit.setBounds(300,230,100,25);
		exerciseJList.setBounds(400,130,100,25);
	}

	public void addComponentsToContainer(){
	
		
	 	container.add(Exerciselabel);
		container.add(Replabel);
		container.add(Repfield);
		container.add(Setlabel);
		container.add(Setfield);
		container.add(Durationlabel);
		container.add(Durationfield);
		container.add(Calorielabel);
		container.add(Caloriefield);
	 	container.add(combo);
	 	container.add(next);
	 	container.add(submit);
	 	container.add(exerciseJList);
	}

}
