
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class Phonebook {
    private ArrayList<Person> people; 
    
    public Phonebook () { 
        this.people = new ArrayList<Person>(); 
    }
    
    public void add(String name, String number) { 
        Person newPerson = new Person(name, number); 
        this.people.add(newPerson);
    }
    
    public String searchNumber(String name) { 
        for (Person person : people) { 
            if (person.getName().contains(name)) { 
                return person.getNumber();
            }
        }
        
        return "number not known";
    }
    
    public void printAll() { 
        for(Person people : this.people) { 
            System.out.println(people);
        }
    }
}
