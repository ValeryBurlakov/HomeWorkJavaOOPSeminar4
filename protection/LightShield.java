package protection;
public class LightShield extends Shield{
    private String name;
    public LightShield(int durability) {
        super(durability);
        this.name = "Light Shield";
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
