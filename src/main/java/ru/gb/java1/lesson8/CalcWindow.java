package ru.gb.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class CalcWindow extends JFrame {
    public CalcWindow() throws HeadlessException {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 320, 410);
        add(new Panel());
        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }

}
