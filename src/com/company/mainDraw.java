package com.company;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class mainDraw extends JComponent {

    Random rand = new Random();
    //public int x = 500 + rand.nextInt((4000) + 1);
    int x = 4950;
    public int y = 500 + rand.nextInt((4000) + 1);
    public java.util.List<Integer> List = new ArrayList();
    public int sx;
    public int sy;




    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        generator();
        System.out.println(List);
        Image img2 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ANEJ\\Pictures\\igra\\trava.png");
        for (int i=0;i<=List.size()/2;i =i+2){
            g2.drawImage(img2, 50*(List.get(i+1)-1)-x%50-25, 50*(List.get(i)-1)-y%50-25, 50, 50, this);

        }
        g.drawLine(0,500,600,500);
        Image img1 = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ANEJ\\Pictures\\igra\\oseba.png");
        g2.drawImage(img1, 300,250 , 50, 50,this);
        g2.finalize();
        g.setColor(Color.BLACK);
    }

    private void generator() {

        sx = x/50-(x%50)/50;
        sy = y/50-(y%50)/50;
        System.out.println(sx);
        System.out.println(sy);
        for(int i=1; i<=12; i++) {

            for (int m = 1; m <= 14; m++) {
                int si = sy -7 + i;
                int sm = sx -8 + m;
                if (si > -1 && si < 100 && sm > -1 && sm < 100) {
                    List.add(i);
                    List.add(m);


                }

            }


        }


    }



    public void moveRight() {
        if (x == 5000){

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
        if (y == 5000){

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
