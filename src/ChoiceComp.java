import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceComp {
    //choice shows popup menu of choices from which user can select any one of them.
    public ChoiceComp(){

        Frame frame = new Frame();
        Choice choice = new Choice();
        choice.setBounds(50, 100, 100, 20);
        choice.add("Java");
        choice.add("C");
        choice.add("Python");
        choice.add("Php");
        choice.setVisible(true);

        Button button = new Button("Click");
        button.setBounds(300, 100, 50, 20);

        Label label = new Label("Oh!! Hello there.");
        label.setBounds(200, 100, 100, 20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String raw = "Clicked on " + choice.getItem(choice.getSelectedIndex());
                label.setText(raw);
            }
        });

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.add(choice);
        frame.add(button);
        frame.add(label);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {

        ChoiceComp choiceComp= new ChoiceComp();
    }
}
