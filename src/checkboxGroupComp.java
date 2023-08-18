import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class checkboxGroupComp {

    Label label;
    public checkboxGroupComp() {
        Frame frame = new Frame("Title of the Frame");
        label = new Label("checkbox clicked");
        label.setBounds(200,200,300,30);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("c++", cbg, true);
        checkbox1.setBounds(100, 100, 200, 50);
        Checkbox checkbox2 = new Checkbox("java", cbg, false);
        checkbox2.setBounds(100, 150, 200, 50);

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);

        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("c++ got checked");
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("java got checked");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        checkboxGroupComp obj1 = new checkboxGroupComp();
    }
}
