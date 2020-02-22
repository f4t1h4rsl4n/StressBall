package utils;


import objects.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInputs extends KeyAdapter {

    private Player p;
    public KeyInputs(Player p){
        this.p=p;
    }
    public void keyPressed(KeyEvent e){
    p.keyPressed(e);
    }
    public void keyReleased(KeyEvent e){
    p.keyReleased(e);
    }

}
