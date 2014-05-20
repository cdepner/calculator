import javax.swing.*;

/**
 * @author cdepner
 */
public class GridBagLayoutView implements CalculatorView {


    private JFrame frame;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAddition, buttonSubtraction, buttonMultiplication, buttonDivision, buttonE;
    private JButton buttonBracketsClose, buttonBracketsOpen, buttonComma, buttonPi, buttonEnter;
    private JButton buttonClear, buttonMemoryRecall, buttonMemorySave;
    private JLabel calculationLabel, resultLabel;

    public GridBagLayoutView() {

        initComponents();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GridBagLayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GridBagLayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GridBagLayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GridBagLayoutView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

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
        JPanel resultPanel, controlPanel;

        java.awt.GridBagConstraints gridBagConstraints;

        resultPanel = new javax.swing.JPanel();
        calculationLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        button0 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonComma = new javax.swing.JButton();
        buttonAddition = new javax.swing.JButton();
        buttonEnter = new javax.swing.JButton();
        buttonSubtraction = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        buttonE = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        buttonPi = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonMemorySave = new javax.swing.JButton();
        buttonMemoryRecall = new javax.swing.JButton();
        buttonBracketsOpen = new javax.swing.JButton();
        buttonBracketsClose = new javax.swing.JButton();

        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new java.awt.GridBagLayout());

        resultPanel.setLayout(new java.awt.GridBagLayout());

        calculationLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        calculationLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        resultPanel.add(calculationLabel, gridBagConstraints);

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 20));
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        resultPanel.add(resultLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        frame.getContentPane().add(resultPanel, gridBagConstraints);

        controlPanel.setLayout(new java.awt.GridBagLayout());

        buttonComma.setText(",");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonComma, gridBagConstraints);

        button0.setText("0");
        button0.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button0, gridBagConstraints);

        button1.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button1, gridBagConstraints);

        button2.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button2, gridBagConstraints);

        button3.setText("3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button3, gridBagConstraints);

        button4.setText("4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button4, gridBagConstraints);

        button5.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button5, gridBagConstraints);

        button6.setText("6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button6, gridBagConstraints);

        button7.setText("7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button7, gridBagConstraints);

        button8.setText("8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button8, gridBagConstraints);

        button9.setText("9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(button9, gridBagConstraints);

        buttonEnter.setText("=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonEnter, gridBagConstraints);

        buttonAddition.setText("+");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonAddition, gridBagConstraints);

        buttonSubtraction.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonSubtraction, gridBagConstraints);

        buttonMultiplication.setText("*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonMultiplication, gridBagConstraints);

        buttonDivision.setText("/");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonDivision, gridBagConstraints);

        buttonE.setText("E");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonE, gridBagConstraints);

        buttonPi.setText("π");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonPi, gridBagConstraints);

        buttonClear.setText("C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonClear, gridBagConstraints);

        buttonMemorySave.setText("MS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonMemorySave, gridBagConstraints);

        buttonMemoryRecall.setText("MR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonMemoryRecall, gridBagConstraints);

        buttonBracketsOpen.setText("(");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonBracketsOpen, gridBagConstraints);

        buttonBracketsClose.setText(")");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        controlPanel.add(buttonBracketsClose, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.getContentPane().add(controlPanel, gridBagConstraints);

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
