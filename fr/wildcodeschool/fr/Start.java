package fr.wildcodeschool.fr;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class Start {
    public static void main(String... args) throws IOException {
        System.out.println(ProcessHandle.current().pid());

        JFrame jf = new JFrame("Gotcha!");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.add(new JLabel(new ImageIcon(new URL("https://i2.cdscdn.com/pdt2/0/6/9/1/700x700/auc0702382629069/rw/chaussons-en-forme-d-emoticone-crotte-pointure-41.jpg"))));
        jf.pack();
        jf.setVisible(true);
    }
}
