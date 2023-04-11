package warriors;
import java.util.Random;

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

    // // воин без щита
    // public Warrior(String name, int healthpoint, T weapon) {
    //     super(name, healthpoint);
    //     this.weapon = weapon;
    // }

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
        return equipment.durability();
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
            return 0;
        }
    }
    
    // public boolean hasEquipment() {
    //     if(equipment != null) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
    
    @Override
    public String toString() {

        return "Warrior { " + "name= " + getName() + " hp= " + getHp() +  " weapon= " + weapon +  " equipment= " + equipment  + " }";
    }
}
