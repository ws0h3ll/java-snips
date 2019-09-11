import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class gui{
    private static int count=0;
    private static JLabel counter;
    public static void main(String[] args){
        JFrame frame = new JFrame("My first GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            frame.setVisible(true);
        JPanel panel = new JPanel();
            panel.setLayout(null);
            frame.add(panel);
        JButton button = new JButton("press"+count);
            frame.getContentPane().add(button);
        counter = new JLabel(""+count);
            counter.setBounds(50,100,100,50);
            panel.add(counter);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                count++;
                button.setText(""+count);
                System.out.println(count);
            }
        });
    }
}
