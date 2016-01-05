
public class Animal {

    private int currentLocation;

    public Animal(int currentLocation) {

        if (currentLocation > 0) {
            if (currentLocation <= 70) {
                this.currentLocation = currentLocation;
            } else {
                this.currentLocation = 70;
            }
        } else {
            this.currentLocation = 1;
        }

    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int currentLocation) {

        if (currentLocation > 0) {
            if (currentLocation <= 70) {
                this.currentLocation = currentLocation;
            } else {
                this.currentLocation = 70;
            }
        } else {
            this.currentLocation = 1;
        }

    }

}
