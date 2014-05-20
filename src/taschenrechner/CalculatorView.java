package taschenrechner;

import javax.swing.*;

/**
 * @author cdepner
 */
interface CalculatorView {

    public void setVisibility(boolean status);

    public void initComponents();

    public JButton[] getComponentsForController();

    public void setResultLabel(String result);

    public void setCalculationLabel(String calculation);
}
