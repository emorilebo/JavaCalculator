import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;

    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField displayText;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnDot;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton clearButton;
    private JButton btnPlus;
    private JButton btnMultiply;
    private JButton btnEquals;
    private JButton scientificButton;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnBackSpace;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 +Double.parseDouble(displayText.getText());
        displayText.setText("");
    }

    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = displayText.getText() + btnOne.getText();
                displayText.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = displayText.getText() + btnTwo.getText();
                displayText.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = displayText.getText() + btnThree.getText();
                displayText.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = displayText.getText() + btnFour.getText();
                displayText.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = displayText.getText() + btnFive.getText();
                displayText.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = displayText.getText() + btnSix.getText();
                displayText.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = displayText.getText() + btnSeven.getText();
                displayText.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = displayText.getText() + btnEight.getText();
                displayText.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = displayText.getText() + btnNine.getText();
                displayText.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = displayText.getText() + btnZero.getText();
                displayText.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                total1 = total1 + Double.parseDouble(displayText.getText());
//                displayText.setText("");

                String buttonText = btnPlus.getText();
                getOperator(buttonText);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMinus.getText();
                getOperator(buttonText);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMultiply.getText();
                getOperator(buttonText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnDivide.getText();
                getOperator(buttonText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+' :
                        total2 = total1 + Double.parseDouble(displayText.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(displayText.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(displayText.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(displayText.getText());
                        break;
                }
                displayText.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                displayText.setText("");
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Make it neater with "0." instead of just "."
                if(displayText.getText().equals("")){
                    displayText.setText("0.");
                }
                //Avoid bug caused by ".." or "1.." or ".2." as not acceptable for calculator
                else if(displayText.getText().contains(".")) {
                    btnDot.setEnabled(false);
                }//Only accept
                else {
                    String btnDotText = displayText.getText() + btnDot.getText();
                    displayText.setText(btnDotText);
                }
                btnDot.setEnabled(true );
            }
        });
        btnBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String currentText = displayText.getText();
               int len = currentText.length();
               if(len>0){
                   String newDisplay = currentText.substring(0,len-1);
                   displayText.setText(newDisplay);
               }else{
                   displayText.setText("There is nothing to delete");
               }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
