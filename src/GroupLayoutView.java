import javax.swing.*;

/**
 * @author cdepner
 */
public class GroupLayoutView implements CalculatorView {

    private JFrame frame;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision, buttonE;
    private JButton buttonBracketsClose, buttonBracketsOpen, buttonComma, buttonPi, buttonEnter;
    private JButton buttonClear, buttonMemoryRecall, buttonMemorySave;
    private JLabel calculationLabel, resultLabel;

    /**
     * Entry point view
     */
    public void setVisibility(boolean status) {
        frame.setVisible(status);
    }

    /**
     * View initialisation
     */
    public void initComponents() {
        frame = new JFrame();
        JPanel numbersPanel, Result, calculationPanel, calculatorPanel, controlPanel;
        Result = new javax.swing.JPanel();
        resultLabel = new javax.swing.JLabel();
        calculationLabel = new javax.swing.JLabel();
        calculatorPanel = new javax.swing.JPanel();
        numbersPanel = new javax.swing.JPanel();
        numbersPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonComma = new javax.swing.JButton();
        buttonComma.setText(",");
        button0 = new javax.swing.JButton();
        button0.setText("0");
        button1 = new javax.swing.JButton();
        button1.setText("1");
        button2 = new javax.swing.JButton();
        button2.setText("2");
        button3 = new javax.swing.JButton();
        button3.setText("3");
        button4 = new javax.swing.JButton();
        button4.setText("4");
        button5 = new javax.swing.JButton();
        button5.setText("5");
        button6 = new javax.swing.JButton();
        button6.setText("6");
        button7 = new javax.swing.JButton();
        button7.setText("7");
        button8 = new javax.swing.JButton();
        button8.setText("8");
        button9 = new javax.swing.JButton();
        button9.setText("9");
        calculationPanel = new javax.swing.JPanel();
        buttonEnter = new javax.swing.JButton();
        buttonEnter.setText("=");
        buttonEnter.setBorder(null);
        buttonBracketsClose = new javax.swing.JButton();
        buttonBracketsClose.setText(")");
        buttonBracketsClose.setBorder(null);
        buttonBracketsOpen = new javax.swing.JButton();
        buttonBracketsOpen.setText("(");
        buttonBracketsOpen.setBorder(null);
        buttonAddition = new javax.swing.JButton();
        buttonAddition.setText("+");
        buttonAddition.setBorder(null);
        buttonSubtraction = new javax.swing.JButton();
        buttonSubtraction.setText("-");
        buttonSubtraction.setBorder(null);
        buttonMultiplication = new javax.swing.JButton();
        buttonMultiplication.setText("*");
        buttonMultiplication.setBorder(null);
        buttonDivision = new javax.swing.JButton();
        buttonDivision.setText("/");
        buttonDivision.setBorder(null);
        buttonE = new javax.swing.JButton();
        buttonE.setText("π");
        buttonE.setBorder(null);
        buttonPi = new javax.swing.JButton();
        buttonPi.setText("E");
        buttonPi.setBorder(null);
        controlPanel = new javax.swing.JPanel();
        buttonMemoryRecall = new javax.swing.JButton();
        buttonMemoryRecall.setText("MR");
        buttonMemoryRecall.setBorder(null);
        buttonClear = new javax.swing.JButton();
        buttonClear.setText("C");
        buttonClear.setBorder(null);
        buttonMemorySave = new javax.swing.JButton();
        buttonMemorySave.setText("MS");
        buttonMemorySave.setBorder(null);


        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setBackground(new java.awt.Color(204, 204, 204));
        frame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Result.setBackground(new java.awt.Color(255, 255, 255));

        resultLabel.setBackground(new java.awt.Color(255, 255, 255));
        resultLabel.setFont(resultLabel.getFont().deriveFont(resultLabel.getFont().getSize() + 25f));
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultLabel.setText("0");

        calculationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
                ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ResultLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calculationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        ResultLayout.setVerticalGroup(
                ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultLayout.createSequentialGroup()
                                .addGap(0, 10, Short.MAX_VALUE)
                                .addComponent(calculationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout NumbersPanelLayout = new javax.swing.GroupLayout(numbersPanel);
        numbersPanel.setLayout(NumbersPanelLayout);
        NumbersPanelLayout.setHorizontalGroup(
                NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NumbersPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(NumbersPanelLayout.createSequentialGroup()
                                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(NumbersPanelLayout.createSequentialGroup()
                                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(NumbersPanelLayout.createSequentialGroup()
                                                .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonComma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NumbersPanelLayout.setVerticalGroup(
                NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(NumbersPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(NumbersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonComma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout calculationPanelLayout = new javax.swing.GroupLayout(calculationPanel);
        calculationPanel.setLayout(calculationPanelLayout);
        calculationPanelLayout.setHorizontalGroup(
                calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(buttonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonBracketsOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonBracketsClose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                                .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(buttonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        calculationPanelLayout.setVerticalGroup(
                calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonBracketsOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonBracketsClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(calculationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(calculationPanelLayout.createSequentialGroup()
                                                .addComponent(buttonAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(buttonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMemorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonMemoryRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
                controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(controlPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonMemoryRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonMemorySave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout calculatorPanelLayout = new javax.swing.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
                calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(numbersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        calculatorPanelLayout.setVerticalGroup(
                calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculatorPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(calculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(calculationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(calculatorPanelLayout.createSequentialGroup()
                                                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numbersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calculatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        frame.pack();
    }

    /**
     * Return of all Buttons in the View
     *
     * @return JButton
     */
    public JButton[] getComponentsForController() {
        return new JButton[]{
                button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
                buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision, buttonE,
                buttonBracketsClose, buttonBracketsOpen, buttonComma, buttonPi, buttonEnter,
                buttonClear, buttonMemoryRecall, buttonMemorySave
        };
    }

    /**
     * Set the Result-Label
     *
     * @param result String for Result-Label
     */
    public void setResultLabel(String result) {
        resultLabel.setText(result);
    }

    /**
     * Set the Calculation-Label
     *
     * @param calculation String for Calculation-Label
     */
    public void setCalculationLabel(String calculation) {
        calculationLabel.setText(calculation);
    }
}
