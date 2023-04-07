public class Bow extends Throwing {
    private String name;

    public Bow(int distance) {
        super(distance);
        this.name = "BOW";
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public String toString() {
        return "Bow {" + " name = " + name + super.toString() + " }";
    }
}
    

