package com.company;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class mainDraw extends JComponent {

    public int x = 50;
    public int y = 50;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0,500,600,500);
        g.drawRect(x, y, 50, 50);
        g.fillRect(x, y, 50, 50);
        g.setColor(Color.BLACK);
    }

    public void moveRight() {
        if (x == 540){

        }
        else{
            x = x + 2;
            repaint();
        }


    }

    public void moveLeft() {
        if (x == 0){

        }
        else{
            x = x - 2;
            repaint();
        }
    }

    public void moveDown() {
        if (y == 450){

        }
        else{
            y = y + 2;
            repaint();
        }
    }

    public void moveUp() {
        if (y == 0){

        }
        else{
            y = y - 2;
            repaint();
        }
    }
}
