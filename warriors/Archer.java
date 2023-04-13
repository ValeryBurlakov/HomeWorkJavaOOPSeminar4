package warriors;
import protection.Shield;
import weapon.Throwing;

public class Archer extends Warrior<Throwing, Shield> {
    // лучник с щитом
    public Archer(String name, int healthpoint, Throwing weapon, Shield shield) {
        super(name, healthpoint, weapon, shield);
    }

    // лучник без щита
    public Archer(String name, int healthpoint, Throwing weapon) {
        super(name, healthpoint, weapon);
    }

    public int getRange() {
        return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer: " + super.toString() + ".";
    }
    }