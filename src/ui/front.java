package ui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

public class front {
    public static void welcome() {
        class A_go implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("meile");
                // second();
            }
        }
        class A_quit implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
        // ---------------init--------------
        JFrame f = new JFrame("Settle Account");
        f.setSize(800, 600);
        f.setLocation(580, 240);
        f.setLayout(null);
        // --------------add text --------------
        JLabel title = new JLabel("欢迎使用自助结账");
        title.setForeground(Color.black);
        title.setBounds(50, 125, 500, 50);
        title.setFont(new Font("黑体", Font.PLAIN, 36));
        f.add(title);
        // --------------add button------------
        JButton b_go = new JButton("开始使用");
        b_go.setBounds(500, 450, 100, 50);
        b_go.addActionListener(new A_go());
        f.add(b_go);
        JButton b_quit = new JButton("退出");
        b_quit.setBounds(625, 450, 100, 50);
        b_quit.addActionListener(new A_quit());
        f.add(b_quit);
        // -----------add background------------
        ImageIcon img1 = new ImageIcon("bg.jpg");
        JLabel label1 = new JLabel(img1);
        f.getLayeredPane().add(label1, new Integer(Integer.MIN_VALUE));
        label1.setBounds(400, 0, 400, 300);
        ImageIcon img2 = new ImageIcon("bg2.jpg");
        JLabel label2 = new JLabel(img2);
        f.getLayeredPane().add(label2, new Integer(Integer.MIN_VALUE));
        label2.setBounds(0, 300, 400, 300);

        JPanel p = (JPanel) f.getContentPane();
        p.setOpaque(false);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        welcome();
    }
}