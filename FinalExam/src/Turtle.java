
public class Turtle extends Animal{
    
    public Turtle(int currentLocation){
        super(currentLocation);
    }

    public void moveSpaces(int randomNumber){
        
        if (randomNumber>=1 & randomNumber<=5)
            setCurrentLocation(getCurrentLocation()+3);
        if (randomNumber>=6 & randomNumber<=7)
            setCurrentLocation(getCurrentLocation()-6);
        if (randomNumber>=8 & randomNumber<=10)
            setCurrentLocation(getCurrentLocation()+1);
        
    }
    
}
