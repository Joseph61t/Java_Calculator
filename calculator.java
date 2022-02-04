package Java_Calculator;
// package components;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator {
    private JFrame window;
    private JTextArea calcReadOut;
    private JPanel calcArea;
    private JTextArea history;
    // private JScrollPane hist_scroll;
    private JPanel button_area;
    private float current_num;
    private float last_num;
    private String operator;
    private float result;
    public Calculator() {
        //Create and set up the window.
        current_num = 0;
        last_num = 0;
        operator = "~";
        window = new JFrame("Calculator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create dimensions for window, and buttons
        // window.setSize(new Dimension(300, 350));
        // Make section for buttons
        button_area = new JPanel(new GridLayout(4,4));
        calcArea = new JPanel(new GridLayout(2,1));
        calcReadOut = new JTextArea("   ");
        history = new JTextArea("   ");
        // hist_scroll = new JScrollPane(history); 
        // Set size
        button_area.setPreferredSize(new Dimension(300, 300));
        calcArea.setPreferredSize(new Dimension(310, 60));
        history.setPreferredSize(new Dimension(300, 40));
        calcReadOut.setPreferredSize(new Dimension(300, 20));
        // hist_scroll.setPreferredSize(new Dimension(300,40));
        // Make read out for calculator
        // String Content = "~";
        
        calcReadOut.setEditable(false);
        history.setEditable(false);
        // calcArea.add(hist_scroll);
        calcArea.add(history);
        calcArea.add(calcReadOut);
        createButtons();

        // Insert content into window.
        window.getContentPane().add(calcArea, BorderLayout.NORTH);
        window.getContentPane().add(button_area, BorderLayout.SOUTH);
        window.pack();
    }
    private void createButtons() {
        

        // Make buttons in correct positions.
        JButton button_7 = new JButton(Integer.toString(7));
        button_area.add(button_7);
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("7");
                    current_num = 7;
                } else {
                    float appendfloat = 7;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });
        JButton button_8 = new JButton(Integer.toString(8));
        button_area.add(button_8);
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("8");
                    current_num = 8;
                } else {
                    float appendfloat = 8;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_9 = new JButton(Integer.toString(9));
        button_area.add(button_9);
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("9");
                    current_num = 9;
                } else {
                    float appendfloat = 9;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_multiply = new JButton("*");
        button_area.add(button_multiply);
        button_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                // calcReadOut.setText("   ");
                // last_num = current_num;
                // history.setText("" + current_num);
                // history.append("\n" + current_num);
                // current_num = 0;
                if (operator == "~") {
                    last_num = current_num;
                    history.setText("" + current_num);
                } else if (operator == "+") {
                    result = last_num+current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "-") {
                    result = last_num-current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "*") {
                    result = last_num*current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "/") {
                    result = last_num/current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else {
                    last_num = current_num;
                    history.setText("" + current_num);
                    current_num = 0;
                }
                current_num = 0;
                operator = "*";
            }
        });

        JButton button_4 = new JButton(Integer.toString(4));
        button_area.add(button_4);
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("4");
                    current_num = 4;
                } else {
                    float appendfloat = 4;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_5 = new JButton(Integer.toString(5));
        button_area.add(button_5);
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("5");
                    current_num = 5;
                } else {
                    float appendfloat = 5;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_6 = new JButton(Integer.toString(6));
        button_area.add(button_6);
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("6");
                    current_num = 6;
                } else {
                    float appendfloat = 6;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_divide = new JButton("/");
        button_area.add(button_divide);
        button_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                // calcReadOut.setText("   ");
                // last_num = current_num;
                // history.setText("" + current_num);
                // history.append("\n" + current_num);
                // current_num = 0;
                if (operator == "~") {
                    last_num = current_num;
                    history.setText("" + current_num);
                } else if (operator == "+") {
                    result = last_num+current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "-") {
                    result = last_num-current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "*") {
                    result = last_num*current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "/") {
                    result = last_num/current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else {
                    last_num = current_num;
                    history.setText("" + current_num);
                    current_num = 0;
                }
                current_num = 0;
                operator = "/";
            }
        });

        JButton button_1 = new JButton(Integer.toString(1));
        button_area.add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("1");
                    current_num = 1;
                } else {
                    float appendfloat = 1;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_2 = new JButton(Integer.toString(2));
        button_area.add(button_2);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("2");
                    current_num = 2;
                } else {
                    float appendfloat = 2;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_3 = new JButton(Integer.toString(3));
        button_area.add(button_3);
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("3");
                    current_num = 3;
                } else {
                    float appendfloat = 3;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_add = new JButton("+");
        button_area.add(button_add);
        button_add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                // calcReadOut.setText("   ");
                // last_num = current_num;
                // history.setText("" + current_num);
                // history.append("\n" + current_num);
                // current_num = 0;
                if (operator == "~") {
                    last_num = current_num;
                    history.setText("" + current_num);
                } else if (operator == "+") {
                    result = last_num+current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "-") {
                    result = last_num-current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "*") {
                    result = last_num*current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "/") {
                    result = last_num/current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else {
                    last_num = current_num;
                    history.setText("" + current_num);
                    current_num = 0;
                }
                current_num = 0;
                operator = "+"; 
            }
        });

        JButton button_AC = new JButton("A/C");
        button_area.add(button_AC);
        button_AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                calcReadOut.setText("");
                history.setText("");
                last_num = 0;
                current_num = 0;
                operator = "~";
            }
        });

        JButton button_0 = new JButton(Integer.toString(0));
        button_area.add(button_0);
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                if (current_num == 0){
                    calcReadOut.setText("0");
                    current_num = 0;
                } else {
                    float appendfloat = 0;
                    current_num *= 10;
                    current_num += appendfloat;
                    calcReadOut.setText("" + current_num);
                }
            }
        });

        JButton button_minus = new JButton("-");
        button_area.add(button_minus);
        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                calcReadOut.setText("   ");
                // history.append("\n" + current_num);
                if (operator == "~") {
                    last_num = current_num;
                    history.setText("" + current_num);
                } else if (operator == "+") {
                    result = last_num+current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "-") {
                    result = last_num-current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "*") {
                    result = last_num*current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else if (operator == "/") {
                    result = last_num/current_num;
                    current_num = result;
                    last_num = current_num;
                    history.setText("" + current_num);
                    // Display result
                    calcReadOut.setText("" + result);
                } else {
                    last_num = current_num;
                    history.setText("" + current_num);
                    current_num = 0;
                }
                current_num = 0;
                operator = "-";
            }
        });

        JButton button_equal = new JButton("=");
        button_area.add(button_equal);
        button_equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent i) {
                // Perform operations
                if (operator == "+") {
                    result = last_num+current_num;
                } else if (operator == "-") {
                    result = last_num-current_num;
                } else if (operator == "*") {
                    result = last_num*current_num;
                } else if (operator == "/") {
                    result = last_num/current_num;
                } else {
                    result = current_num;
                }
                operator = "~";
                last_num = current_num;
                current_num = result;
                // Display result
                calcReadOut.setText("" + result);
            }
        });

    }

    public void display() {
        //Display the window.
        window.setVisible(true);
    }

    public static void main(String[] args) {
            Calculator Calculator = new Calculator();
            Calculator.display();
    }
}