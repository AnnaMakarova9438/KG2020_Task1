package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame w = new JFrame("Окно с изображением");

        w.setSize(600, 750);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        w.setLayout(new BorderLayout(1, 1));

        Canvas canv = new Canvas();
        w.add(canv);
        w.setVisible(true);
    }

}
