package uppgift_6;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class AppFrame extends JFrame{

	JFrame frame;
	PersonRegister register;

	private JButton btnAddPerson = new JButton("Add person");
	private JButton btnRemovePerson = new JButton("Remove person");
	private JButton btnFindPerson = new JButton("Find person");

	private JButton btnAddAccount = new JButton("Add account");
	private JButton btnFindAccount = new JButton("Find Account");
	private JButton btnWithdraw = new JButton("Withdraw");
	private JButton btnAddCredits = new JButton("Add credits");

	private JTextField textField_Name = new JTextField();
	private JTextField textField_SocSecurity = new JTextField();
	private JTextField textField_AccNbr = new JTextField();
	private JTextField textField_Credits = new JTextField();

	private JLabel lblName = new JLabel("Name:");
	private JLabel lblSocialSocSecurity = new JLabel("Social security:");
	private JLabel lblAccNbr = new JLabel("Acc number:");
	private JLabel lblCredits = new JLabel("Credits:");

	private JTextArea textArea_Konton = new JTextArea();
	private final JButton btnAllAccAndCred = new JButton("All Accounts and Credits");
	private final JLabel lblRespons = new JLabel("Respons");
	private final JScrollPane scrollPane = new JScrollPane();
	

	AppFrame() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 629, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// Textfield
		textField_Name.setBounds(108, 36, 96, 19);
		frame.getContentPane().add(textField_Name);
		textField_Name.setColumns(10);

		textField_SocSecurity.setBounds(108, 77, 96, 19);
		frame.getContentPane().add(textField_SocSecurity);
		textField_SocSecurity.setColumns(10);

		textField_AccNbr.setBounds(108, 175, 96, 19);
		frame.getContentPane().add(textField_AccNbr);
		textField_AccNbr.setColumns(10);

		textField_Credits.setBounds(108, 205, 96, 19);
		frame.getContentPane().add(textField_Credits);
		textField_Credits.setColumns(10);
	
		// Knappar
		btnAddPerson.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAddPerson.setBounds(236, 29, 133, 30);
		frame.getContentPane().add(btnAddPerson);

		btnRemovePerson.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnRemovePerson.setBounds(236, 70, 133, 30);
		frame.getContentPane().add(btnRemovePerson);

		btnFindPerson.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnFindPerson.setBounds(236, 110, 133, 31);
		frame.getContentPane().add(btnFindPerson);

		btnAddAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAddAccount.setBounds(10, 235, 133, 25);
		frame.getContentPane().add(btnAddAccount);

		btnWithdraw.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnWithdraw.setBounds(147, 271, 133, 25);
		frame.getContentPane().add(btnWithdraw);

		btnAddCredits.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAddCredits.setBounds(10, 271, 133, 25);
		frame.getContentPane().add(btnAddCredits);

		// Labels

		lblName.setFont(new Font("Arial", Font.PLAIN, 12));
		lblName.setBounds(10, 39, 45, 13);
		frame.getContentPane().add(lblName);

		lblSocialSocSecurity.setFont(new Font("Arial", Font.PLAIN, 12));
		lblSocialSocSecurity.setBounds(10, 80, 91, 13);
		frame.getContentPane().add(lblSocialSocSecurity);

		lblAccNbr.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAccNbr.setBounds(10, 179, 91, 13);
		frame.getContentPane().add(lblAccNbr);

		lblCredits.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCredits.setBounds(10, 208, 51, 13);
		frame.getContentPane().add(lblCredits);
		scrollPane.setBounds(290, 240, 313, 194);
		
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportView(textArea_Konton);

		// Textarea

		textArea_Konton.setEditable(false);
		
		btnFindAccount = new JButton("Find Account");
		btnFindAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnFindAccount.setBounds(147, 235, 133, 24);
		frame.getContentPane().add(btnFindAccount);
		
		btnAllAccAndCred.setFont(new Font("Dialog", Font.PLAIN, 12));
		btnAllAccAndCred.setBounds(56, 307, 180, 23);
		frame.getContentPane().add(btnAllAccAndCred);
		lblRespons.setBounds(422, 225, 74, 14);
		
		frame.getContentPane().add(lblRespons);
		

	}
	public JTextField getTextFieldName() {
		return textField_Name;
	}
	public JTextField getTextFieldSocSecurity() {
		return textField_SocSecurity;
	}
	public JTextField getTextFieldAddAccount() {
		return textField_AccNbr;
	}
	public JTextField getTextFieldCredits() {
		return textField_Credits;
	}
	public JButton getBtnAddPerson() {
		return btnAddPerson;
	}
	public JButton getBtnRemovePerson() {
		return btnRemovePerson;
	}
	public JButton getBtnFindPerson() {
		return btnFindPerson;
	}
	public JButton getBtnAddAccount() {
		return btnAddAccount;
	}
	public JButton getBtnWithdraw() {
		return btnWithdraw;
	}
	public JButton getBtnFindAccount() {
		return btnFindAccount;
	}
	public JButton getBtnAddCredits() {
		return btnAddCredits;
	}
	public JButton getbtnAllAccAndCred() {
		return btnAllAccAndCred;
	}
	
	public void setRegister(PersonRegister register) {
		this.register = register;
	}
	public PersonRegister getRegister() {
		return register;
	}
	public JTextArea getTextArea() {
		return textArea_Konton;
	}
}
