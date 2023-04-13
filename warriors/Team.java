package warriors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T>{
    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }
    
    public Team<T> addPersons(T person) {
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team { " + "persons= " + persons + "}";
    }

    public int maxRange() {
        int max = 0;
        for (T person : this) { // текущий экземпляр команды
            if (person instanceof Archer) { // проверяем на лучника
                Archer archer = (Archer) person;
                if (archer.getRange() > max) {
                    max = archer.getRange();
                }
            } 
        }
        return max;
    }

    public int minShield() {
        int min = 50;
        for (T person : this) { // текущий экземпляр команды
            if (person instanceof Warrior) { // проверяем на воин ли
                Warrior warrior = (Warrior) person;
                if (warrior.getDurability() < min) {
                    min = warrior.getDurability();
                }
            } 
        }
        return min;
    }
}
