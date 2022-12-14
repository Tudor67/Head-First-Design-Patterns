import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class SwingObserverExample{
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Come on, do it!");
        }
    }
}