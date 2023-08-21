import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInput;

public class DialogComp {

    static Dialog dialog;
    public DialogComp(){

        Frame frame = new Frame();
        dialog = new Dialog(frame, "Dialog Box", true);
        dialog.setLayout(new FlowLayout());
        Button button = new Button("click");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogComp.dialog.setVisible(false);
            }
        });
        dialog.add(new Label("Click on Button"));
        dialog.add(button);
        dialog.setVisible(true);
        dialog.setSize(300,300);
        frame.setSize(800,800);
    }

    public static void main(String[] args) {

        DialogComp dialogComp = new DialogComp();
    }
}
