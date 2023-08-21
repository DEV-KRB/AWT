import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListComp {

    public ListComp(){

        Frame frame = new Frame();
        List list = new List();
        list.setBounds(50, 100, 100, 50);
        list.add("java");
        list.add("python");
        list.add("php");
        list.add("c++");
        list.add("html");
        list.add("css");
        list.add("js");
        list.add("bootstrap");

        Label label = new Label("Hey There!! ");
        label.setBounds(150, 200, 200, 20);

        Button button = new Button("Click");
        button.setBounds(200, 100, 50, 20);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String raw = "You have clicked on " + list.getItem(list.getSelectedIndex());
                label.setText(raw);
            }
        });

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.add(list);
        frame.add(label);
        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        ListComp listComp = new ListComp();
    }
}
