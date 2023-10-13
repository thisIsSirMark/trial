package myFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {

	static final long serialVersionUID = 1L;

	public MyFrame() {
		JTextField textfield = new JTextField();
		JButton[] numButton = new JButton[10];

		this.setFont(new Font("Comic Sans Ms", Font.PLAIN, 20));
		this.setTitle("Ang Mahiwagang Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(350, 455);
		this.setVisible(true);
		this.add(textfield);
		this.add(numButton[1] = new JButton("1"));
		/*
		 * for (int i = 0; i < 10; i++) { numButton[i] = new JButton(String.valueOf(i));
		 * numButton[i].addActionListener(this); numButton[i].setFont(new
		 * Font("Comic Sans Ms", Font.PLAIN, 20)); numButton[i].setFocusable(false);
		 * this.add(numButton[i]); }
		 */

		ImageIcon myIcon = new ImageIcon("doreamonLogo2.png");
		this.setIconImage(myIcon.getImage());
		this.getContentPane().setBackground(new Color(133, 141, 255));

		textfield.setBounds(18, 25, 300, 35);
		textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
		textfield.setEditable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
