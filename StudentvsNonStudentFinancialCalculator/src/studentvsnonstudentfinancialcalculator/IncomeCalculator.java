
package studentvsnonstudentfinancialcalculator;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IncomeCalculator {
    // variables
    private double averageIncome;
    private Student currentStudent;
    private Student averageStudent;
    public IncomeCalculator(String filename, Student student) throws FileNotFoundException 
    {
        averageStudent = getAverageIncomeFromFile(filename);
        currentStudent = student;
    }
    
    
    private Student getAverageIncomeFromFile(String filename) throws FileNotFoundException 
    {
        // reading the file depinging on which check box is selected
        String line;
        File file = new File(filename); 
        Student averageStudentFile = new Student();
        Scanner fileReader = new Scanner(file);
        // reading file
        line = fileReader.nextLine();
        
        String titles[] = line.split(":");
        averageStudentFile.setIncome(Double.parseDouble(titles[1]));
        
        // seeing if the student check box is selected
        if (filename == "StudentAverage.txt")
        {
            line = fileReader.nextLine();
            titles = line.split(":");
            averageStudentFile.setTuition(Double.parseDouble(titles[1]));
        }
        else 
        {
            averageStudentFile.setTuition(0);
        }
        
        line = fileReader.nextLine();
        titles = line.split(":");
        averageStudentFile.setRent(Double.parseDouble(titles[1]));
        
        line = fileReader.nextLine();
        titles = line.split(":");
        averageStudentFile.setCar(Double.parseDouble(titles[1]));
        
        line = fileReader.nextLine();
        titles = line.split(":");
        averageStudentFile.setFood(Double.parseDouble(titles[1]));
        
        line = fileReader.nextLine();
        titles = line.split(":");
        averageStudentFile.setPhone(Double.parseDouble(titles[1]));
        
        line = fileReader.nextLine();
        titles = line.split(":");
        averageStudentFile.setUtilities(Double.parseDouble(titles[1]));
        
        fileReader.close();
        
        return averageStudentFile;
    }
  
    // getting ythe Current Student input variables
    public double getCurrentStudentAverage()
    {
        return getAverage(currentStudent);
    }
    
    // getting the average amount 
    private double getAverage(Student st)
    {
        double total = 0;
        total = st.getIncome();
        
        total -= st.getRent();
        total -= st.getCar();
        total -= st.getFood();
        total -= st.getPhone();
        total -= st.getUtilities();
        total -= st.getTuition();
        
       return total;  
    }

    // getting the average income for the student
    public double getAverageIncome() 
    {
        return getAverage(averageStudent);
    }

  // setting the average income for non-student
    public void setAverageIncome(double averageIncome)
    {
        this.averageIncome = averageIncome;
    }
}
