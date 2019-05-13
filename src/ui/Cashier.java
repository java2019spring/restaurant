package ui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;


class Cashier
{
	JFrame jframe;
	JPanel jpanel;
	Cashier()
	{
		int int_price=0;
		String qr_path="imgs/qr_hello.png";
		
		jframe=new JFrame("Cashier");
		
		String str_cashier="<html><body>";
		str_cashier+="请确认支付：";
		str_cashier+="￥"+String.valueOf(int_price);
		str_cashier+="</body></html>";
		
		ImageIcon imageicon=new ImageIcon(qr_path);
		JLabel label_img=new JLabel(imageicon);
		

		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);

		JLabel label_cashier=new JLabel(str_cashier);
		label_cashier.setFont(font);
		

		jpanel=new JPanel();
//		jpanel.setLayout(null);
		jpanel.add(label_cashier,BorderLayout.NORTH);
		jpanel.add(label_img,BorderLayout.CENTER);
		

		jpanel.setSize(800,600);
		jpanel.setLocation(0,0);
		
		jframe.add(jpanel,BorderLayout.CENTER);
		jframe.setSize(800,600);
		jframe.setLocation(0,0);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	Cashier(JFrame _jframe)
	{
		jframe=_jframe;

		int int_price=0;
		String qr_path="imgs/qr_hello.png";
		
//		JFrame jframe=new JFrame("Cashier");
		
		String str_cashier="<html><body>";
		str_cashier+="请确认支付：";
		str_cashier+="￥"+String.valueOf(int_price);
		str_cashier+="</body></html>";
		
		ImageIcon imageicon=new ImageIcon(qr_path);
		JLabel label_img=new JLabel(imageicon);
		

		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);

		JLabel label_cashier=new JLabel(str_cashier);
		label_cashier.setFont(font);
		

		jpanel=new JPanel();
		jpanel.add(label_cashier,BorderLayout.NORTH);
		jpanel.add(label_img,BorderLayout.CENTER);

		jpanel.setSize(800,600);
		jpanel.setLocation(0,0);
		
		jframe.add(jpanel);
		jframe.setTitle("Cashier");
		jframe.setSize(800,600);
		jframe.setLocation(0,0);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SwingUtilities.updateComponentTreeUI(jframe);

	}
}


