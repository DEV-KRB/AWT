import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonComp {

    public ButtonComp(){

        Frame frame = new Frame("Button Component");
        Button button = new Button("click me");
        button.setBounds(100, 100, 200, 50);
        Label label = new Label("Hey click on the Button");
        label.setBounds(200,200,300,30);
        frame.add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Clicked");
            }
        });
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        ButtonComp bcomp = new ButtonComp();
    }
}
