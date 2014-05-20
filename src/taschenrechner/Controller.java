package taschenrechner;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author cdepner
 */
class Controller implements ActionListener {

    private final CalculatorView groupView;
    private final CalculatorModel internalModel;

    public static void main(String[] args) {
        CalculatorView groupView = new GroupLayoutView();
        CalculatorModel internalModel = new InternalSaveModel();
        new Controller(internalModel, groupView);
    }

    private Controller(CalculatorModel model, CalculatorView view) {
        internalModel = model;
        groupView = view;
        actionListener();
    }

    private void actionListener() {
        for (JButton button : groupView.getComponentsForController()) {
            button.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String actionCommand = actionEvent.getActionCommand();
        if ("=".equals(actionCommand)) {
            groupView.setResultLabel(internalModel.getResult());
            groupView.setCalculationLabel(internalModel.setOperation(actionCommand.charAt(0)));
            internalModel.resetOperation();
        } else if ("C".equals(actionCommand)) {
            groupView.setCalculationLabel(internalModel.setOperation('0'));
            groupView.setResultLabel(internalModel.getResult());
            internalModel.resetOperation();
        } else if ("MR".equals(actionCommand)) {
            groupView.setCalculationLabel(internalModel.setOperation('M'));
        } else if ("MS".equals(actionCommand)) {
            internalModel.setSavedOperation();
        }else {
            groupView.setCalculationLabel(internalModel.setOperation(actionCommand.charAt(0)));
        }
    }
}
