
package studentvsnonstudentfinancialcalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class StudentVsNotStudent extends javax.swing.JFrame {

    /**
     * Creates new form StudentVsNotStudent
     */
    public StudentVsNotStudent() 
    {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneTxt = new javax.swing.JTextField();
        utilitiesTxt = new javax.swing.JTextField();
        tuitionTxt = new javax.swing.JTextField();
        Student = new javax.swing.JCheckBox();
        nonStudent = new javax.swing.JCheckBox();
        intro = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        Monthly = new javax.swing.JLabel();
        monthlyTxt = new javax.swing.JTextField();
        rent = new javax.swing.JLabel();
        car = new javax.swing.JLabel();
        foodTxt = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tuition = new javax.swing.JLabel();
        mortgageTxt = new javax.swing.JTextField();
        carTxt = new javax.swing.JTextField();
        groceryTxt = new javax.swing.JTextField();
        txtAverageMonth = new javax.swing.JTextField();
        txtAverageTuition = new javax.swing.JTextField();
        txtAverageRent = new javax.swing.JTextField();
        txtAverageCar = new javax.swing.JTextField();
        txtAverageFood = new javax.swing.JTextField();
        txtAveragePhone = new javax.swing.JTextField();
        txtAverageUtilites = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Student.setText("Student");
        Student.setToolTipText("");

        nonStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nonStudent.setText("Non-Student");
        nonStudent.setToolTipText("");

        intro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        intro.setText("Select Student or Non-Student\n to see if you are paying the \naverage amount in Utah ");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        Monthly.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Monthly.setText("Enter in How much you make a month: ");

        rent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rent.setText("Mortgage/rent a month:");

        car.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        car.setText("Car Payment a month: ");

        foodTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        foodTxt.setText("Groceries/food a month: ");

        phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phone.setText("Phone bill a month: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Utilities a month: ");

        tuition.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tuition.setText("Tuition a month if applicable: ");

        carTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carTxtActionPerformed(evt);
            }
        });

        txtAverageMonth.setToolTipText("");
        txtAverageMonth.setCaretColor(new java.awt.Color(255, 255, 255));
        txtAverageMonth.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageMonth.setEnabled(false);
        txtAverageMonth.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtAverageMonth.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtAverageTuition.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageTuition.setEnabled(false);

        txtAverageRent.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageRent.setEnabled(false);

        txtAverageCar.setEditable(false);
        txtAverageCar.setBackground(new java.awt.Color(255, 255, 255));
        txtAverageCar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageCar.setEnabled(false);

        txtAverageFood.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageFood.setEnabled(false);

        txtAveragePhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAveragePhone.setEnabled(false);

        txtAverageUtilites.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAverageUtilites.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calculate)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(intro)
                        .addGap(76, 76, 76))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(Student)
                        .addGap(116, 116, 116)
                        .addComponent(nonStudent))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rent)
                                .addGap(18, 18, 18)
                                .addComponent(mortgageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Monthly)
                                    .addGap(18, 18, 18)
                                    .addComponent(monthlyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(car)
                                        .addComponent(tuition)
                                        .addComponent(foodTxt)
                                        .addComponent(phone)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tuitionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(carTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(groceryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(utilitiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAverageTuition, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverageMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverageRent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverageFood, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAveragePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAverageUtilites, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(intro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nonStudent)
                    .addComponent(Student))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Monthly)
                    .addComponent(monthlyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAverageMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tuitionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tuition))
                    .addComponent(txtAverageTuition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rent)
                    .addComponent(mortgageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAverageRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(car)
                    .addComponent(txtAverageCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groceryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodTxt)
                    .addComponent(txtAverageFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone)
                    .addComponent(txtAveragePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utilitiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAverageUtilites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculate)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carTxtActionPerformed
        
    }//GEN-LAST:event_carTxtActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // seeing if Student is selceted or not
        String filename = Student.isSelected() ? "StudentAverage.txt" : "Average.txt";
        Student st = new Student();
        
        try{
        //grabbing the text from the text fileds and comparing
        st.setFood(Double.parseDouble(groceryTxt.getText()));
        st.setCar(Double.parseDouble(carTxt.getText()));
        st.setPhone(Double.parseDouble(phoneTxt.getText())); 
        st.setIncome(Double.parseDouble(monthlyTxt.getText()));
        st.setTuition(Double.parseDouble(tuitionTxt.getText()));
        st.setRent(Double.parseDouble(mortgageTxt.getText()));
        st.setUtilities(Double.parseDouble(utilitiesTxt.getText()));
        try {
            // calling the classes and and doing the calculations 
            IncomeCalculator IC = new IncomeCalculator(filename, st);
            double percent = (IC.getCurrentStudentAverage() / IC.getAverageIncome()) * 100; 
            
            // output
            JOptionPane.showMessageDialog(null, String.format("Average Percent you pay is %.2f  percent of Utah average", percent )); 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentVsNotStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter in a correct number");
        }
        
        // putting in the average text box to compare what the user puts in
        if(Student.isSelected())
        {
            // Making the code to read from the file and grab the numbers after the :
            String line;
            File file = new File("StudentAverage.txt");
            Double[] prices = new Double[7];
            try {
                Scanner fileReader = new Scanner(file);
                int i = 0;
                while(fileReader.hasNext())
                {
                   line = fileReader.nextLine();
                   String averages[] = line.split(":");
                   prices[i] = Double.parseDouble(averages[1]);
                   i++;
                }
                // putting the txt in the filed box to compare
                txtAverageMonth.setText(prices[0].toString());
                txtAverageTuition.setText(prices[1].toString());
                txtAverageRent.setText(prices[2].toString());
                txtAverageCar.setText(prices[3].toString());
                txtAverageFood.setText(prices[4].toString());
                txtAveragePhone.setText(prices[5].toString());
                txtAverageUtilites.setText(prices[6].toString());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentVsNotStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            // Making the code to read from the file and grab the numbers after the :
            String line;
            File file = new File("Average.txt");
            Double[] prices = new Double[6];
            try {
                Scanner fileReader = new Scanner(file);
                int i = 0;
                while(fileReader.hasNext())
                {
                   line = fileReader.nextLine();
                   String averages[] = line.split(":");
                   prices[i] = Double.parseDouble(averages[1]);
                   i++;
                }
                // putting the txt in the filed box to compare
                txtAverageMonth.setText(prices[0].toString());
                txtAverageRent.setText(prices[1].toString());
                txtAverageCar.setText(prices[2].toString());
                txtAverageFood.setText(prices[3].toString());
                txtAveragePhone.setText(prices[4].toString());
                txtAverageUtilites.setText(prices[5].toString());
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(StudentVsNotStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_calculateActionPerformed

   
    public static void main(String args[]) throws FileNotFoundException  
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentVsNotStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentVsNotStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentVsNotStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentVsNotStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            
            public void run() 
            {
                new StudentVsNotStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Monthly;
    private javax.swing.JCheckBox Student;
    private javax.swing.JButton calculate;
    private javax.swing.JLabel car;
    private javax.swing.JTextField carTxt;
    private javax.swing.JLabel foodTxt;
    private javax.swing.JTextField groceryTxt;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField monthlyTxt;
    private javax.swing.JTextField mortgageTxt;
    private javax.swing.JCheckBox nonStudent;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel rent;
    private javax.swing.JLabel tuition;
    private javax.swing.JTextField tuitionTxt;
    private javax.swing.JTextField txtAverageCar;
    private javax.swing.JTextField txtAverageFood;
    private javax.swing.JTextField txtAverageMonth;
    private javax.swing.JTextField txtAveragePhone;
    private javax.swing.JTextField txtAverageRent;
    private javax.swing.JTextField txtAverageTuition;
    private javax.swing.JTextField txtAverageUtilites;
    private javax.swing.JTextField utilitiesTxt;
    // End of variables declaration//GEN-END:variables
}
