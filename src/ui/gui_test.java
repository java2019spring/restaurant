package ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Font;

public class gui_test
{
	
	static void test_checkbox()
	{
		JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
        JCheckBox bCheckBox = new JCheckBox("����Ӣ��");
        //���� Ϊ Ĭ�ϱ�ѡ�� 
        bCheckBox.setSelected(true);
        bCheckBox.setBounds(50, 50, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("ħ��Ӣ��");
        bCheckBox2.setBounds(50, 100, 130, 30);
        //�ж� �Ƿ� �� ѡ�� 
        System.out.println(bCheckBox2.isSelected());

        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
	}
	
	static void test_button()
	{
		JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JButton b = new JButton("һ����Է����ع�");
        b.setBounds(50, 50, 280, 30);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
	}
	
	static void test_radiobutton()
	{
		JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 200);
        f.setLayout(null);
        JRadioButton b1 = new JRadioButton("����Ӣ��");
        // ���� Ϊ Ĭ�ϱ�ѡ��
        b1.setSelected(true);
        b1.setBounds(50, 50, 130, 30);
        JRadioButton b2 = new JRadioButton("ħ�� Ӣ��");
        b2.setBounds(50, 100, 130, 30);

        System.out.println(b2.isSelected());

        f.add(b1);
        f.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
	}
	
	static void cashier()
	{
		String img_path="imgs/cappadocia.jpg";
		JFrame jframe=new JFrame("Cashier");
		String str_bill="<html><body>";
		str_bill+="Blue plate: 1<br>";
		str_bill+="Yellow plate: 1<br>";
		str_bill+="</body></html>";
		
		int tot_price=0;
		String str_tot_price="TOTAL PRICE: "+String.valueOf(tot_price);
		ImageIcon imageicon=new ImageIcon(img_path);

		JLabel label_img=new JLabel(imageicon);
		JLabel label_tot_price=new JLabel(str_tot_price,JLabel.CENTER);
		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);
		label_tot_price.setFont(font);
		JLabel label_bill=new JLabel(str_bill);
		label_bill.setFont(font);
		
//		 jButton = new JButton("�м�");
//	        jButton2 = new JButton("����");
//	        jButton3 = new JButton("����");
//	        jButton4 = new JButton("����");
//	        jButton5 = new JButton("�ϱ�");
//		jframe.add(jButton, BorderLayout.CENTER);  //���ֵ��м�
//		jframe.add(jButton2, BorderLayout.NORTH);  //���ֵı���
//	    jframe.add(jButton3, BorderLayout.WEST);   //���ֵ�����
//		jframe.add(jButton4, BorderLayout.EAST);   //���ֵĶ���
//		jframe.add(jButton5, BorderLayout.SOUTH);  //���ֵ��ϱ�
		jframe.add(label_img,BorderLayout.WEST);
		jframe.add(label_bill, BorderLayout.EAST);
		jframe.add(label_tot_price,BorderLayout.SOUTH);
		jframe.setTitle("Cashier");
		jframe.setSize(800,600);
		jframe.setLocation(0,0);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
    public static void main(String[] args)
    {

    	cashier();
    }
}