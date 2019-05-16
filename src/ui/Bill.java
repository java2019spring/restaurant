package ui;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import ui.Plate_util;

public class Bill implements ActionListener
{
	static String[] colors = { "blue", "green", "purple", "yellow", "orange", "red", "coffee" };
	static String[] colors_CN = { "��ɫ", "��ɫ", "��ɫ", "��ɫ", "��ɫ", "��ɫ", "����" };
    static int[] prices = { 8, 10, 12, 16, 18, 20, 24 };
    static int color_type_num=7;
	
    
	JFrame jframe;
	JPanel jpanel;
	int tot_price;
	
	int calc_total_price(int[] _num_list)
	{
		int tot_price=0;
		for(int i=0;i<color_type_num;++i)
			tot_price+=_num_list[i]*prices[i];
		return tot_price;
	}
	
	
	public void actionPerformed(ActionEvent e)
	{

		jframe.remove(jpanel);
		Cashier cashier=new Cashier(jframe,tot_price);

	}

	Bill(JFrame _jframe,int[] _num_list,String _file_path)
	{
		String img_path=_file_path;
		jframe=_jframe;
		jpanel=new JPanel();
		String str_bill="";
//		str_bill+="Blue plate: 1\n";
//		str_bill+="Yellow plate: 1\n";
		for(int i=0;i<color_type_num;++i)
		{
			str_bill+=colors_CN[i]+" "+String.valueOf(_num_list[i])+"\n";
		}
		
		
		
		tot_price=calc_total_price(_num_list);
		String str_tot_price="�ܼ�: "+String.valueOf(tot_price);
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
		JButton confirm_button=new JButton("ȷ��");
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

