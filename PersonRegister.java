package uppgift_6;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonRegister {

private ArrayList<Person> persons = new ArrayList<Person>();

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public Person findPerson(String pNbr) {
		for (Person person : persons) {
			if (person.getPNbr().equals(pNbr)) {
				return person;
			}
		}
		return null;
	}
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public Person removePerson(String pNbr) {
		for (Person person : persons) {
			if (person.getPNbr().equals(pNbr)) {
				persons.remove(person);
				return person;
			}
		}
		return null;
	}	
	
	
	public Account findAccount(String pNbr, String accountNbr) {
		for(Person person : persons) {
			if(person.getPNbr().equals(pNbr)) {
				return person.findAccount(accountNbr);
			}
		}
		return null;
	}
	
	public double totBalancePerson(String pNbr) {
		for (Person person : persons) {
			if (person.getPNbr().equals(pNbr)) {
				return person.totBalance();
			}
		}
		return 0;
	}

}
