package WithSplash;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame{
	JFrame frame = new JFrame();
	Container container = getContentPane();
	JLabel usernamelabel = new JLabel("Enter Username");
	JTextField usernamefield = new JTextField();
	JLabel Agelabel = new JLabel("Enter Age");
	JTextField Agefield = new JTextField();
	JLabel Weightlabel = new JLabel("Enter Weight");
	JTextField Weightfield = new JTextField();
	JLabel Exerciselabel = new JLabel("Enter Exercise");
	String exercise[] = {"Push Up", "Pull up", "Sit up", "Squat", "Bench press"};
	//JComboBox combo = new JComboBox(exercise);
	JButton next = new JButton("Add");
	JButton submit = new JButton("Submit");
	//JList<String> exerciseJList = new JList(exercise);
	
	
	
	//constructor of newWindow() class
	public NewWindow(){
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		
		frame.getContentPane().setBackground(Color.getHSBColor(177, 240, 215));
		frame.add(usernamelabel);
	 	frame.add(usernamefield);
	 	frame.add(Agelabel);
	 	frame.add(Agefield);
	 	frame.add(Weightlabel);
	 	frame.add(Weightfield);
	 	frame.add(Exerciselabel);
	 	//frame.add(combo);
	 	frame.add(next);
	 	frame.add(submit);
	 	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600,400);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void setLayoutManager(){
		container.setLayout(null);
	}

	public void setLocationAndSize(){
		//exerciseJList.setVisibleRowCount(3);
		
		
		usernamelabel.setBounds(0,0,100,25);
		usernamefield.setBounds(0,40,100,20);
		Agelabel.setBounds(145,0,100,25);
		Agefield.setBounds(145,40,100,20);
		Weightlabel.setBounds(300,0,100,25);
		Weightfield.setBounds(300,40,100,20);
		Exerciselabel.setBounds(0,100,100,25);
		//combo.setBounds(0,130,100,20);
		next.setBounds(145,130,100,25);
		submit.setBounds(300,230,100,25);
		//exerciseJList.setBounds(400,130,100,25);
	}

	public void addComponentsToContainer(){
		container.add(usernamelabel);
		container.add(usernamefield);
		container.add(Agelabel);
		container.add(Agefield);
		container.add(Weightlabel);
	 	container.add(Weightfield);
	 	container.add(Exerciselabel);
	 	//container.add(combo);
	 	container.add(next);
	 	container.add(submit);
	 	//container.add(exerciseJList);
	}

}
