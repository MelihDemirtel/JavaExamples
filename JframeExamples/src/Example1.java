/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author EXT02D47194
 */
public class Example1 extends javax.swing.JFrame {

    /**
     * Creates new form Example1
     */
    public Example1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResult = new javax.swing.JLabel();
        btnSumming = new javax.swing.JButton();
        btnExraction = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        btnExample2Page = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblResult.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("RESULT");
        lblResult.setBorder(new javax.swing.border.MatteBorder(null));

        btnSumming.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSumming.setText("+");
        btnSumming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummingActionPerformed(evt);
            }
        });

        btnExraction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExraction.setText("-");
        btnExraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExractionActionPerformed(evt);
            }
        });

        btnMultiplication.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnDivision.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        txtNumber1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txtNumber2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnExample2Page.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExample2Page.setText("Example2 Page -->");
        btnExample2Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExample2PageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSumming)
                            .addComponent(btnMultiplication))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExraction)
                            .addComponent(btnDivision))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExample2Page)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblResult)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumming)
                    .addComponent(btnExraction))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplication)
                    .addComponent(btnDivision)
                    .addComponent(btnExample2Page))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSummingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummingActionPerformed
        double number1 = Integer.valueOf(txtNumber1.getText());
        double number2 = Integer.valueOf(txtNumber2.getText());
        
        double result = number1 + number2;
        
        lblResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnSummingActionPerformed

    private void btnExractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExractionActionPerformed
        double number1 = Integer.valueOf(txtNumber1.getText());
        double number2 = Integer.valueOf(txtNumber2.getText());
        
        double result = number1 - number2;
        
        lblResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnExractionActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        double number1 = Integer.valueOf(txtNumber1.getText());
        double number2 = Integer.valueOf(txtNumber2.getText());
        
        double result = number1 * number2;
        
        lblResult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        double number1 = Integer.valueOf(txtNumber1.getText());
        double number2 = Integer.valueOf(txtNumber2.getText());
        
        try{
            double result = number1 / number2;
            lblResult.setText(String.valueOf(result));
        }catch(ArithmeticException e){
            lblResult.setText(e.getMessage());
        }
       
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnExample2PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExample2PageActionPerformed
            Example2 example2 = new Example2();
            example2.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnExample2PageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Example1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Example1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Example1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Example1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Example1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExample2Page;
    private javax.swing.JButton btnExraction;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnSumming;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    // End of variables declaration//GEN-END:variables
}
