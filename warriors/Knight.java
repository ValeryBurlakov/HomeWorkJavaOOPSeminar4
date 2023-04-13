package warriors;
import protection.Shield;
import weapon.Knife;

public class Knight extends Warrior<Knife, Shield>{

    public Knight(String name, int healthpoint, Knife weapon, Shield shield) {
        super(name, healthpoint, weapon, shield);
    }

    public Knight(String name, int healthpoint, Knife weapon) { // без щита
        super(name, healthpoint, weapon);
    }
    
    @Override
    public String toString() {
        return "Knight: " + super.toString() + "}";
    }
}
