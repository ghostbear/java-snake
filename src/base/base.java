package base;

import javax.swing.*;
import java.awt.*;

public class base {
    public static void main(String[] args) {
        window h = new window();
        h.setVisible(true);
        h.setPreferredSize(new Dimension(220, 270));
        h.setMinimumSize(new Dimension(220, 270));
        h.setMaximumSize(new Dimension(220, 270));
        h.setLocation(100, 100);
        h.setTitle("Snake: The new Beginnings");
        h.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}