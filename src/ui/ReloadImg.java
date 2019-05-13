package ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ReloadImg implements ActionListener{
	JFrame frame=new JFrame("Ë¢ÐÂÍ¼Ïñ");
	JPanel pimage=new JPanel();
	ImageIcon gx=new ImageIcon("imgs/cappadocia.jpg");
	ImageIcon wt=new ImageIcon("imgs/qr_hello.png");
	JLabel imgOne=new JLabel(gx);
	JLabel imgTwo=new JLabel(wt);
	JButton fresh=new JButton("Ë¢ÐÂ");
	Boolean b=false;
	ReloadImg(){
		BorderLayout layOut=new BorderLayout();
		pimage.add(imgOne);
		frame.add(pimage,layOut.CENTER);
		frame.add(fresh,layOut.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		fresh.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("Ë¢ÐÂ")){
			if(b==false){
				pimage.remove(imgOne);
				pimage.repaint();
				pimage.add(imgTwo);
				pimage.validate();
				b=true;
			}else{
				pimage.remove(imgTwo);
				pimage.repaint();
				pimage.add(imgOne);
				pimage.validate();
				b=false;
			}
		}
	}
	public static void main(String[] args){
		new ReloadImg();
	}
}
