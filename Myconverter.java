package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myconverter {
    // without i use panel
private JFrame frame;
private JTextField Input;
private JTextField Output;
private JLabel inputLabel ,outputLabel ;
private JComboBox<String> fromUnit ;  // Dropdown ke liye with type of < String >
private JComboBox<String> toUnit;
private JButton Button;
protected void initComponent(){
    frame = new JFrame("Unit Converter");  // also set the title of Jframe
    frame.setSize(400,250);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    inputLabel = new JLabel("Input: ");
    Input = new JTextField(10);

    outputLabel = new JLabel("Output: ");
    Output =  new JTextField(10);


    Output.setEditable(false);  // output value not edit
    fromUnit = new JComboBox<String>(new String[]{"Meter","Feet","Inches","Centimeter"});
    toUnit= new JComboBox<String>(new String[]{"Meter","Feet","Inches","Centimeter"});
    Button = new JButton("Convert");

    inputLabel.setBounds(20,20,100,20);// used for set position
    Input.setBounds(150,20,100,20); // textField
    fromUnit.setBounds(270,20,100,20); // Drop down box from Unit set
    outputLabel.setBounds(20,50,100,20); // Label for Output
    Output.setBounds(150,50,100,20); // text Field


    toUnit.setBounds(270,50,100,20);
    Button.setBounds(150,80,100,20);

    Button.addActionListener( new ConvertButtonListner());

    frame.add(Input);
    frame.add(Output);
    frame.add(outputLabel);
    frame.add(inputLabel);
    frame.add(Button);
    frame.add(toUnit);
    frame.add(fromUnit);
    frame.setVisible(true);

}

// Call Constructor
private Myconverter(){
initComponent();
}


   // Start Main Function
    public static void main(String[] args) {
        new Myconverter();
    }



    private class ConvertButtonListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

         String  fromUnitType =  fromUnit.getSelectedItem().toString(); // Drop down ke liye getSelected Method
            System.out.println(fromUnit.getSelectedItem());
            String toUnitType =  toUnit.getSelectedItem().toString();  // Drop down ke liye getSelected Method

         double inputValue =  Double.parseDouble(Input.getText());
         double outputValue = 0.0;


         if(fromUnitType.equals("Meter")){

            if(toUnitType.equals("Meter")){
                outputValue  = Myconverter.meterTOMeters(inputValue);
            } else if (toUnitType.equals("Feet")) {
                outputValue =  Myconverter.meterToFeet(inputValue);
            } else if( toUnitType.equals("Inches")) {
                outputValue  = Myconverter.meterToInches(inputValue);
            }
            else if(toUnitType.equals("Centimeter")){
                outputValue =  Myconverter.meterToCentimeter(inputValue);
            }
         }



         else if(fromUnitType.equals("Feet")){

             if(toUnitType.equals("Meter")){
                 outputValue  = Myconverter.feetTOMeters(inputValue);
             } else if (toUnitType.equals("Feet")) {
                 outputValue =  Myconverter.feetToFeet(inputValue);
             } else if( toUnitType.equals("Inches")) {
                 outputValue  = Myconverter.feetToInches(inputValue);
             }
             else if(toUnitType.equals("Centimeter")){
                 outputValue =  Myconverter.feetToCentimeter(inputValue);
             }
         }



         else if(fromUnitType.equals("Inches")){

             if(toUnitType.equals("Meter")){
                 outputValue  = Myconverter.inchesTOMeters(inputValue);
             } else if (toUnitType.equals("Feet")) {
                 outputValue =  Myconverter.inchesToFeet(inputValue);
             } else if( toUnitType.equals("Inches")) {
                 outputValue  = Myconverter.inchesToInches(inputValue);
             }
             else if(toUnitType.equals("Centimeter")){
                 outputValue =  Myconverter.inchesToCentimeter(inputValue);
             }
         }


         else if (fromUnitType.equals("Centimeter")) {

             if(toUnitType.equals("Meter")){
                 outputValue  = Myconverter.centimeterTOMeters(inputValue);
             } else if (toUnitType.equals("Feet")) {
                 outputValue =  Myconverter.centimeterToFeet(inputValue);
             } else if( toUnitType.equals("Inches")) {
                 outputValue  = Myconverter.centimeterToInches(inputValue);
             }
             else if(toUnitType.equals("Centimeter")){
                 outputValue =  Myconverter.centimeterToCentimeter(inputValue);
             }
         }
         Output.setText(" "+outputValue);
        }
    }



    //agra usne meter select kar liya hoo
    public static double meterTOMeters(double inputValue){
    double outputValue;
    outputValue = inputValue;
    return outputValue;
    }
    public static double meterToCentimeter(double inputValue){
    double outputValue;
    outputValue = inputValue*100;
    return outputValue;

    }
    public static double meterToInches(double inputValue){
    double outputValue;
    outputValue = inputValue*3.28084*12;
    return outputValue;
    }
    public static double meterToFeet(double inputValue){
    double outputValue;
    outputValue = inputValue*3.28084;
    return outputValue;
    }


    public static double feetTOMeters(double inputValue){
        double outputValue;
        outputValue = inputValue/3.28084;
        return outputValue;
    }
    public static double  feetToCentimeter(double inputValue){
        double outputValue;
        outputValue = inputValue/3.28084*100;
        return outputValue;

    }
    public static double  feetToInches(double inputValue){
        double outputValue;
        outputValue = inputValue*12;
        return outputValue;
    }
    public static double  feetToFeet(double inputValue){
        double outputValue;
        outputValue = inputValue;
        return outputValue;
    }


    public static double inchesTOMeters(double inputValue){
        double outputValue;
        outputValue = inputValue/12/3.28084;
        return outputValue;
    }
    public static double  inchesToCentimeter(double inputValue){
        double outputValue;
        outputValue = inputValue/12/3.28084*100;
        return outputValue;

    }
    public static double  inchesToInches(double inputValue){
        double outputValue;
        outputValue = inputValue;
        return outputValue;
    }
    public static double  inchesToFeet(double inputValue){
        double outputValue;
        outputValue = inputValue/12;
        return outputValue;
    }


    public static double centimeterTOMeters(double inputValue){
        double outputValue;
        outputValue = inputValue/100;
        return outputValue;
    }
    public static double  centimeterToCentimeter(double inputValue){
        double outputValue;
        outputValue = inputValue;
        return outputValue;

    }
    public static double  centimeterToInches(double inputValue){
        double outputValue;
        outputValue = inputValue/100*3.28084*12;
        return outputValue;
    }
    public static double  centimeterToFeet(double inputValue){
        double outputValue;
        outputValue = inputValue/100*3.28084;
        return outputValue;
    }



}
