package taschenrechner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 * @author cdepner
 */
public class InternalSaveModel implements CalculatorModel {
    private String operation = "0", savedOperation;
    private boolean operationTouched = false;

    /**
     * Set operation string
     *
     * @param operand Char with numbers or letters the create an operation
     * @return String operation
     */
    public String setOperation(char operand) {
        String operandString;
        if ("π".equals(operand + "")) {
            operandString = Math.PI + "";
        } else if (operand == 'E') {
            operandString = Math.E + "";
        } else if (operand == 'M') {
            operandString = getSavedOperation();
        } else {
            operandString = operand + "";
        }


        if (!operationTouched) {
            operationTouched = true;
            if (isNumeric(operandString) || "(".equals(operandString) || ")".equals(operandString)) {
                operation = operandString;
            } else {
                operation = calculate(operation.replace("=", "")) + "" + operandString;
            }
        } else {
            operation += operandString;
        }

        return operation;
    }

    /**
     * Test string for a number
     *
     * @param str Check string to number
     * @return boolean true|false
     */
    public boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

    /**
     * Save an operation in an separate variable
     */
    public void setSavedOperation() {
        savedOperation = operation.replace("=", "");
    }

    /**
     * Get the result of the saved operation
     *
     * @return String result of the saved operation
     */
    public String getSavedOperation() {

        return calculate(savedOperation);
    }

    /**
     * Get the operation result
     *
     * @return String result of the operation
     */
    public String getResult() {

        return calculate(operation);
    }

    /**
     * Calculate the operation string
     *
     * @param localOperation String to calculate
     *
     * @return String result of operation
     */
    public String calculate(String localOperation) {
        String result;
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            double eval;

            String stringBuilder = "#,###.########";
            eval = Double.parseDouble(engine.eval(localOperation.replace(',', '.')) + "");

            DecimalFormat round = new DecimalFormat(stringBuilder);
            round.setRoundingMode(RoundingMode.HALF_UP);
            result = round.format(eval) + "";

        } catch (ScriptException e) {
            result = "Fehler!";
        }

        return result;
    }

    /**
     * Reset operation
     */
    public void resetOperation() {
        operation = "0";
        operationTouched = false;

    }
}
