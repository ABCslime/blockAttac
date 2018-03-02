package com.company;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;


public class mainFrame extends JFrame implements KeyListener{
    private mainDraw draw;

    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            draw.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            draw.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            draw.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            draw.moveUp();
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            draw.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            draw.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            draw.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            draw.moveUp();

    }
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    public mainFrame(){
        this.draw=new mainDraw();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        JLabel jLabel = new JLabel("3");


    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mainFrame frame = new mainFrame();
                frame.setTitle("Square Move Practice");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.draw);
                frame.pack();
                frame.setVisible(true);

                ImageIcon icon = new ImageIcon("C:\\Users\\ANEJ\\Pictures\\igra\\meč.png");
                Image img = icon.getImage();
                Image newing = img.getScaledInstance( 30, 30,  java.awt.Image.SCALE_SMOOTH ) ;
                icon = new ImageIcon( newing );
                JButton b=new JButton(icon);
                b.setBounds(50,510,30,30);
                frame.add(b);
                frame.setLayout(null);
            }
        });
    }
}
