package ru.gb.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private String operation = "";
    private String num1 = "";
    private String num2 = "";
    private JButton num[] = new JButton[10];
    private JButton action[] = new JButton[5];
    private Font font = new Font("Arial", Font.PLAIN, 35);
    private JTextField textField = new JTextField();
    private Calc calc = new Calc();
    private ActionListener list =new Listener();
    private Listener l = new Listener();


    public Panel() {
        setLayout(null);

        JButton zero = new JButton("0");
        zero.setBounds(80, 295, 70, 70);
        zero.setFont(font);
        add(zero);

        action[0] = new JButton("+");
        action[0].setBounds(230, 70, 70, 70);
        action[0].setFont(font);
        add(action[0]);

        action[1] = new JButton("-");
        action[1].setBounds(230, 145, 70, 70);
        action[1].setFont(font);
        add(action[1]);

        action[2] = new JButton("*");
        action[2].setBounds(230, 220, 70, 70);
        action[2].setFont(font);
        add(action[2]);

        action[3] = new JButton("/");
        action[3].setBounds(155, 295, 70, 70);
        action[3].setFont(font);
        add(action[3]);

        action[4] = new JButton("=");
        action[4].setBounds(230, 295, 70, 70);
        action[4].setFont(font);
        add(action[4]);

        textField.setBounds(5, 5, 295, 60);
        textField.setFont(font);
        textField.setEditable(false);
        add(textField);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                System.out.println(i*3+j+1);
                num[i * 3 + j + 1] = new JButton((i * 3 + j + 1) + "");
                num[i * 3 + j + 1].setBounds(i * (70 + 5) + 5, j * (70 + 5) + 70, 70, 70);
                num[i * 3 + j + 1].setFont(font);
                add(num[i * 3 + j + 1]);
                num[i * 3 + j + 1].addActionListener(list);
            }
        }
        action[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation == "" && num1 != "") {
                    textField.setText(textField.getText() + action[0].getText());
                    operation = action[0].getText();
                }
            }
        });
        action[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation == "" && num1 != "") {
                    textField.setText(textField.getText() + action[1].getText());
                    operation = action[1].getText();
                }
            }
        });
        action[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation == "" && num1 != "") {
                    textField.setText(textField.getText() + action[2].getText());
                    operation = action[2].getText();
                }
            }
        });
        action[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation == "" && num1 != "") {
                    textField.setText(textField.getText() + action[3].getText());
                    operation = action[3].getText();
                }
            }
        });
        action[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num1 != "" && num2 != "") {
                    textField.setText(calc.calc(num1, num2, operation));
                    operation = "";
                    num1 = textField.getText();
                    num2 = "";

                }
            }
        });

//        num[1].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[1].getText());
//                    num1 = num1 + num[1].getText();
//                } else {
//                    textField.setText(textField.getText() + num[1].getText());
//                    num2 = num2 + num[1].getText();
//                }
//            }
//        });
//        num[2].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[2].getText());
//                    num1 = num1 + num[2].getText();
//                } else {
//                    textField.setText(textField.getText() + num[2].getText());
//                    num2 = num2 + num[2].getText();
//                }
//            }
//        });
//        num[3].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[3].getText());
//                    num1 = num1 + num[3].getText();
//                } else {
//                    textField.setText(textField.getText() + num[3].getText());
//                    num2 = num2 + num[3].getText();
//                }
//            }
//        });
//        num[4].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[4].getText());
//                    num1 = num1 + num[4].getText();
//                } else {
//                    textField.setText(textField.getText() + num[4].getText());
//                    num2 = num2 + num[4].getText();
//                }
//            }
//        });
//        num[5].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[5].getText());
//                    num1 = num1 + num[5].getText();
//                } else {
//                    textField.setText(textField.getText() + num[5].getText());
//                    num2 = num2 + num[5].getText();
//                }
//            }
//        });
//        num[6].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[6].getText());
//                    num1 = num1 + num[6].getText();
//                } else {
//                    textField.setText(textField.getText() + num[6].getText());
//                    num2 = num2 + num[6].getText();
//                }
//            }
//        });
//        num[7].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[7].getText());
//                    num1 = num1 + num[7].getText();
//                } else {
//                    textField.setText(textField.getText() + num[7].getText());
//                    num2 = num2 + num[7].getText();
//                }
//            }
//        });
//        num[8].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[8].getText());
//                    num2 = num2 + num[8].getText();
//                } else {
//                    textField.setText(textField.getText() + num[8].getText());
//                    num2 = num2 + num[8].getText();
//                }
//            }
//        });
//        num[9].addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (operation == "") {
//                    textField.setText(textField.getText() + num[9].getText());
//                    num1 = num1 + num[9].getText();
//                } else {
//                    textField.setText(textField.getText() + num[9].getText());
//                    num2 = num2 + num[9].getText();
//                }
//            }
//        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation == "") {
                    textField.setText(textField.getText() + zero.getText());
                    num1 = num1 + zero.getText();
                } else {
                    textField.setText(textField.getText() + zero.getText());
                    num2 = num2 + zero.getText();
                }
            }
        });


    }
    public class Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            e.getActionCommand();
            if (operation == "") {
                textField.setText(textField.getText() + e.getActionCommand());
                num1 = num1 + e.getActionCommand();
            } else {
                textField.setText(textField.getText() + e.getActionCommand());
                num2 = num2 + e.getActionCommand();
            }

        }
    }
}
