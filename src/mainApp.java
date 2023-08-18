import java.awt.*;
import java.awt.event.*;

public class mainApp implements WindowListener, ActionListener {

    Label label;
    public mainApp(){

        Frame frame = new Frame("Title of the Frame");

        //create checkbox
        Checkbox checkbox = new Checkbox("java");
        checkbox.setBounds(20,150,50,30);

        Checkbox checkbox1 = new Checkbox("python");
        checkbox1.setBounds(20,180,50,30);

        frame.add(checkbox);
        frame.add(checkbox1);

        //add text area
        TextArea textArea = new TextArea("");
        textArea.setBounds(250,40,200,200);

        //add text field
        TextField textField = new TextField();
        textField.setBounds(20,120,150,30);
        //textField.setBackground(Color.red);

        //create label
        label = new Label("hello world");
        label.setBounds(20,90,150,30);

        //create button
        Button button = new Button("click me");
        button.setBounds(20,40,80,30);
        // give action to button after click
       /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("button clicked successfully");
            }
        });*/
        button.addActionListener(this);

        frame.add(button);
        frame.add(label);
        frame.add(textField);
        frame.add(textArea);

        //popup window
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);

        //close the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //to get the source
        Frame frame = (Frame)e.getSource();
        //dispose the frame
        frame.dispose();
        System.out.println("windowClosing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("printed successfully");
    }

    public static void main(String [] args){
       mainApp obj1 = new mainApp();
    }
}