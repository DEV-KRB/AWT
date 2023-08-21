import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelComp {

    public PanelComp(){
        Frame frame = new Frame();
        Panel panel = new Panel();
        panel.setBounds(50, 50, 200, 200);

        Button b1 = new Button("Employee");
        b1.setBounds(50, 100, 100, 50);
        Button b2 = new Button("Admin");
        b2.setBounds(50, 50, 100, 50);

        panel.setBackground(Color.GRAY);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        PanelComp panelComp = new PanelComp();
    }
}
