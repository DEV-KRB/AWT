import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyCanvas extends Canvas{
    public MyCanvas(){
        setBackground(Color.GREEN);
        setSize(600,600);
    }

    public void paint(Graphics graphics){
        graphics.setColor(Color.BLUE);
        graphics.fillOval(75,75,150,75);
        graphics.fillRect(100,200,200,100);
    }
}