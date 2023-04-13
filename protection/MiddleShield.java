package protection;

public class MiddleShield extends Shield{
    private String name;

    public MiddleShield() {
        // super(durability);
        this.durability = durability();
        this.name = "Middle Shield";
    }

    @Override
    public int durability() {
        return 25;
    }

    @Override
    public String toString() {
        return "Shield {" + " name = " + name + super.toString() + " }";
    }
}