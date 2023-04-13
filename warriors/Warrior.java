package warriors;
import java.util.Random;

import weapon.Throwing;
import weapon.Weapon;
import protection.Equipment;

public class Warrior<T extends Weapon, D extends Equipment> extends Person{
    protected T weapon;
    protected D equipment;
    protected static Random rand = new Random();
    
    // воин со щитом
    public Warrior(String name, int healthpoint, T weapon, D equipment) {
        super(name, healthpoint);
        this.weapon = weapon;
        this.equipment = equipment;
    }

    // воин без щита
    public Warrior(String name, int healthpoint, T weapon) {
        super(name, healthpoint);
        this.weapon = weapon;
    }

    public int harm() {
        Boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage() + 1);
        }
        return damage;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public int getDurability() {
        // return equipment.durability();

        if(equipment != null) {
            return equipment.durability();
        } else {
            int equipment = 0;
            return equipment;
        }
    }
    
    public void reduceDurability(int damage) {
        Integer durab = equipment.durability();
        durab -= damage;
        if (durab < 0) {
            durab = 0;
        }
    }

    public boolean shieldNotBroken() {
        return equipment.durability() > 0;
    }

        // метод hasEquipment для проверки наличия equipment 
    public Integer hasEquipment() {
        if(equipment != null) {
            return equipment.durability();
        } else {
            int equipment = 0;
            return equipment;
        }
    }
    
    public int getDistance() {
        return ((Throwing) weapon).getDistance();
    }
    
    @Override
    public String toString() {

        return "name = " + getName() + ", hp = " + getHp() +  ", weapon = " + weapon +  ", equipment = " + equipment  + ".";
    }
}
