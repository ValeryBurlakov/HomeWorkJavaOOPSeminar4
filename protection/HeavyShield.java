package protection;

public class HeavyShield extends Shield{
    private String name;

    public HeavyShield(int durability) {
        super(durability);
        this.name = "Heavy Shield";
    }


    @Override
    public int durability() {
        return 50;
    }

    @Override
    public String toString() {
        return "Shield {" + " name = " + name + super.toString() + " }";
    }
}