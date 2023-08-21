import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarComp {

    public ScrollbarComp(){

        Frame frame = new Frame();
        Label label = new Label("Hello There!!");
        label.setBounds(100,100,200,50);

        Scrollbar scrollbar = new Scrollbar();
        scrollbar.setBounds(30,100,50,100);
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                String raw = "Clicked on " + scrollbar.getValue();
                label.setText(raw);
            }
        });

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.add(scrollbar);
        frame.add(label);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {

        ScrollbarComp scrollbarComp = new ScrollbarComp();
    }
}
