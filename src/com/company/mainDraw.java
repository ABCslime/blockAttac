package com.company;

import javafx.scene.shape.Rectangle;

import java.awt.*;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

import static java.awt.Color.*;

public class mainDraw extends JComponent {

    Random rand = new Random();
    //public int x = 500 + rand.nextInt((4000) + 1);
    public int x = 500 + rand.nextInt((4000) + 1);
    public int y = 500 + rand.nextInt((4000) + 1);
    public java.util.List<Integer> List = new ArrayList();
    public int sx;
    public int sy;





    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        generator();

        Image img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ANEJ\\Pictures\\igra\\trava.png");
        for (int i=0;i<=List.size()/2;i =i+2){
            g2.drawImage(img2, 50*(List.get(i+1)-1)-x%50-25, 50*(List.get(i)-1)-y%50-25, 50, 50, this);

        }
        g2.setColor(WHITE);
        g2.fill(new Rectangle2D.Double(0, 500, 600, 100));


        g.drawLine(0,500,600,500);
        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ANEJ\\Pictures\\igra\\oseba.png");
        Image meč = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ANEJ\\Pictures\\igra\\meč.png");
        g2.drawImage(img1, 300,250 , 50, 50,this);
        g2.drawImage(meč, 50, 510, 30, 30,this);
        g2.finalize();
        if (sx<=6){
            System.out.println("x<6");
            g2.fill(new Rectangle2D.Double(0, 0, 300-x, 600));

        }
        if (sy<=6){
            System.out.println("y<6");
            g2.fill(new Rectangle2D.Double(0, 0, 600, 250-y));

        }
        if (sx>=96){
            System.out.println("x>94");
            g2.fill(new Rectangle2D.Double(5350-x, 0, 600, 600));

        }
        if (sy>=96){
            System.out.println("y>94");
            g2.fill(new Rectangle2D.Double(0, 5300-y, 600, y-4800));

        }
    }

    private void generator() {

        sx = x/50-(x%50)/50;
        sy = y/50-(y%50)/50;
        System.out.println(sx);
        System.out.println(sy);
        for(int i=1; i<=12; i++) {

            for (int m = 1; m <= 15; m++) {


                    List.add(i);
                    List.add(m);




            }


        }


    }



    public void moveRight() {
        if (x >= 4990){

        }
        else{
            x = x + 10;
            repaint();
        }


    }

    public void moveLeft() {
        if (x <= 10){

        }
        else{
            x = x - 10;
            repaint();
        }
    }

    public void moveDown() {
        if (y >= 4990){

        }
        else{
            y = y + 10;
            repaint();
        }
    }

    public void moveUp() {
        if (y <= 10){

        }
        else{
            y = y - 10;
            repaint();
        }
    }
}
