import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Workout extends JFrame {

    public Workout() {
        setLayout(new GridLayout(8, 3));
        // Labels
        add(new JLabel("Workout"));
        add(new JLabel("Sets"));
        add(new JLabel("Reps"));
    }

    public static void main(String[] args) throws Exception {
        // Get current date information
        Calendar cal = Calendar.getInstance();
        // Set format to month/day/year hours:minutes
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy HH:mm a");

        // Creates file object and sets pointer
        File file = new File("Workout Log.txt"); // File name + path
        // Ensures file exists and is not a directory
        if (!file.exists() || file.isDirectory()) {
            PrintWriter writer = new PrintWriter("Workout Log.txt", "UTF-8");
            writer.close();
        }

        // Write to file without overwriting current contents
        final PrintWriter output = new PrintWriter(new FileWriter(file, true));
        output.println("\n" + sdf.format(cal.getTime())); // Add date to file
        // Create Frame
        JFrame frame = new Workout();
        frame.setTitle("My Fitness Tracker");
        /* Commented out for CR
        frame.setIconImage(new ImageIcon("Images/Muscle.png").getImage()); */

        // workout, set, and rep fields for data
        final JLabel[] workouts = {
            new JLabel("Push ups"),
            new JLabel("Pull Ups"),
            new JLabel("Squat"),
            new JLabel("Sit Up"),
            new JLabel("Bench Press"),
        };
        final JTextField[] sets = new JTextField[5];
        final JTextField[] reps = new JTextField[5];

        // add textfield pointers + add textfields to frame
        for (int i = 0; i < 5; i++) {
            frame.add(workouts[i]);
            sets[i] = new JTextField();
            frame.add(sets[i]);
            reps[i] = new JTextField();
            frame.add(reps[i]);
        }

        // Create checkboxes
        final JCheckBox abs = new JCheckBox("Abs?");
        final JCheckBox squat = new JCheckBox("Squats?");
        // Create Listener
        ActionListener checkListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == abs) {
                    if (abs.isSelected()) {
                        output.println("Ab Workout app used!");
                    }
                }
                else if (e.getSource() == squat) {
                    if (squat.isSelected()) {
                        output.println("Squat Workout app used!");
                    }
                }
            }
        };
        // Register listener with checkboxes
        abs.addActionListener(checkListener);
        squat.addActionListener(checkListener);
        // Add checkboxes to frame
        frame.add(abs);
        frame.add(squat);
        JButton log = new JButton("Log"); // To log everything
        // Register + create Event Listener
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 5; i++) {
                    // Checks if fields are populated
                    if (sets[i].getText().length() > 0 && reps[i].getText().length() > 0) {
                        if (Integer.parseInt(sets[i].getText()) > 0 && Integer.parseInt(reps[i].getText()) > 0) {
                            output.println(
                                sets[i].getText() + " x " + reps[i].getText() +
                                " " + workouts[i].getText()
                            );
                        }
                    }
                }
                output.close();

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException i) {
                    i.printStackTrace();
                }
                System.exit(0);
            }
        });

        frame.add(log);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}