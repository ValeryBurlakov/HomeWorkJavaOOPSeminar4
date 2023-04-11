import protection.HeavyShield;
import protection.LightShield;
import protection.MiddleShield;
import protection.Shield;
import warriors.Archer;
import warriors.Knight;
import warriors.Team;
import weapon.Bow;
import weapon.Knife;

public class program {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();

        archers.addPersons(new Archer("Tom", 100, new Bow(20), new Shield(50) {
            
        })).
        addPersons(new Archer("Tim", 100, new Bow(15), null));

        knights.addPersons(new Knight("Bom", 150, new Knife(), null)).
        addPersons(new Knight("Bim", 150, new Knife(), null));

        Archer archer1 = new Archer("Tom", 100, new Bow(20), new LightShield(20));
        Archer archer2 = new Archer("Tim", 100, new Bow(15), new HeavyShield(15));

        Battle fight = new Battle(archer1, archer2);

        fight.run();
        // класс щита,
    }
}
// На основе работы на уроке.
// Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
// Добавить метод определения минимального щита члена команды в команде.
// * Продумать, как можно сделать воина без щита.
