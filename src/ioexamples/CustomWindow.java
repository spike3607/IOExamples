package ioexamples;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CustomWindow extends JFrame implements ActionListener {

    private JLabel lblPrompt;
    private JLabel lblOutput;
    private JButton btnSayHello;
    private JTextField txtName;
    private Container c;
    private JPanel panel;
    
    public CustomWindow() {
        lblPrompt = new JLabel("Enter your name:");
        lblOutput = new JLabel();
        btnSayHello = new JButton("Say Hello");
        btnSayHello.addActionListener(this);
        txtName = new JTextField(25);
        panel = new JPanel();
        panel.add(lblPrompt);
        panel.add(txtName);
        c = getContentPane();
        c.add(panel, BorderLayout.NORTH);
        c.add(lblOutput, BorderLayout.SOUTH);
        c.add(btnSayHello, BorderLayout.CENTER);
        
        setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText();
        String msg = "Hello, " + name;
        lblOutput.setText(msg);
    }
    
    public static void main(String[] args) {
        new CustomWindow().setVisible(true);
    }
    
}
