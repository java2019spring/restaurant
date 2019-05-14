package ui;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.*;
import ui.Plate_util;

class Cashier
{
	JFrame jframe;
	JPanel jpanel;
	Cashier()
	{
		JFrame jf=new JFrame();
		new Cashier(jf);
	}
	Cashier(JFrame _jframe)
	{
		jframe=_jframe;

		int int_price=0;
		String qr_path="imgs/qr_hello.png";
		
//		JFrame jframe=new JFrame("Cashier");
		
		String str_cashier="<html><body>";
		str_cashier+="«Î»∑»œ÷ß∏∂£∫";
		str_cashier+="£§"+String.valueOf(int_price);
		str_cashier+="</body></html>";
		
		ImageIcon imageicon=new ImageIcon(qr_path);
		JLabel label_img=new JLabel(imageicon);
		

		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);

		JLabel label_cashier=new JLabel(str_cashier);
		label_cashier.setFont(font);
		
		label_img.setBounds(480,100,300,300);
		label_cashier.setBounds(20,250,250,100);
		
		jpanel=new JPanel();
		jpanel.add(label_cashier);
		jpanel.add(label_img);
		jpanel.setLayout(null);

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
//	public static void main(String[] args)
//	{
//		
//	}
}


