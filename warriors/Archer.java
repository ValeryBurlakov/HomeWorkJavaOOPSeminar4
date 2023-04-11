package warriors;
// import protection.Equipment;
import protection.Shield;
import weapon.Throwing;

public class Archer extends Warrior<Throwing, Shield> {
    // лучник с щитом
    public Archer(String name, int healthpoint, Throwing weapon, Shield shield) {
        super(name, healthpoint, weapon, shield);
    }

    // // лучник без щита
    // public Archer(String name, int healthpoint, Throwing weapon) {
    //     super(name, healthpoint, weapon);
    // }

    public int getRange() {
        return rand.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer { " + super.toString() + "}";
    }
        // private int distance;
    
        // public Archer(String name, Weapon weapon, int healthpoint, int distance) {
        //     super(name, weapon, healthpoint);
        //     this.distance = distance;
        // }
    
        // public void attack(Warrior enemy) {
        //     if (enemy instanceof Archer) {
        //         Archer other = (Archer) enemy;
        //         if (this.distance >= other.distance) {
        //             enemy.takeDamage(weapon.damage());
        //             System.out.println(name + " атаковал " + enemy.name + " на расстоянии " + distance + " метров!");
        //         } else {
        //             System.out.println(name + " не может атаковать " + enemy.name + " на расстоянии " + other.distance + " метров!");
        //         }
        //     } else {
        //         enemy.takeDamage(weapon.damage());
        //         System.out.println(name + " атаковал " + enemy.name + " на расстоянии " + distance + " метров!");
        //     }
        // }
    }