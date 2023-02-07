import javax.swing.*;
import java.awt.*;

public class W5A1Maquidato {
    JFrame f;

    W5A1Maquidato() {
        f = new JFrame();
        JTextArea ta = new JTextArea(50, 50);
        JPanel p2a = new JPanel();
        JPanel p1 = new JPanel();
        p1.add(ta);
        JLabel J0 = new JLabel("From");
        JLabel J0b = new JLabel("To");
        JLabel J1 = new JLabel("From");
        JLabel J1b = new JLabel("To");
        JLabel J2 = new JLabel("From");
        JLabel J2b = new JLabel("To");


        JPanel p2 = new JPanel();
        p1.add(J0);
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        p3.add(J1);
        tp.add("Length", p2);
        //add tabbed pane for length conversion
        p2.add(J0);
        String[] ll = {"Meter", "Kilometer", "Centimeter", "Millimeter", "Micrometer"};
        JComboBox<String> jcboxl1 = new JComboBox<String>(ll);
        p2.add(jcboxl1);
        p2.add(J0b);
        String[] lb = {"Meter", "Kilometer", "Centimeter", "Millimeter", "Micrometer"};
        JComboBox<String> jcboxl2 = new JComboBox<String>(lb);
        p2.add(jcboxl2);
        JButton b = new JButton("Convert");
        p2.add(b);
        JTextField tfResult = new JTextField(10);
        tfResult.setEditable(false);
        p2.add(tfResult);
        JTextField tfFrom = new JTextField(10);
        p2.add(tfFrom);

        //add actionlistener for convert button and add function for conversion
        b.addActionListener(e -> {
            String from = jcboxl1.getSelectedItem().toString();
            String to = jcboxl2.getSelectedItem().toString();
            double fromValue = Double.parseDouble(tfFrom.getText());
            double result = 0;
            if (from.equals("Meter") && to.equals("Kilometer")) {
                result = fromValue / 1000;
            } else if (from.equals("Meter") && to.equals("Centimeter")) {
                result = fromValue * 100;
            } else if (from.equals("Meter") && to.equals("Millimeter")) {
                result = fromValue * 1000;
            } else if (from.equals("Meter") && to.equals("Micrometer")) {
                result = fromValue * 1000000;
            } else if (from.equals("Kilometer") && to.equals("Meter")) {
                result = fromValue * 1000;
            } else if (from.equals("Kilometer") && to.equals("Centimeter")) {
                result = fromValue * 100000;
            } else if (from.equals("Kilometer") && to.equals("Millimeter")) {
                result = fromValue * 1000000;
            } else if (from.equals("Kilometer") && to.equals("Micrometer")) {
                result = fromValue * 1000000000;
            } else if (from.equals("Centimeter") && to.equals("Meter")) {
                result = fromValue / 100;
            } else if (from.equals("Centimeter") && to.equals("Kilometer")) {
                result = fromValue / 100000;
            } else if (from.equals("Centimeter") && to.equals("Millimeter")) {
                result = fromValue * 10;
            } else if (from.equals("Centimeter") && to.equals("Micrometer")) {
                result = fromValue * 10000;
            } else if (from.equals("Millimeter") && to.equals("Meter")) {
                result = fromValue / 1000;
            } else if (from.equals("Millimeter") && to.equals("Kilometer")) {
                result = fromValue / 1000000;
            } else if (from.equals("Millimeter") && to.equals("Centimeter")) {
                result = fromValue / 10;
            } else if (from.equals("Millimeter") && to.equals("Micrometer")) {
                result = fromValue * 1000;
            } else if (from.equals("Micrometer") && to.equals("Meter")) {
                result = fromValue / 1000000;
            } else if (from.equals("Micrometer") && to.equals("Kilometer")) {
                result = fromValue / 1000000000;
            } else if (from.equals("Micrometer") && to.equals("Centimeter")) {
                result = fromValue / 10000;
            } else if (from.equals("Micrometer") && to.equals("Millimeter")) {
                result = fromValue / 1000;
            } else {
                result = fromValue;
            }
            tfResult.setText(String.valueOf(result));
        });


        tp.add("Temperature", p3);
        // temperature
        //add text field for temperature conversion for From
        JTextField tfFrom2 = new JTextField(10);
        p3.add(tfFrom2);

        p3.add(J1);
        String[] tl = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox<String> jcboxt1 = new JComboBox<String>(tl);
        p3.add(jcboxt1);
        p3.add(J1b);
        String[] tb = {"Celsius", "Fahrenheit", "Kelvin"};
        JComboBox<String> jcboxt2 = new JComboBox<String>(tb);
        p3.add(jcboxt2);
        JButton b2 = new JButton("Convert");
        p3.add(b2);
        JTextField tfResult2 = new JTextField(10);
        tfResult2.setEditable(false);
        p3.add(tfResult2);
        // add functions for conversion button from temperature
        b2.addActionListener(e -> {
            String from = jcboxt1.getSelectedItem().toString();
            String to = jcboxt2.getSelectedItem().toString();
            double fromValue = Double.parseDouble(tfFrom2.getText());
            double result = 0;
            if (from.equals("Celsius") && to.equals("Fahrenheit")) {
                result = (fromValue * 9 / 5) + 32;
            } else if (from.equals("Celsius") && to.equals("Kelvin")) {
                result = fromValue + 273.15;
            } else if (from.equals("Fahrenheit") && to.equals("Celsius")) {
                result = (fromValue - 32) * 5 / 9;
            } else if (from.equals("Fahrenheit") && to.equals("Kelvin")) {
                result = (fromValue - 32) * 5 / 9 + 273.15;
            } else if (from.equals("Kelvin") && to.equals("Celsius")) {
                result = fromValue - 273.15;
            } else if (from.equals("Kelvin") && to.equals("Fahrenheit")) {
                result = (fromValue - 273.15) * 9 / 5 + 32;
            } else {
                result = fromValue;
            }
            tfResult2.setText(String.valueOf(result));
        });


        tp.add("Area", p4);
        p4.add(J2);
        String[] yl = {"Select", "First Year", "Second Year", "Third Year", "Fourth Year"};
        JComboBox<String> jcbox2 = new JComboBox<String>(yl);
        p4.add(jcbox2);
        f.add(tp);
        f.setSize(500, 200);
        f.setLayout(new GridLayout(1, 1));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new W5A1Maquidato();
    }
}



