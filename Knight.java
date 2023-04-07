public class Knight extends Warrior<Knife>{

    public Knight(String name, int healthpoint, Knife weapon) {
        super(name, healthpoint, weapon);
    }
    
    @Override
    public String toString() {
        return "Knight" + super.toString() + "}";
    }
}
