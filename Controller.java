package uppgift_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {

	private AppFrame appFrame;
	private PersonRegister register;

	public Controller(AppFrame appFrame, PersonRegister register) {
		this.appFrame = appFrame;
		this.register = register;
		declareListeners();
	}

	private void declareListeners() {

		appFrame.getBtnAddPerson().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = appFrame.getTextFieldName().getText();
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				Person findPerson = register.findPerson(socialSecurity);

				if (findPerson != null) {
					appFrame.getTextArea().setText("This person already exists.");
				} else {
					Person p = new Person();
					p.setName(name);
					p.setPNbr(socialSecurity);
					register.addPerson(p);
					appFrame.getTextArea().setText(name + " added.");

				}
			}
		});
		
		appFrame.getBtnRemovePerson().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = appFrame.getTextFieldName().getText();
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				Person findPerson = register.findPerson(socialSecurity);
				
				if (findPerson != null) {
					register.removePerson(socialSecurity);
					appFrame.getTextArea().setText(name + " removed.");
				}else {
					appFrame.getTextArea().setText("Incorrect social security number");
				}
			}
		});
		
		appFrame.getBtnFindPerson().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = appFrame.getTextFieldName().getText();
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				Person findPerson = register.findPerson(socialSecurity);
				
				if (findPerson != null) {
					appFrame.getTextArea().setText("Name: " + findPerson.getName() + "\nSocial security: " + findPerson.getPNbr() + "\nAccounts: " + findPerson.getAccounts() +
							"\nTotal Credits: " + findPerson.totBalance());
					
				}else {
					appFrame.getTextArea().setText("Person not found.");
				}
			}
		});
		appFrame.getBtnAddAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				String accountNumber = appFrame.getTextFieldAddAccount().getText();
				Person findPerson = register.findPerson(socialSecurity);
				Account findAccount = findPerson.findAccount(accountNumber);
				
				if (findPerson != null) {
					if (findAccount == null) {
						Account a = new Account();
						a.setBalance(0);
						a.setNbr(accountNumber);
						a.setOwner(findPerson);
						findPerson.addAccount(a);
						appFrame.getTextArea().setText("Name: " + findPerson.getName() + "\nSocial security: " + findPerson.getPNbr() + "\nAccounts: " + findPerson.getAccounts() + "\nAccount added.");
					}else {
						appFrame.getTextArea().setText("Name: " + findPerson.getName() + "\nSocial security: " + findPerson.getPNbr() + "\nAccounts: " + findPerson.getAccounts() + "\nAccount already exists.");
					}
				}
			}
		});
		
		appFrame.getBtnFindAccount().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				String accountNumber = appFrame.getTextFieldAddAccount().getText();
				Person findPerson = register.findPerson(socialSecurity);
				Account findAccount = findPerson.findAccount(accountNumber);
				
				if (findPerson != null) {
					if (findAccount != null) {
						appFrame.getTextArea().setText("Owner: " + findPerson.getName() + "\nAccount name: " + findAccount.getNbr() + "\nBalance: " +  findAccount.getBalance());
					}else {
						appFrame.getTextArea().setText("Invalid account name");
					}
				}
			}
		});
		
		appFrame.getBtnWithdraw().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				String accountNumber = appFrame.getTextFieldAddAccount().getText();
				double amount = Integer.parseInt(appFrame.getTextFieldCredits().getText());
				Person findPerson = register.findPerson(socialSecurity);
				Account findAccount = findPerson.findAccount(accountNumber);
				
				if (findPerson != null) {
					if (findAccount != null) {
						findAccount.withdraw(amount);
						appFrame.getTextArea().setText("Owner: " + findPerson.getName() + "\nAccount name: " + findAccount.getNbr() + "\nBalance: " +  findAccount.getBalance());
					}
				}
			}
		});
		appFrame.getBtnAddCredits().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				String accountNumber = appFrame.getTextFieldAddAccount().getText();
				double amount = Integer.parseInt(appFrame.getTextFieldCredits().getText());
				Person findPerson = register.findPerson(socialSecurity);
				Account findAccount = findPerson.findAccount(accountNumber);
				
				if (findPerson != null) {
					if (findAccount != null) {
						findAccount.credit(amount);
						appFrame.getTextArea().setText("Owner: " + findPerson.getName() + "\nAccount name: " + findAccount.getNbr() + "\nBalance: " +  findAccount.getBalance());
						}
					} 
				}
		});
		
		appFrame.getbtnAllAccAndCred().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String socialSecurity = appFrame.getTextFieldSocSecurity().getText();
				Person person = register.findPerson(socialSecurity);
				appFrame.getTextArea().setText("");
				
				if (person != null) {
					for(Account account : person.getAccounts()) {
						appFrame.getTextArea().append("Account: " + account.getNbr() + "\nCredits:" + account.getBalance() + "\n" + "\n");
						
					}
				}else {
					appFrame.getTextArea().setText("Person not found.");
				}
			}
		});

	}
}