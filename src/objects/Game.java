package objects;

import utils.KeyInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {

    private Timer timer;
    private Player p1;
    public Game(){
        this.setOpaque(false);
        p1=new Player(100,900);
        setFocusable(true);
        timer=new Timer(14,this);
        timer.start();
        addKeyListener(new KeyInputs(p1));
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d=(Graphics2D) g;
        p1.draw(g2d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        p1.tick();
        repaint();
    }
}
