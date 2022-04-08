package vacancy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI implements ActionListener{
	private JPanel onePanel = new JPanel(new GridBagLayout());
	private JPanel twoPanel = new JPanel(new GridBagLayout());
	GridBagConstraints conss = new GridBagConstraints();
	JFrame fr = new JFrame();
	JButton bl = new JButton("Login");
	JButton br = new JButton("Register");
	JFrame frL = new JFrame("Logging into VolonterYKT");
	JLabel lbl2 = new JLabel("Password: ");
	JTextField txf = new JTextField(30);
	JTextField txf2 = new JTextField(30);
	JButton btnOK = new JButton("Login");
	JButton btnCN = new JButton("Cancel");
	protected UI() {
		bl.addActionListener(this);
		br.addActionListener(this);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setTitle("Join to our VolonterYKT community!");
		fr.setLayout(new FlowLayout());
		fr.add(bl);
		fr.add(br);
		fr.setSize(378, 75);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bl) {
			fr.setVisible(false);
			LoginUI();
		}else if(e.getSource() == br) {
			fr.setVisible(false);
		}else if(e.getSource() == btnOK){
			App.Login(txf.getText(), txf2.getText());
		}else if(e.getSource() == btnCN){
			fr.setVisible(true);
		}
	}
	protected void LoginUI() {
		frL.setLayout(new FlowLayout());
		conss.gridx = 0;
		conss.gridy = 2;
		onePanel.add(new JLabel("Mail: "), conss);
		conss.gridx = 1;
	    onePanel.add(txf,conss);
	    conss.gridx = 5;
		twoPanel.add(new JLabel("Mail: "), conss);
	    twoPanel.add(txf,conss);
	    frL.add(onePanel);
	    frL.add(twoPanel);
		btnOK.addActionListener(this);
		btnCN.addActionListener(this);
		frL.pack();
		frL.setResizable(false);
		frL.setLocationRelativeTo(null);
		frL.setVisible(true);
	}
}
