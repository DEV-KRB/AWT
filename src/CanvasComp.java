import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CanvaComp extends JFrame {

    public CanvaComp(){

        Frame frame = new Frame();

        frame.setBackground (Color.GRAY);


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(new MyCanvas());

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        CanvaComp canvaComp = new CanvaComp();
    }
}

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