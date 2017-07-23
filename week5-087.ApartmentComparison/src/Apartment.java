
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) { 
        if (this.squareMeters < otherApartment.squareMeters) { 
            return false; 
        } else { 
            return true; 
        }
    }
    
    public int priceDifference(Apartment otherApartment) { 
        int a1 = this.pricePerSquareMeter * this.squareMeters; 
        int a2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters; 
        int difference = a1-a2;
        
        if (difference < 0) { 
            difference *= -1; 
        }
        
        return difference; 
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) { 
        int a1 = this.pricePerSquareMeter * this.squareMeters; 
        int a2 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters; 
        if (a1 > a2) { 
            return true; 
        } else { 
            return false; 
        }
    }
}
