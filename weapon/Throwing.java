package weapon;
public abstract class Throwing implements Weapon{
    private int distance;

    public Throwing(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    // @Override
    // public int damage() {
    //     return 0; 
    // }
    
    @Override
    public String toString() {
        return "Throwing { " + "distance = " + distance + ", damage = " + damage() + "}";
    }
}
