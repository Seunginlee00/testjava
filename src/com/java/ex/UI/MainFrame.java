package com.java.ex.UI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import com.java.ex.Book.exit_page;
import com.java.ex.Book.rental_page;
import com.java.ex.Book.rental_status_page;
import com.java.ex.Book.return_page;


public class MainFrame extends JFrame {
	
	private JTabbedPane tp;
	private rental_page rental;
	private return_page returns;
	private rental_status_page reStatus;
	private exit_page exit;
	private JButton btnLogIn = new JButton("�α���"); // ������ ��� ��ư ����
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		rental = new rental_page();
		returns = new return_page();
		reStatus = new rental_status_page();
		exit = new exit_page();
		
		//tp.addTab("�뿩", rental);
		tp.addTab("�ݳ�", returns);
		tp.addTab("���� ��Ȳ", reStatus);
		tp.addTab("����", exit);
		btnLogIn.setPreferredSize(new Dimension(125, 25));
		
		
		getContentPane().add(tp);
		setTitle("���� ���� ������ (����ڿ�)");
		
		setBounds(100, 100, 1052, 677);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

}
