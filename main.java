public class main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();

        archers.addPersons(new Archer("Tom", 100, new Bow(20))).
        addPersons(new Archer("Tim", 100, new Bow(15)));

        knights.addPersons(new Knight("Bom", 150, new Knife())).
        addPersons(new Knight("Bim", 150, new Knife()));

        Archer archer1 = new Archer("Tom", 100, new Bow(20));
        Archer archer2 = new Archer("Tim", 100, new Bow(15));

        Battle fight = new Battle(archer1, archer2);

        fight.run();
        // класс щита,
    }
}
