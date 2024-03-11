package LabSession2;

import java.awt.FlowLayout;
import java.util.Observable;
import javax.swing.*;
import java.util.Observer;

public class WindowTextView  extends JPanel implements Observer {

    JTextField jtfWindow;
    JLabel jtlWindow;
    JButton action;

    WindowTextView (){ this.setLayout(new FlowLayout()); jtfWindow = new JTextField(20); jtlWindow = new JLabel("Window"); action = new JButton("Enable-Disable");

        add(action);add(jtlWindow);add(jtfWindow);

    }

    public void update(Observable o, Object arg) { String s = ""+((Window)o).getTemperature();

        jtfWindow.setText(s);

    }

    public void addEnableDisableListener(TemperatureController.EnableDisableListener listener) {

        action.addActionListener(listener);

    }

}
