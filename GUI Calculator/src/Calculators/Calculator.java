package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double firstnum;
	double secoundnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize(textField);
	}

	/**
	 * Initialize the contents of the frame.

	 */
	private void initialize(JTextField textField) {
		frame = new JFrame();
		frame.setBounds(100, 100, 232, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().stextFieldetLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 200, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	//---------------------------- Row 1 --------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText()+btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(60, 54, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(110, 54, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(160, 54, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		//---------------------------- Row 2 --------------------------
		
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn4.getText();
						textField.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 110, 50, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn5.getText();
						textField.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(60, 110, 50, 50);
				frame.getContentPane().add(btn5);
				
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn6.getText();
						textField.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(110, 110, 50, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations="-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(160, 110, 50, 50);
				frame.getContentPane().add(btnSub);
				
		//---------------------------- Row 3 --------------------------
				
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn1.getText();
						textField.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 166, 50, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn2.getText();
						textField.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(60, 166, 50, 50);
				frame.getContentPane().add(btn2);
				
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn3.getText();
						textField.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(110, 166, 50, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnMult = new JButton("x");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations="*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(160, 166, 50, 50);
				frame.getContentPane().add(btnMult);
				
				
//---------------------------- Row 4 --------------------------
				
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btn0.getText();
						textField.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 222, 50, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = textField.getText()+btnDot.getText();
						textField.setText(EnterNumber);
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(60, 222, 50, 50);
				frame.getContentPane().add(btnDot);
				
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(textField.getText());
						textField.setText("");
						operations="/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(110, 222, 50, 50);
				frame.getContentPane().add(btnDiv);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String answer;
						secoundnum = Double.parseDouble(textField.getText());
						if(operations == "+") {
							result = firstnum + secoundnum;
							answer = String.format("%.2", result);
							textField.setText(answer);
						}
						else if(operations == "-") {
							result = firstnum - secoundnum;
							answer = String.format("%.2", result);
							textField.setText(answer);
						}
						else if(operations == "*") {
							result = firstnum * secoundnum;
							answer = String.format("%.2", result);
							textField.setText(answer);
						}
						else if(operations == "/") {
							result = firstnum / secoundnum;
							answer = String.format("%.2", result);
							textField.setText(answer);
						}
						
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(160, 222, 49, 50);
				frame.getContentPane().add(btnEqual);
		
	}
}
