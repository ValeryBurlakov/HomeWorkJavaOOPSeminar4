import warriors.Warrior;
import protection.Shield;

public class Battle {
    private Warrior attacker;
    private Warrior defender;
    
    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        int prochnostDef = defender.getDurability();
        while (true) {
            int defenderReduce = 0;
            int attackerReduce = 0;
            
            int attack = attacker.harm();
            attackerReduce += attack;


            if (defender.hasEquipment() != 0) {
                prochnostDef -= attackerReduce;
                if (prochnostDef > 0) {
                    System.out.printf("- shield no BROKEN " + prochnostDef);
                } else {
                    System.out.printf(" has NO equipment");
                    defender.reduceHp(attack);
                }
            }
            
            

            System.out.printf("Warrior %s give harm %d \n Warrior %s %d HP ", attacker.getName(), attack, defender.getName(), defender.getHp());
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", defender.getName(), attacker);
                return attacker;
            }
            
            attack = defender.harm();
            defenderReduce += attack;
            attacker.reduceHp(attack);
            // attacker.reduceDurability(attack);
            System.out.printf("Warrior %s return harm %d\n Warrior %s %d HP DURABIL-%d", defender.getName(), attack, attacker.getName(), attacker.getHp(), attacker.getDurability());
            if (!attacker.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", attacker.getName(), defender.getName());
                return defender;
            }
        }
    }
}
