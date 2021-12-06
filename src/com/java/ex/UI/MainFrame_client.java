package com.java.ex.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.java.ex.Book.exit_page;
import com.java.ex.Book.rental_page;
import com.java.ex.Book.rental_status_page;
import com.java.ex.Book.return_page;

import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;

public class MainFrame_client extends JFrame {

	private JPanel contentPane;
	private rental_page rental;
	private return_page returns;
	private rental_status_page reStatus;
	private exit_page exit;
	private JTextField searchField;
	private JTable table;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame_client frame = new MainFrame_client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame_client() {
		setTitle("도서관리 프로그램(사용자용)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);
		tp.setBounds(5, 5, 830, 26);
		
		rental = new rental_page();
		returns = new return_page();
		reStatus = new rental_status_page();
		exit = new exit_page();
		
		//tp.addTab("대여", rental);
		tp.addTab("반납", returns);
		tp.addTab("대출 현황", reStatus);
		tp.addTab("종료", exit);
		
		contentPane.add(tp);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBounds(33, 79, 179, 176);
		contentPane.add(searchPanel);
		searchPanel.setLayout(null);
		
		JButton searchBtn = new JButton("검색");
		searchBtn.setBounds(44, 130, 97, 23);
		searchPanel.add(searchBtn);
		
		searchField = new JTextField();
		searchField.setBounds(12, 70, 155, 23);
		searchPanel.add(searchField);
		searchField.setColumns(10);
		
		JComboBox searchBox = new JComboBox();
		searchBox.setModel(new DefaultComboBoxModel(new String[] {"도서명", "출판사", "저자명"}));
		searchBox.setBounds(36, 23, 105, 23);
		searchPanel.add(searchBox);
		
		table = new JTable();
		table.setBounds(250, 104, 497, 125);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("도서 검색");
		lblNewLabel.setBounds(83, 54, 57, 15);
		contentPane.add(lblNewLabel);
	}
}
