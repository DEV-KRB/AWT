import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldComp {

    public TextFieldComp(){

        Frame frame = new Frame("Text Field Component");
        TextField textField = new TextField("");
        textField.setBounds(200,200,300,30);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(textField);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        TextAreaComp tac = new TextAreaComp();
    }
}
