package com.java.ex.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField pwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel id = new JLabel("ID");
		id.setBounds(42, 57, 57, 15);
		contentPane.add(id);
		
		JLabel passwd = new JLabel("PW");
		passwd.setBounds(42, 110, 57, 15);
		contentPane.add(passwd);
		
		idField = new JTextField();
		idField.setBounds(111, 50, 217, 29);
		contentPane.add(idField);
		idField.setColumns(10);
		
		pwField = new JTextField();
		pwField.setColumns(10);
		pwField.setBounds(111, 96, 217, 29);
		contentPane.add(pwField);
		
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.setForeground(Color.BLACK);
		LoginBtn.setBackground(Color.WHITE);
		LoginBtn.setBounds(82, 173, 97, 23);
		contentPane.add(LoginBtn);
		
		JButton JoinBtn = new JButton("회원가입");
		JoinBtn.setForeground(Color.BLACK);
		JoinBtn.setBackground(Color.WHITE);
		JoinBtn.setBounds(231, 173, 97, 23);
		contentPane.add(JoinBtn);
		
		JButton idpwBtn = new JButton("ID/PW 찾기");
		idpwBtn.setForeground(Color.BLACK);
		idpwBtn.setBackground(Color.WHITE);
		idpwBtn.setBounds(157, 219, 97, 23);
		contentPane.add(idpwBtn);
	}
}
