package warriors;
public abstract class Person {
    private String name;
    // protected Weapon weapon;
    private int healthpoint;
    
        public Person(String name, int healthpoint) {
            this.name = name;
            // this.weapon = weapon;
            this.healthpoint = healthpoint;
        }
        public String getName() {
            return name;
        }
        public int getHp() {
            return healthpoint;
        }

        public int setHP() {
            return healthpoint;
        }

        public boolean isAlive() {
            return healthpoint > 0;
        }
    
        public void reduceHp(int damage) {
            healthpoint -= damage;
            if (healthpoint < 0) {
                healthpoint = 0;
            }
        }
}
