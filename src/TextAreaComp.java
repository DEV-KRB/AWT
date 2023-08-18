import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaComp {

    public TextAreaComp(){
        Frame frame = new Frame("Text Area Component");
        TextArea textArea = new TextArea("");
        textArea.setBounds(100, 100, 200, 50);

        frame.add(textArea);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
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
