package protection;
public abstract class Shield implements Equipment{
    protected int durability;

    protected Shield() {
        // this.durability = durability;
        this.durability = durability();
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public int durability() {
        return 0;
    }

    // public boolean notBroken() {
    //     return durability > 0;
    // }

    // public void reduceDurability(int damage) {
    //     durability -= damage;
    //     if (durability < 0) {
    //         durability = 0;
    //     }
    // }

    @Override
    public String toString() {
        return "Shield { " + "durability = " + durability + "}";
    }
}