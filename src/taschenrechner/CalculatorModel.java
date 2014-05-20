package taschenrechner;

/**
 * @author cdepner
 */
interface CalculatorModel {

    public String setOperation(char operand);

    public void setSavedOperation();

    public String getResult();

    public void resetOperation();
}
