package uppgift_6;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
Person kalle = new Person();
		
		kalle.setName("Kalle");
		kalle.setPNbr("123");
		
		ArrayList<Account> kalleAccounts = new ArrayList<Account>();
		
		Account one = new Account();
		one.setNbr("1");
		
		Account two = new Account();
		two.setNbr("2");
		
		kalleAccounts.add(one);
		kalleAccounts.add(two);
		
		kalle.setAccounts(kalleAccounts);
		
		Person christer = new Person();
		
		christer.setName("Christer");
		christer.setPNbr("321");
		
		ArrayList<Account> christerAccounts = new ArrayList<Account>();
		
		Account three = new Account();
		three.setNbr("3");
		
		Account four = new Account();
		four.setNbr("4");
		
		christerAccounts.add(three);
		christerAccounts.add(four);
		
		christer.setAccounts(christerAccounts);
		
		PersonRegister personRegister = new PersonRegister();
		ArrayList<Person> persons = new ArrayList<Person>();
		
		personRegister.setPersons(persons);
		
		persons.add(kalle);
		persons.add(christer);
		
		//Vi börjar med att testa Person metoderna som vi ej testat redan
		
		System.out.println(kalle.getName());
		System.out.println(kalle.getPNbr());
		
		kalle.addAccount(three);
		System.out.println(kalle.getAccounts());
		
		System.out.println(kalle.findAccount("1"));
		System.out.println(kalle.findAccount("4")); //om den ej finns med i arraylisten
		
		System.out.println(kalle.totBalance()); //ska vara 0.0 då inget lagts in på kontona
		
		//Vi testar Account metoderna vi ej testat redan
	
		one.setOwner(kalle);
		one.setBalance(100);
		
		System.out.println(one.getNbr());
		System.out.println(one.getOwner());
		System.out.println(one.getBalance());
		
		one.credit(50);
		System.out.println(one.getBalance()); //ska visa 150
		
		one.withdraw(50);
		System.out.println(one.getBalance()); //ska visa 100
		
		//Till sist testar vi PersonRegister metoderna vi ej testat redan
		
		System.out.println(personRegister.getPersons());
		
		System.out.println(personRegister.findPerson("123"));
		
		personRegister.removePerson("123");
		System.out.println(personRegister.getPersons());
		
		System.out.println(personRegister.findAccount("321", "4"));
		
		System.out.println(personRegister.totBalancePerson("321")); //ska stå 0.0 då inget lagts in på christers konton
		
		three.setBalance(100);
		
		four.setBalance(10);
		
		System.out.println(personRegister.totBalancePerson("321")); //här ska det stå 110 då vi satt in 100 på ett av christers konton och 10 på det andra
	}

}
