import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    String currencies[] = new String[]{"Dollars", "Euros", "Sterling"};
    private static JFrame frame;
    private static JPanel fromPanel;
    private static JLabel fromLabel;
    private static JComboBox fromComboBox;
    private static JPanel toPanel;
    private static JLabel toLabel;

    private static JComboBox toComboBox;
    private static JPanel convertPanel;

    private static JLabel result;




    private static DollarConverter converter;


    private JButton convertButton;

    private JTextField inputField;
    public GUI(){
        frame = new JFrame();

        converter = new DollarConverter();



        fromPanel = new JPanel();
        fromLabel = new JLabel("From");

        fromComboBox = new JComboBox(currencies);

        //fromPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        fromPanel.setBounds(100,0,800,250);
        fromPanel.setSize(600,100);
        fromPanel.add(fromLabel, BorderLayout.NORTH);
        fromPanel.add(fromComboBox, BorderLayout.CENTER);

        toPanel = new JPanel();
        toLabel = new JLabel("To");

        toComboBox = new JComboBox(currencies);

        //toPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        toPanel.setBounds(200,0,800,250);
        toPanel.setSize(600,100);
        toPanel.add(toLabel, BorderLayout.NORTH);
        toPanel.add(toComboBox, BorderLayout.CENTER);

        convertPanel = new JPanel();
        inputField = new JTextField(16);
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        result = new JLabel();

        //convertPanel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        //convertPanel.setLayout(new GridLayout(0,1));
        convertPanel.setBounds(0,0,400,250);
        convertPanel.add(inputField);
        convertPanel.add(convertButton);
        convertPanel.add(result);




        frame.add(fromPanel, BorderLayout.CENTER);
        frame.add(toPanel, BorderLayout.EAST);
        frame.add(convertPanel, BorderLayout.WEST);






        frame.setSize(1280,2800); // sets x and y dimensions of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Currency Converter");
        frame.getContentPane().setBackground(Color.white);
        frame.pack();
        frame.setVisible(true); // makes frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String from = "";
        String to = "";

        if(e.getSource()==fromComboBox){
            from = fromComboBox.getSelectedItem().toString();
            System.out.println(from);
        }

        if(e.getSource()==toComboBox){
            to = toComboBox.getSelectedItem().toString();
            System.out.println(to);
        }





        if (e.getActionCommand().equals("Convert")) {
            // retrieve input
            String input = inputField.getText();

            // convert to float
            Float enteredAmount = Float.parseFloat(input);


            // convert amount
            Float newAmount = CurrencyConverterFactory.convert(from + " To " + to, enteredAmount);

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
