package protection;
public abstract class Shield implements Equipment{
    // private int weight;
    private int durability;
    private String shieldType;

    public Shield(int durability) {
        this.durability = durability;
    }
    
    public Shield(String shieldType) {
        this.shieldType = shieldType;
    }

    public int getDurability() {
        return durability;
    }
    // public int getWeight() {
    //     return weight;
    // }

    @Override
    public int durability() {
        return durability;
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