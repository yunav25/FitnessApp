package WithSplash;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Records {



    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    Records()
    {
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("Record Logs");
 
        // Data to be displayed in the JTable
        String[][] data = {
            { "Push Up","3","25", "30", "100" },
            { "Squats","3","25", "20", "60" }
        };
 
        // Column Names
        String[] columnNames = { "Exercises","Sets","Reps", "Duration", "Calories" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(500, 500, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new Records();
    }
}

