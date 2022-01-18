package ru.gb.java1.lesson8;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private JButton num[] = new JButton[10];
    private Font font =new Font("Arial",Font.PLAIN,25);

    public Panel() {
        setLayout(null);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num[i*3+j+1]=new JButton((i*3+j+1)+"");
                num[i*3+j+1].setBounds(i*(70+5)+5,j*(70+5)+70,70,70);
                num[i*3+j+1].setFont(font);
                add(num[i*3+j+1]);
            }
        }
    }
}
