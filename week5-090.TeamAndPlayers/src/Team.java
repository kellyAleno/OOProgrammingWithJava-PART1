
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
public class Team {
    private String name;
    private ArrayList<Player> members; 
    private int maxSize; 
            
    public Team(String name) { 
        this.name = name; 
        this.maxSize = 16; 
        this.members = new ArrayList<Player>(); 
    }
    
    public String getName(){ 
        return this.name; 
    }
    
    public void addPlayer(Player name) { 
        if (!(this.members.size() >= maxSize)) { 
            this.members.add(name);
        }
    }
    
    public int goals(){
        int total = 0; 
        for(Player players : this.members) { 
            total += players.goals();
        }
        return total; 
    }
    
    public void setMaxSize(int maxSize) { 
        this.maxSize = maxSize; 
    }
    
    public int size(){ 
        return this.members.size(); 
    }
    
    public void printPlayers(){
        for (Player players : this.members) { 
            System.out.println(players); 
        }
    }
    
}
