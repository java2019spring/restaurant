package ui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class Bill implements ActionListener
{
	JFrame jframe;
	JPanel jpanel;
	public void actionPerformed(ActionEvent e)
	{

		jframe.remove(jpanel);
		Cashier cashier=new Cashier(jframe);

	}
	Bill()
	{
		String img_path="imgs/cappadocia.jpg";
		jframe=new JFrame("Bill");
		jpanel=new JPanel();
		String str_bill="";
		str_bill+="Blue plate: 1\n";
		str_bill+="Yellow plate: 1\n";
//		str_bill+="</body></html>";
		
		int tot_price=0;
		String str_tot_price="TOTAL PRICE: "+String.valueOf(tot_price);
		ImageIcon imageicon=new ImageIcon(img_path);

		JLabel img_label=new JLabel(imageicon);
		img_label.setBounds(10,100,300,300);
		JLabel label_tot_price=new JLabel(str_tot_price);
		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);
		label_tot_price.setFont(font);
		label_tot_price.setBounds(420,380,300,50);
		JTextArea bill_textarea=new JTextArea(str_bill);
		bill_textarea.setEditable(false);
		bill_textarea.setFont(font);
		bill_textarea.setBounds(460,50,300,200);
		
		JButton confirm_button=new JButton("确认");
		confirm_button.setFont(font);
		confirm_button.setBounds(500,400,100,50);
		confirm_button.addActionListener(this);
				

		jpanel.add(img_label);
		jpanel.add(bill_textarea);
		jpanel.add(label_tot_price);
		jpanel.add(confirm_button);
		jpanel.setLayout(null);
		jpanel.setSize(800,600);
		jpanel.setLocation(0,0);
		
		jframe.add(jpanel,BorderLayout.CENTER);
		jframe.setSize(800,600);
		jframe.setLocation(0,0);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	Bill(JFrame _jframe)
	{
		String img_path="imgs/cappadocia.jpg";
		jframe=_jframe;
		jpanel=new JPanel();
		String str_bill="";
		str_bill+="Blue plate: 1\n";
		str_bill+="Yellow plate: 1\n";
	//	str_bill+="</body></html>";
		
		int tot_price=0;
		String str_tot_price="TOTAL PRICE: "+String.valueOf(tot_price);
		ImageIcon imageicon=new ImageIcon(img_path);
	
		JLabel img_label=new JLabel(imageicon);
		img_label.setBounds(10,100,300,300);
		JLabel label_tot_price=new JLabel(str_tot_price);
		Font font = new Font("Serief", Font.ITALIC + Font.BOLD, 30);
		label_tot_price.setFont(font);
		label_tot_price.setBounds(460,350,300,100);
		JTextArea bill_textarea=new JTextArea(str_bill);
		bill_textarea.setEditable(false);
		bill_textarea.setFont(font);
		bill_textarea.setBounds(460,50,300,300);
		JButton confirm_button=new JButton("确认");
		confirm_button.setFont(font);
		confirm_button.setBounds(500,450,100,50);
		confirm_button.addActionListener(this);
				
	
		jpanel.add(img_label);
		jpanel.add(bill_textarea);
		jpanel.add(label_tot_price);
		jpanel.add(confirm_button);

		jpanel.setSize(800,600);
		jpanel.setLocation(0,0);
		jpanel.setLayout(null);
		
		jframe.add(jpanel);
		jframe.setSize(800,600);
		jframe.setLocation(0,0);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SwingUtilities.updateComponentTreeUI(jframe);
		
	}

}

