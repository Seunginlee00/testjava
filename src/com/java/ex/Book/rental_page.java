package com.java.ex.Book;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;

public class rental_page {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rental_page window = new rental_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public rental_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("대여페이지");
		frame.setBounds(100, 100, 714, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 94, 203, 183);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox searchBox = new JComboBox();
		searchBox.setModel(new DefaultComboBoxModel(new String[] {"도서명", "출판사", "저자명"}));
		searchBox.setBounds(43, 26, 122, 23);
		panel.add(searchBox);
		
		textField = new JTextField();
		textField.setBounds(12, 74, 171, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton searchBtn = new JButton("검색");
		searchBtn.setBounds(57, 128, 95, 23);
		panel.add(searchBtn);
		
		table = new JTable();
		table.setBounds(301, 58, 352, 242);
		frame.getContentPane().add(table);
	}
}
