package taschenrechner;

/**
 * @author cdepner
 */
interface CalculatorModel {
    String operation = null, savedOperation = null;
    boolean operationTouched = false;

    public String setOperation(char operand);

    public boolean isNumeric(String str);

    public void setSavedOperation();

    public String getSavedOperation();

    public String getResult();

    public String calculate(String localOperation);

    public void resetOperation();
}
