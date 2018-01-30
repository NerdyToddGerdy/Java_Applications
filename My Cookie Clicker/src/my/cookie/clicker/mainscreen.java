package my.cookie.clicker;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainscreen {
    private JPanel panel1;
    private JButton button1;

    JFrame newFrame = new JFrame();
    int i = 0;

    mainscreen myscreen = new mainscreen(){
            newFrame.getContentPane().add(this, BorderLayout.CENTER);
                newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    newFrame.pack();
                        newFrame.setVisible(true);
                        newFrame.setTitle("Cookie Clicker");
                        jLabel1.setText(1 + "");

    }


    public mainscreen() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                jLabel1.setText(i + "");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
