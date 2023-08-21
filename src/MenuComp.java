import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuComp {

    public MenuComp(){
        Frame frame = new Frame();
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu subMenu = new Menu("Edit");
        MenuItem o1 = new MenuItem("New");
        MenuItem o2 = new MenuItem("Open");
        MenuItem o4 = new MenuItem("Save");
        MenuItem o5 = new MenuItem("Delete");
        MenuItem o6 = new MenuItem("Exit");
        menu.add(o1);
        menu.add(o2);
        subMenu.add(o4);
        subMenu.add(o5);
        menu.add(subMenu);
        menu.add(o6);
        menuBar.add(menu);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setMenuBar(menuBar);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    public static void main(String[] args) {
        MenuComp menuComp = new MenuComp();
    }
}
