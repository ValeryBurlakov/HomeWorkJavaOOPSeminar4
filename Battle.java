public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }

    public Warrior run() {
        while (true) {
            int attack = attacker.harm();
            defender.reduceHp(attack);
            System.out.printf("Warrior %s give harm %d\n Warrior %s %d HP", attacker.getName(), attack, defender.getName(), defender.getHp());
            if (!defender.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", defender.getName(), attacker);
                return attacker;
            }

            attack = defender.harm();
            attacker.reduceHp(attack);
            System.out.printf("Warrior %s return harm %d\n Warrior %s %d HP", defender.getName(), attack, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()) {
                System.out.printf("Warrior %s is dead, %s wins", attacker.getName(), defender.getName());
                return defender;
            }
        }
    }
}
