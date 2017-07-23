
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
public class Library {
    private ArrayList<Book> books;
    
    public Library (){ 
        this.books = new ArrayList<Book>(); 
    }
    
    public void addBook(Book newBook) { 
        this.books.add(newBook); 
    }
    
    public void printBooks() { 
        for(Book single : this.books) { 
            System.out.println(single);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) { 
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book single :this.books) { 
            if (StringUtils.included(single.title(), title)) { 
                found.add(single); 
            }
        }
        return found; 
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) { 
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book single :this.books) { 
            if (StringUtils.included(single.publisher(), publisher)) { 
                found.add(single); 
            }
        }
        return found; 
    }
    
    public ArrayList<Book> searchByYear(int year) { 
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book single :this.books) { 
            if (single.year() == year) { 
                found.add(single); 
            }
        }
        return found; 
    }
    
}
