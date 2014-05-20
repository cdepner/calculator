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
    private String operation, savedOperation;
    private boolean operationTouched = false;


    public String setOperation(char operand) {
        String operandString;
        if (operand == 'π') {
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
            if (isNumeric(operandString)) {
                operation = operandString;
            } else {
                operation = calculate(operation.replace("=", "")) + "" + operandString;
            }
        } else {
            operation += operandString;
        }

        return operation;
    }

    public boolean isNumeric(String str)
    {
        NumberFormat formatter = NumberFormat.getInstance();
        ParsePosition pos = new ParsePosition(0);
        formatter.parse(str, pos);
        return str.length() == pos.getIndex();
    }

    public void setSavedOperation() {
        savedOperation = operation.replace("=", "");
    }

    public String getSavedOperation() {

        return calculate(savedOperation);
    }

    public String getResult() {

        return calculate(operation);
    }

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

    public void resetOperation() {
        operationTouched = false;
    }
}
