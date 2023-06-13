package Eleventh;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new MyPanel());
        setSize(500, 500);
        setVisible(true);
    }
}

class MyFrameTest {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}