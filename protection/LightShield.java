package protection;

public class LightShield extends Shield{
    private String name;

    public LightShield() {
        // super(durability);
        this.name = "Light Shield";
        this.durability = durability();
    }
    @Override
    public int durability() {
        return 15;
    }

    @Override
    public String toString() {
        return "Shield {" + " name = " + name + super.toString() + " }";
    }
}
