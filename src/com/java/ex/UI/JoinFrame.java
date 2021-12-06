package com.java.ex.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;

public class JoinFrame extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField pwField;
	private JTextField nameField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoinFrame frame = new JoinFrame();
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
	public JoinFrame() {
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idField = new JTextField();
		idField.setBounds(127, 37, 185, 29);
		contentPane.add(idField);
		idField.setColumns(10);
		
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		idLabel.setBounds(35, 46, 57, 15);
		contentPane.add(idLabel);
		
		JButton idCheckBtn = new JButton("중복체크");
		idCheckBtn.setFont(new Font("굴림", Font.PLAIN, 16));
		idCheckBtn.setBounds(351, 37, 107, 26);
		contentPane.add(idCheckBtn);
		
		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		pwLabel.setBounds(35, 102, 80, 18);
		contentPane.add(pwLabel);
		
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		nameLabel.setBounds(35, 168, 57, 15);
		contentPane.add(nameLabel);
		
		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		emailLabel.setBounds(35, 232, 57, 15);
		contentPane.add(emailLabel);
		
		JLabel genderLabel = new JLabel("성별");
		genderLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		genderLabel.setBounds(35, 285, 57, 15);
		contentPane.add(genderLabel);
		
		JButton saveBtn = new JButton("저장");
		saveBtn.setFont(new Font("굴림", Font.PLAIN, 16));
		saveBtn.setBounds(101, 388, 97, 23);
		contentPane.add(saveBtn);
		
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setFont(new Font("굴림", Font.PLAIN, 16));
		cancelBtn.setBounds(252, 388, 97, 23);
		contentPane.add(cancelBtn);
		
		JLabel checkLabel = new JLabel("구분");
		checkLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		checkLabel.setBounds(35, 327, 57, 18);
		contentPane.add(checkLabel);
		
		pwField = new JTextField();
		pwField.setColumns(10);
		pwField.setBounds(127, 102, 185, 29);
		contentPane.add(pwField);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(127, 162, 185, 29);
		contentPane.add(nameField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(127, 226, 185, 29);
		contentPane.add(emailField);
		
		JRadioButton manRdbtn = new JRadioButton("남");
		manRdbtn.setBounds(141, 282, 66, 23);
		contentPane.add(manRdbtn);
		
		JRadioButton womanRdbtn = new JRadioButton("여");
		womanRdbtn.setBounds(227, 282, 66, 23);
		contentPane.add(womanRdbtn);
		
		JRadioButton clientRdbtn = new JRadioButton("일반");
		clientRdbtn.setBounds(141, 327, 66, 23);
		contentPane.add(clientRdbtn);
		
		JRadioButton adminRdbtn = new JRadioButton("관리자");
		adminRdbtn.setBounds(227, 327, 66, 23);
		contentPane.add(adminRdbtn);
	}
}
