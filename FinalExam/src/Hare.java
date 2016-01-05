
public class Hare extends Animal{

    public Hare(int currentLocation){
        super(currentLocation);
    }

    public void moveSpaces(int randomNumber){
        
        if (randomNumber>=3 & randomNumber<=4)
            setCurrentLocation(getCurrentLocation()+9);
        if (randomNumber==5)
            setCurrentLocation(getCurrentLocation()-12);
        if (randomNumber>=6 & randomNumber<=8)
            setCurrentLocation(getCurrentLocation()+1);
        if (randomNumber>=9 & randomNumber<=10)
            setCurrentLocation(getCurrentLocation()-2);
        
    }
}
