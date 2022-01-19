package ru.gb.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class CalcWindow extends JFrame {
    public CalcWindow() throws HeadlessException {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 410);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new Panel());
        setVisible(true);
    }

}
