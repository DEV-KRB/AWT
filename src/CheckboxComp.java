import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxComp {

    public CheckboxComp(){

        Frame frame = new Frame("Checkbox Screen");

        Label label = new Label("Checkbox clicked");
        label.setBounds(200,200,300,30);

        Checkbox checkbox1 = new Checkbox("Java");
        checkbox1.setBounds(100, 100, 200, 50);
        Checkbox checkbox2 = new Checkbox("Python");
        checkbox2.setBounds(100, 150, 200, 50);

        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        CheckboxComp cbc = new CheckboxComp();
    }

}
