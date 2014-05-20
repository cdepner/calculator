/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

import javax.swing.*;

/**
 * @author cdepner
 */
interface CalculatorView {

    JFrame frame = null;
    JPanel numbersPanel = null, Result = null, calculationPanel = null, calculatorPanel = null, controlPanel = null;
    JButton button0 = null, button1 = null, button2 = null, button3 = null, button4 = null, button5 = null, button6 = null, button7 = null, button8 = null, button9 = null;
    JButton buttonAddition = null, buttonSubtraction = null, buttonMultiplication = null, buttonDivision = null, buttonE = null;
    JButton buttonBracketsClose = null, buttonBracketsOpen = null, buttonComma = null, buttonPi = null, buttonEnter = null;
    JButton buttonClear = null, buttonMemoryRecall = null, buttonMemorySave = null;
    JLabel calculationLabel = null, resultLabel = null;

    public JButton[] getComponentsForController();

    public void setResultLabel(String result);

    public void setCalculationLabel(String calculation);
}
