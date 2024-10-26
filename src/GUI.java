import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel result;
    private static JLabel promptLabel;
    private static JFrame frame;
    private static JPanel panel;

    private static DollarConverter converter;


    private JButton convertButton;

    private JTextField inputField;
    public GUI(){
        frame = new JFrame();
        panel = new JPanel();

        converter = new DollarConverter();

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        promptLabel = new JLabel("Enter the amount in ($)");

        inputField = new JTextField(16);

        result = new JLabel();

        panel.setBorder(BorderFactory.createEmptyBorder(120,120,120,120));
        panel.setLayout(new GridLayout(0,1));
        panel.add(promptLabel);
        panel.add(inputField);
        panel.add(convertButton);
        panel.add(result);

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

        String s = e.getActionCommand();
        if (s.equals("Convert")) {
            // retrieve input
            String input = inputField.getText();

            // convert to float
            Float enteredAmount = Float.parseFloat(input);

            // convert dollars to pound sterling
            Float newAmount = converter.convertToSterling(enteredAmount);

            // convert to string
            String newAmountStr = Float.toString(newAmount);

            String text = "$" + input + " is " + "£" + newAmountStr;

            // set result
            result.setText(text);

            // set the text of field to blank
            inputField.setText("");
        }


    }
}
