import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author cdepner
 */
class Controller implements ActionListener {

    private final CalculatorView groupLayoutView;
    private final CalculatorModel internalModel;

    /**
     * Object Entry Point
     *
     * @param model Model Class
     * @param view  View Class
     */
    private Controller(CalculatorModel model, CalculatorView view) {
        internalModel = model;
        groupLayoutView = view;
        groupLayoutView.initComponents();
        groupLayoutView.setVisibility(true);
        actionListener();
    }

    /**
     * Entry Point
     *
     * @param args User Defined arguments as an array
     */
    public static void main(String[] args) {
        CalculatorView groupView = new GridBagLayoutView();
        CalculatorModel internalModel = new InternalSaveModel();
        new Controller(internalModel, groupView);
    }

    /**
     * ActionListener to catch all View Button actions
     */
    private void actionListener() {
        for (JButton button : groupLayoutView.getComponentsForController()) {
            button.addActionListener(this);
        }
    }

    /**
     * Function replace actionPerformed to catch all Button actions
     *
     * @param actionEvent ActionEvent Class
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String actionCommand = actionEvent.getActionCommand();
        if ("=".equals(actionCommand)) {
            groupLayoutView.setResultLabel(internalModel.getResult());
            groupLayoutView.setCalculationLabel(internalModel.setOperation(actionCommand.charAt(0)));
            internalModel.resetOperation();
        } else if ("C".equals(actionCommand)) {
            internalModel.resetOperation();
            groupLayoutView.setResultLabel("0");
            groupLayoutView.setCalculationLabel("0");
        } else if ("MR".equals(actionCommand)) {
            groupLayoutView.setCalculationLabel(internalModel.setOperation('M'));
        } else if ("MS".equals(actionCommand)) {
            internalModel.setSavedOperation();
        } else {
            groupLayoutView.setCalculationLabel(internalModel.setOperation(actionCommand.charAt(0)));
        }
    }
}
