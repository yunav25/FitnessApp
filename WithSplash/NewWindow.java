
package WithSplash;




import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame{
	JFrame frame = new JFrame();
	Container container = getContentPane();

	JLabel Exerciselabel = new JLabel("Select Exercise");
	String exercise[] = {"Push Up", "Pull up", "Sit up", "Squat", "Bench press"};
<<<<<<< HEAD
	JComboBox combo = new JComboBox(exercise);
	
	JLabel Replabel = new JLabel("Enter Reps");
	JTextField Repfield = new JTextField();

	JLabel Setlabel = new JLabel("Enter Sets");
	JTextField Setfield = new JTextField();

	JLabel Durationlabel = new JLabel("Enter Duration");
	JTextField Durationfield = new JTextField();

	JLabel Calorielabel = new JLabel("Enter Calories");
	JTextField Caloriefield = new JTextField();

	
	
=======

	//JComboBox combo = new JComboBox(exercise);
>>>>>>> cd7612802d9febc2ad94eecb2b70f56efaf3242d
	JButton next = new JButton("Add");
	JButton submit = new JButton("Submit");

	JList<String> exerciseJList = new JList(exercise);
	

	String[] exercises = {"Push Up\", \"Pull up\", \"Sit up\", \"Squat\", \"Bench press"};
	
	JComboBox combo = new JComboBox(exercise);
	
	
	JList exerciselist = new JList(exercises);
	JScrollPane jcp = new JScrollPane(exerciselist);

	
	
	//constructor of newWindow() class
	public NewWindow(){
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();


		exerciselist.setVisibleRowCount(4);
		

		
		frame.getContentPane().setBackground(Color.getHSBColor(177, 240, 215));
		

	 	frame.add(Exerciselabel);
<<<<<<< HEAD
	 	frame.add(combo);
		
		frame.add(Replabel);
		frame.add(Repfield);
		frame.add(Setlabel);
		frame.add(Setfield);
		frame.add(Durationlabel);
		frame.add(Durationfield);
		frame.add(Calorielabel);
		frame.add(Caloriefield);

=======

	 	//frame.add(combo);
>>>>>>> cd7612802d9febc2ad94eecb2b70f56efaf3242d
	 	frame.add(next);
	 	frame.add(submit);
	 	

	 	frame.add(combo);
	 	frame.add(next);
	 	frame.add(submit);
	 	frame.add(jcp);

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
<<<<<<< HEAD
		exerciseJList.setVisibleRowCount(3);
		
		
	
		
		Exerciselabel.setBounds(5,20,100,25);
		combo.setBounds(5,30,100,20);
		Replabel.setBounds(120, 130, 75, 20);
		next.setBounds(400,300,100,25);
		submit.setBounds(300,230,100,25);
		exerciseJList.setBounds(400,130,100,25);
=======

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

		combo.setBounds(0,130,100,20);
		next.setBounds(145,130,100,25);
		submit.setBounds(300,230,100,25);
		jcp.setBounds(400,130,200,50);

>>>>>>> cd7612802d9febc2ad94eecb2b70f56efaf3242d
	}

	public void addComponentsToContainer(){
	
		
	 	container.add(Exerciselabel);
<<<<<<< HEAD
		container.add(Replabel);
		container.add(Repfield);
		container.add(Setlabel);
		container.add(Setfield);
		container.add(Durationlabel);
		container.add(Durationfield);
		container.add(Calorielabel);
		container.add(Caloriefield);
	 	container.add(combo);
=======
		container.add(combo);
	 	container.add(next);
	 	container.add(submit);
	 	container.add(jcp);
	 	//container.add(combo);
>>>>>>> cd7612802d9febc2ad94eecb2b70f56efaf3242d
	 	container.add(next);
	 	container.add(submit);
	 	container.add(exerciseJList);
	}


	 	
	}



	// public NewWindow() {
		
	// 	//setLayout(new FlowLayout(FlowLayout.CENTER, 20,40));
	// 	label.setBounds(0,0,100,50);
		
	// 	textField = CreateJTextField();
	// 	frame.add(textField);
	// 	frame.add(label);
	// 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 	frame.setSize(420,420);
	// 	frame.setLayout(null);
	// 	frame.setVisible(true);	
	// }
	// public JTextField CreateJTextField() {
	// 	JTextField textField = new JTextField(15);
	// 	textfield.setBounds(0,0,100,50);
		
	// 	return textField;
	// }