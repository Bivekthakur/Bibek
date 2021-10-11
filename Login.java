package abc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.*;

import java.awt.*;


public class Login extends JFrame {

    Login(){

        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        
        //creating text label
        Label label = new Label("UserName");
        label.setBounds(100,8,70,20);
        add(label);

        JTextField text = new JTextField();
        text.setBounds(100, 27, 70, 20);
        add(text);

        Label label1 = new Label("Password");
        label1.setBounds(100, 55, 70, 20);
        add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(100, 75, 70, 20);
        add(text1);

        JButton button = new JButton("LOGIN");
        button.setBounds(100, 110, 70, 20);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.BLACK);
        add(button);



    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
    
}
