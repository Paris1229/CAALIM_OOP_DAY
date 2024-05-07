/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author Paris
 */
public class Calculator extends javax.swing.JFrame {

    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public Calculator() {
        initComponents();
    }
    private void EnterNumbers(String q){
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnBS = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnPeriod = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jbtnBS.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnBS.setText("←");
        jbtnBS.setName(""); // NOI18N
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });

        jbtnPM.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnPM.setText("±");
        jbtnPM.setName(""); // NOI18N
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });

        jbtnCE.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.setName(""); // NOI18N
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });

        jbtnC.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setName(""); // NOI18N
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnDigit7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnDigit7.setName(""); // NOI18N
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });

        jbtnDigit8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.setName(""); // NOI18N
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });

        jbtnDigit9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.setName(""); // NOI18N
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });

        jbtnPlus.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnPlus.setName(""); // NOI18N
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtnDigit4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.setName(""); // NOI18N
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });

        jbtnDigit5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.setName(""); // NOI18N
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });

        jbtnDigit6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.setName(""); // NOI18N
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });

        jbtnMinus.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.setName(""); // NOI18N
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtnDigit1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.setName(""); // NOI18N
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });

        jbtnDigit2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.setName(""); // NOI18N
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });

        jbtnDigit3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.setName(""); // NOI18N
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });

        jbtnMultiply.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnMultiply.setText("*");
        jbtnMultiply.setName(""); // NOI18N
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });

        jbtnDigit0.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.setName(""); // NOI18N
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });

        jbtnPeriod.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnPeriod.setText(".");
        jbtnPeriod.setName(""); // NOI18N
        jbtnPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPeriodActionPerformed(evt);
            }
        });

        jbtnEqual.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.setName(""); // NOI18N
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtnDivide.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jbtnDivide.setText("/");
        jbtnDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnDivide.setName(""); // NOI18N
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtxtResult)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnBS, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jbtnBS.getAccessibleContext().setAccessibleName("");
        jbtnPM.getAccessibleContext().setAccessibleName("");
        jbtnCE.getAccessibleContext().setAccessibleName("");
        jbtnC.getAccessibleContext().setAccessibleName("");
        jbtnDigit7.getAccessibleContext().setAccessibleName("");
        jbtnDigit8.getAccessibleContext().setAccessibleName("");
        jbtnDigit9.getAccessibleContext().setAccessibleName("");
        jbtnPlus.getAccessibleContext().setAccessibleName("");
        jbtnDigit4.getAccessibleContext().setAccessibleName("");
        jbtnDigit5.getAccessibleContext().setAccessibleName("");
        jbtnDigit6.getAccessibleContext().setAccessibleName("");
        jbtnMinus.getAccessibleContext().setAccessibleName("");
        jbtnDigit1.getAccessibleContext().setAccessibleName("");
        jbtnDigit2.getAccessibleContext().setAccessibleName("");
        jbtnDigit3.getAccessibleContext().setAccessibleName("");
        jbtnMultiply.getAccessibleContext().setAccessibleName("");
        jbtnDigit0.getAccessibleContext().setAccessibleName("");
        jbtnPeriod.getAccessibleContext().setAccessibleName("");
        jbtnEqual.getAccessibleContext().setAccessibleName("");
        jbtnDivide.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText(""); 
        op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText(""); 
        op = "*";
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText(""); 
        op = "/";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText(""); 
        op = "-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtResult.setText("");

    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jtxtResult.setText("");
        String Fn, Sn;
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = ""; 
        Sn = "";
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        Double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
            nums = nums *(-1);
            jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        if (op == "+"){
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
            
        }
        else if (op == "-"){
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if (op == "*"){
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
        else if (op == "/"){
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        String backSp = null;
        if(jtxtResult.getText().length()> 0){
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText(). length() -1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
            
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPeriodActionPerformed
        if (!jtxtResult.getText().contains(".")){
        jtxtResult.setText(jtxtResult.getText() + jbtnPeriod.getText());
        }
    }//GEN-LAST:event_jbtnPeriodActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPeriod;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
