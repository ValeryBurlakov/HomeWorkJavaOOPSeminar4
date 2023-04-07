import java.io.Console;

public class program {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}


// Определяем интерфейс оружия
// interface Weapon {
//     int damage();
// }

// // Создаем класс Warrior
// abstract class Warrior {
//     protected String name;
//     protected Weapon weapon;
//     protected int healthpoint;

//     public Warrior(String name, Weapon weapon, int healthpoint) {
//         this.name = name;
//         this.weapon = weapon;
//         this.healthpoint = healthpoint;
//     }

//     public abstract void attack(Warrior enemy);

//     public void takeDamage(int damage) {
//         healthpoint -= damage;
//         if (healthpoint <= 0) {
//             System.out.println(name + " убит!");
//         }
//     }
// }

// // Представляем различные типы воинов
// 

// class Swordsman extends Warrior {
//     public Swordsman(String name, Weapon weapon, int healthpoint) {
//         super(name, weapon, healthpoint);
//     }

//     public void attack(Warrior enemy) {
//         enemy.takeDamage(weapon.damage());
//         System.out.println(name + " атаковал " + enemy.name + " мечом!");
//     }
// }

// class Militia extends Warrior {
//     public Militia(String name, Weapon weapon, int healthpoint) {
//         super(name, weapon, healthpoint);
//     }

//     public void attack(Warrior enemy) {
//         enemy.takeDamage(weapon.damage());
//         System.out.println(name + " ударил " + enemy.name + " " + weapon.getClass().getSimpleName().toLowerCase() + "ом!");
//     }
// }

// // Создаем различные виды оружия
// class Sword implements Weapon {
//     private int damage = 10;

//     public int damage() {
//         return damage;
//     }
// }

// class Bow implements Weapon {
//     private int damage = 5;

//     public int damage() {
//         return damage;
//     }
// }

// class Shovel implements Weapon {
//     private int damage = 3;

//     public int damage() {
//         return damage;
//     }
// }

// // Пример использования
// public class Main {
//     public static void main(String[] args) {
//         Weapon sword = new Sword();
//         Weapon bow = new Bow();
//         Weapon shovel = new Shovel();

//         Swordsman knight = new Swordsman("Рыцарь", sword, 100);
//         Archer archer = new Archer("Лучник", bow, 80, 20);
//         Militia peasant = new Militia("Крестьянин", shovel, 50);

//         knight.attack(archer);
//         archer.attack(knight);
//         peasant.attack(archer);
//         peasant.attack(knight);
//     }
// }