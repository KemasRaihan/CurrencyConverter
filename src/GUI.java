import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JLabel convertedAmount;
    private JLabel enteredAmount;
    private JLabel promptLabel;
    private JFrame frame;
    private JPanel panel;

    private JButton convertButton;

    private JTextField inputField;
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        promptLabel = new JLabel("Enter the currency");

        inputField = new JTextField(15);

        convertedAmount = new JLabel();

        panel.setBorder(BorderFactory.createEmptyBorder(120,120,120,120));
        panel.setLayout(new GridLayout(0,1));
        panel.add(promptLabel);
        panel.add(inputField);
        panel.add(convertButton);
        panel.add(convertedAmount);

        frame.add(panel, BorderLayout.CENTER);


        frame.setSize(480,480); // sets x and y dimensions of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Currency Converter");
        frame.getContentPane().setBackground(Color.white);
        frame.pack();
        frame.setVisible(true); // makes frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String input = e.getActionCommand();
        if (input.equals("submit")) {
            // set the text of the label to the text of the field
            enteredAmount.setText(inputField.getText());

            // set the text of field to blank
            inputField.setText("  ");
            convertedAmount.setText("The new currency is  ");
        }


    }
}
