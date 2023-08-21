import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupMenuComp {

    public PopupMenuComp() {
        Frame frame = new Frame();
        PopupMenu popupMenu = new PopupMenu("Edit");
        MenuItem cut = new MenuItem("cut");
        cut.setActionCommand("cut");
        MenuItem copy = new MenuItem("copy");
        copy.setActionCommand("copy");
        MenuItem paste = new MenuItem("paste");
        paste.setActionCommand("paste");
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(frame, e.getX(),e.getY());
            }
        });
        frame.add(popupMenu);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        PopupMenuComp popupMenuComp = new PopupMenuComp();
    }
}
