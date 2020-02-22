import objects.Game;

import javax.swing.*;
import java.awt.*;

public class Runner {


    public static void main(String[] args) {

        JFrame frame=new JFrame("bombom");
        frame.setSize(1920,1080);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.getGlassPane();
        frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new Game());
        frame.setVisible(true);
    }
}
