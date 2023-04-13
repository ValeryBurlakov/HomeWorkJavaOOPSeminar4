package battle;
import warriors.Warrior;
import warriors.Archer;
public class Battle {
    private Warrior attacker;
    private Warrior defender;
    // private Warrior[] team1;
    // private Warrior[] team2;
    
    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    // public Battle(Team<Archer> archers, Team<Archer> archersTwo) {
    //     this.team1 = team1;
    //     this.team2 = team2;
    // }
    
    
    public Warrior run() {
        int durabilityEquipmentDefender = defender.getDurability();
        int durabilityEquipmentattacker = attacker.getDurability();
        
        while (true) {
            int defenderReduce = 0;
            int attackerReduce = 0;

            // ATTACKKER attack
            int attackAttacker = attacker.harm();
            attackerReduce += attackAttacker;

            if (defender instanceof Archer && attacker instanceof Archer) {
                if (defender.getDistance() <= attacker.getDistance()) {
                    defender.reduceHp(attackAttacker);
                    System.out.println(attacker.getName() + " атаковал " + defender.getName() + " с расстояния " + attacker.getDistance() + " метров!");
                } else {
                    System.out.println(attacker.getName()  + " не может атаковать " + defender.getName() + " на расстояние " + attacker.getDistance() + " метров!, противник дальше");
                }
            } else {
                if (defender.hasEquipment() != null) {
                    if (durabilityEquipmentDefender > 0) {
                        durabilityEquipmentDefender -= attackerReduce;
                        System.out.printf(defender.getName() + " - shield not BROKEN. ");
                    } else {
                        durabilityEquipmentDefender = 0;
                        System.out.printf(defender.getName() + " = has NO equipment.");
                        defender.reduceHp(attackAttacker);
                    }
                }
            } 
            
            System.out.printf("\nWarrior %s: give harm %d Warrior %s: HP = %d, DURABILITY = %d ", attacker.getName(), attackAttacker, defender.getName(), defender.getHp(), durabilityEquipmentattacker);
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", defender.getName(), attacker);
                return attacker;
            }
            
            // DEFENDER attack
            int attackDef = defender.harm();
            defenderReduce += attackDef;

            if (attacker instanceof Archer && defender instanceof Archer) {
                if (attacker.getDistance() <= defender.getDistance()) {
                    attacker.reduceHp(attackDef);
                    System.out.println(defender.getName() + " атаковал " + attacker.getName() + " с расстояния " + defender.getDistance() + " метров!");
                } else {
                    System.out.println(defender.getName()  + " не может атаковать " + attacker.getName() + " на расстояние " + defender.getDistance() + " метров!, противник дальше");
                }
            } else {
                if (attacker.hasEquipment() != null) {
                    if (durabilityEquipmentattacker > 0) {
                        durabilityEquipmentattacker -= defenderReduce;
    
                        System.out.printf(attacker.getName() + " - shield not BROKEN. ");
                    } else {
                        durabilityEquipmentattacker = 0;
                        System.out.printf(attacker.getName() + " = has NO equipment.");
                        attacker.reduceHp(attackDef);
                    }
                }
    }
            System.out.printf("\nWarrior %s: return harm %d Warrior %s: HP = %d, DURABILITY = %d ", defender.getName(), attackDef, attacker.getName(), attacker.getHp(), durabilityEquipmentDefender);
            if (!attacker.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", attacker.getName(), defender.getName());
                return defender;
            }
        }
    }
    
}
