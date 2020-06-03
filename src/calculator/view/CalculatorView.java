package calculator.view;

import java.util.ArrayList;
import javax.swing.JButton;

public class CalculatorView extends javax.swing.JFrame {

    public CalculatorView() {
        initComponents();
        
        buttons.add(oneButton);
        buttons.add(twoButton);
        buttons.add(threeButton);
        buttons.add(fourButton);
        buttons.add(fiveButton);
        buttons.add(sixButton);
        buttons.add(sevenButton);
        buttons.add(eightButton);
        buttons.add(nineButton);
        buttons.add(zeroButton);
        
        buttons.add(clearMemoryButton);
        buttons.add(memoryMinusButton);
        buttons.add(memoryPlusButton);
        buttons.add(memoryRecallButton);
        
        buttons.add(divisionButton);
        buttons.add(changeSignButton);
        buttons.add(minusButton);
        buttons.add(multiplicationButton);
        buttons.add(percentageButton);
        buttons.add(plusButton);
        buttons.add(squareRootButton);
        buttons.add(commaButton);
        buttons.add(equalsButton);
    }
    
    private ArrayList buttons = new ArrayList();
    private boolean onOffState = false;
    private String displayText;
    private String operationType;
    private double value;
    private double memoryValue;
    private double operationValue;
    private static final int MAX_CHAR_LENGHT = 12;

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
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CalculatorView().setVisible(true);
        });
    }
    
    private void setDisplayText(String text) {
        /*if (text.length() > MAX_CHAR_LENGHT) {
            clearButtonActionPerformed(null);
        }
        else {*/
            displayField.setText(text);
            displayText = text;
        //}
        
        // deal with long value -> problem
    }
    
    private void setNumber(String text) {
        if ("0.0".equals(displayText)) displayText = text;
        else displayText += text;    
        value = Double.parseDouble(displayText);
        setDisplayText(String.valueOf(value));
    }
    
    private void performOperation(String type) {
        if ("sum".equals(type)) {
            if ("division".equals(operationType)) value = operationValue / value;
            else if ("multiplication".equals(operationType)) value = operationValue * value;
            else if ("deduction".equals(operationType)) value = operationValue - value;
            else if ("addition".equals(operationType)) value = operationValue + value;
        } else {
            operationType = type;
            operationValue = value;
            value = 0;
        }
        setDisplayText(String.valueOf(value));
        
        // repeat operations on repeated sums -> problem
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        minusButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        commaButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        percentageButton = new javax.swing.JButton();
        memoryRecallButton = new javax.swing.JButton();
        memoryMinusButton = new javax.swing.JButton();
        memoryPlusButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        batteries = new javax.swing.JPanel();
        displayField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        clearMemoryButton = new javax.swing.JButton();
        changeSignButton = new javax.swing.JButton();
        squareRootButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        minusButton.setBackground(new java.awt.Color(51, 51, 255));
        minusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minusButton.setForeground(new java.awt.Color(255, 255, 255));
        minusButton.setText("-");
        minusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minusButton.setEnabled(false);
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(255, 255, 255));
        oneButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        oneButton.setForeground(new java.awt.Color(102, 0, 51));
        oneButton.setText("1");
        oneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        oneButton.setEnabled(false);
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(255, 255, 255));
        twoButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        twoButton.setForeground(new java.awt.Color(102, 0, 51));
        twoButton.setText("2");
        twoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twoButton.setEnabled(false);
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(255, 255, 255));
        threeButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        threeButton.setForeground(new java.awt.Color(102, 0, 51));
        threeButton.setText("3");
        threeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        threeButton.setEnabled(false);
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        zeroButton.setBackground(new java.awt.Color(255, 255, 255));
        zeroButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        zeroButton.setForeground(new java.awt.Color(102, 0, 51));
        zeroButton.setText("0");
        zeroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zeroButton.setEnabled(false);
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        commaButton.setBackground(new java.awt.Color(51, 51, 255));
        commaButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        commaButton.setForeground(new java.awt.Color(255, 255, 255));
        commaButton.setText(".");
        commaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commaButton.setEnabled(false);
        commaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(51, 51, 255));
        equalsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equalsButton.setForeground(new java.awt.Color(255, 255, 255));
        equalsButton.setText("=");
        equalsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equalsButton.setEnabled(false);
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(102, 0, 51));
        plusButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        plusButton.setForeground(new java.awt.Color(255, 255, 255));
        plusButton.setText("+");
        plusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plusButton.setEnabled(false);
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        percentageButton.setBackground(new java.awt.Color(51, 51, 255));
        percentageButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        percentageButton.setForeground(new java.awt.Color(255, 255, 255));
        percentageButton.setText("%");
        percentageButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        percentageButton.setEnabled(false);
        percentageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentageButtonActionPerformed(evt);
            }
        });

        memoryRecallButton.setBackground(new java.awt.Color(51, 51, 255));
        memoryRecallButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        memoryRecallButton.setForeground(new java.awt.Color(255, 255, 255));
        memoryRecallButton.setText("MRC");
        memoryRecallButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryRecallButton.setEnabled(false);
        memoryRecallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryRecallButtonActionPerformed(evt);
            }
        });

        memoryMinusButton.setBackground(new java.awt.Color(51, 51, 255));
        memoryMinusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        memoryMinusButton.setForeground(new java.awt.Color(255, 255, 255));
        memoryMinusButton.setText("M-");
        memoryMinusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryMinusButton.setEnabled(false);
        memoryMinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryMinusButtonActionPerformed(evt);
            }
        });

        memoryPlusButton.setBackground(new java.awt.Color(51, 51, 255));
        memoryPlusButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        memoryPlusButton.setForeground(new java.awt.Color(255, 255, 255));
        memoryPlusButton.setText("M+");
        memoryPlusButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryPlusButton.setEnabled(false);
        memoryPlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryPlusButtonActionPerformed(evt);
            }
        });

        divisionButton.setBackground(new java.awt.Color(51, 51, 255));
        divisionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        divisionButton.setForeground(new java.awt.Color(255, 255, 255));
        divisionButton.setText("/");
        divisionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisionButton.setEnabled(false);
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(255, 255, 255));
        sevenButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(102, 0, 51));
        sevenButton.setText("7");
        sevenButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sevenButton.setEnabled(false);
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(255, 255, 255));
        eightButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eightButton.setForeground(new java.awt.Color(102, 0, 51));
        eightButton.setText("8");
        eightButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eightButton.setEnabled(false);
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(255, 255, 255));
        nineButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nineButton.setForeground(new java.awt.Color(102, 0, 51));
        nineButton.setText("9");
        nineButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nineButton.setEnabled(false);
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setBackground(new java.awt.Color(51, 51, 255));
        multiplicationButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        multiplicationButton.setForeground(new java.awt.Color(255, 255, 255));
        multiplicationButton.setText("X");
        multiplicationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multiplicationButton.setEnabled(false);
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(255, 255, 255));
        fourButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fourButton.setForeground(new java.awt.Color(102, 0, 51));
        fourButton.setText("4");
        fourButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourButton.setEnabled(false);
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        logoLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("Calculator");

        batteries.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout batteriesLayout = new javax.swing.GroupLayout(batteries);
        batteries.setLayout(batteriesLayout);
        batteriesLayout.setHorizontalGroup(
            batteriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        batteriesLayout.setVerticalGroup(
            batteriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        displayField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        displayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        displayField.setEnabled(false);

        clearButton.setBackground(new java.awt.Color(255, 51, 51));
        clearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("ON");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        clearMemoryButton.setBackground(new java.awt.Color(51, 51, 255));
        clearMemoryButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearMemoryButton.setForeground(new java.awt.Color(255, 255, 255));
        clearMemoryButton.setText("CE");
        clearMemoryButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearMemoryButton.setEnabled(false);
        clearMemoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMemoryButtonActionPerformed(evt);
            }
        });

        changeSignButton.setBackground(new java.awt.Color(51, 51, 255));
        changeSignButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        changeSignButton.setForeground(new java.awt.Color(255, 255, 255));
        changeSignButton.setText("+/-");
        changeSignButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeSignButton.setEnabled(false);
        changeSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSignButtonActionPerformed(evt);
            }
        });

        squareRootButton.setBackground(new java.awt.Color(51, 51, 255));
        squareRootButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        squareRootButton.setForeground(new java.awt.Color(255, 255, 255));
        squareRootButton.setText("root");
        squareRootButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squareRootButton.setEnabled(false);
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(255, 255, 255));
        fiveButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(102, 0, 51));
        fiveButton.setText("5");
        fiveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiveButton.setEnabled(false);
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(255, 255, 255));
        sixButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sixButton.setForeground(new java.awt.Color(102, 0, 51));
        sixButton.setText("6");
        sixButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sixButton.setEnabled(false);
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayField)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(commaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                    .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearMemoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(squareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(memoryRecallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoryMinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(memoryPlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(batteries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(squareRootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(percentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearMemoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memoryRecallButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(memoryMinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(memoryPlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addComponent(divisionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(multiplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(commaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        onOffState = !onOffState;
        if (onOffState) {
            clearButton.setText("OFF");
            displayText = "0.0";
        }
        else {
            clearButton.setText("ON");
            displayText = "";
        }
        setDisplayText(displayText);
        value = 0;
        memoryValue = 0;
        operationValue = 0;
        operationType = "";
        buttons.forEach((button) -> {((JButton) button).setEnabled(onOffState);});
    }//GEN-LAST:event_clearButtonActionPerformed

    private void clearMemoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMemoryButtonActionPerformed
        memoryValue = 0;
        
        // make zeroes -> problem
    }//GEN-LAST:event_clearMemoryButtonActionPerformed

    private void changeSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSignButtonActionPerformed
//        value = Double.parseDouble(String.valueOf((value * -1)));
        value *= -1;
        setDisplayText(String.valueOf(value));
        
        // minus value + number -> problem
    }//GEN-LAST:event_changeSignButtonActionPerformed

    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
        value = Math.sqrt(value);
        setDisplayText(String.valueOf(value));
        
        //account for minus values -> problem
    }//GEN-LAST:event_squareRootButtonActionPerformed

    private void percentageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentageButtonActionPerformed
        value /= 100;
        setDisplayText(String.valueOf(value));
    }//GEN-LAST:event_percentageButtonActionPerformed

    private void memoryRecallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryRecallButtonActionPerformed
        value = memoryValue;
        setDisplayText(String.valueOf(value));
    }//GEN-LAST:event_memoryRecallButtonActionPerformed

    private void memoryMinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryMinusButtonActionPerformed
        memoryValue -= Double.parseDouble(displayText);
    }//GEN-LAST:event_memoryMinusButtonActionPerformed

    private void memoryPlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryPlusButtonActionPerformed
        memoryValue += Double.parseDouble(displayText);
    }//GEN-LAST:event_memoryPlusButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        performOperation("division");
        
        // make compatible with other operations -> problem
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        performOperation("multiplication");
        
        // make compatible with other operations -> problem
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        performOperation("deduction");
        
        // make compatible with other operations -> problem
    }//GEN-LAST:event_minusButtonActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        performOperation("addition");
        
        // make compatible with other operations -> problem
    }//GEN-LAST:event_plusButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        performOperation("sum");
        
        // make compatible with other operations -> problem
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void commaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaButtonActionPerformed
        
        // find a good use -> problem
    }//GEN-LAST:event_commaButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        setNumber("0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        setNumber("1");
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        setNumber("2");
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        setNumber("3");
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        setNumber("4");
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        setNumber("5");
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        setNumber("6");
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        setNumber("7");
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        setNumber("8");
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        setNumber("9");
    }//GEN-LAST:event_nineButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel batteries;
    private javax.swing.JButton changeSignButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton clearMemoryButton;
    private javax.swing.JButton commaButton;
    private javax.swing.JTextField displayField;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton memoryMinusButton;
    private javax.swing.JButton memoryPlusButton;
    private javax.swing.JButton memoryRecallButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton percentageButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton squareRootButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
