package objects;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player extends Positionable {
    private int velx=0;
    private int vely=0;
    public Player(int x,int y) {
        super(x,y);
    }
    public void tick(){
        x+=velx;
        y+=vely;
        if (y==200||y==500||y==800){
            vely*=-1;
        } else if (y==500){
            vely=0;
        } else if (y>=1000){
            vely=-1;
        } else if (x<=0){
            velx=1;
        } else if (y<=0){
            vely=1;
        } else if (x>=1880){
            velx=-1;
        }
    }
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_UP){
            vely=-5;
        } else if (key==KeyEvent.VK_DOWN){
            vely=5;
        } else if(key==KeyEvent.VK_RIGHT){
            velx=5;
        } else if (key==KeyEvent.VK_LEFT){
            velx=-5;
        }
    }
    public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_UP){
//            pressedUp=false;
        } else if (key==KeyEvent.VK_DOWN){
            vely=0;
        } else if(key==KeyEvent.VK_RIGHT){
            velx=0;
        } else if (key==KeyEvent.VK_LEFT){
            velx=0;
        }
    }

    public void draw(Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.fillOval(x,y,64,64);
    }

}
