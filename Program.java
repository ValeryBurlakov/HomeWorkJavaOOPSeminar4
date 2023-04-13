import battle.Battle;
import protection.HeavyShield;
import protection.LightShield;
import protection.MiddleShield;
import warriors.Archer;
import warriors.Knight;
import warriors.Team;
import weapon.Bow;
import weapon.Knife;

public class Program {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Archer> archersTwo = new Team<>();
        Team<Knight> knights = new Team<>();

        archersTwo.addPersons(new Archer("Tum", 100, new Bow(20), new LightShield())).
        addPersons(new Archer("Tam", 100, new Bow(18), null));
        archers.addPersons(new Archer("Tom", 100, new Bow(20), new LightShield())).
        addPersons(new Archer("Tim", 100, new Bow(15), new MiddleShield())); 
        knights.addPersons(new Knight("Bom", 150, new Knife(), new MiddleShield())).
        addPersons(new Knight("Bim", 150, new Knife(), new MiddleShield()));

        Knight knight1 = new Knight("Jelly", 100, new Knife(), new HeavyShield()); // с щитом!
        Knight knight2 = new Knight("Donald", 100, new Knife(), new MiddleShield()); // без щита!
        Archer archer1 = new Archer("Tom", 100, new Bow(20)); // без щита!
        Archer archer2 = new Archer("Tim", 100, new Bow(15), new LightShield()); // c щитом!
        

        Battle fight = new Battle(archer1, archer2);
        Battle fight2 = new Battle(archer1, knight1);
        Battle fight3 = new Battle(knight1, knight2);
        // Battle fight4 = new Battle(archers, archersTwo); // not complete

        fight.run();
        System.out.println("\n\nСЛЕДУЮЩИЙ БАТТЛ:\n");
        fight2.run();
        System.out.println("\n\nСЛЕДУЮЩИЙ БАТТЛ:\n");
        fight3.run();

        System.out.println("\n\n minimal durability shield in command= " + archers.minShield());

    }
}
// На основе работы на уроке.
// Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
// Добавить метод определения минимального щита члена команды в команде.
// * Продумать, как можно сделать воина без щита.
