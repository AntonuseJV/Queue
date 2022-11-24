import java.util.*;

public class Main {

    public static void main(String[] args) {

        Deque<Person> persons = new ArrayDeque<>(generateClients());

        while (!persons.isEmpty()) {

            Person c = persons.poll();
            c.ticket--;
            System.out.println(c + " прокатился на аттракционе ");
            if (c.ticket != 0) {
                persons.addLast(c);
            }

        }

    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Wendy", "Christensen", 5));
        list.add(new Person("Kevin", "Fischer", 2));
        list.add(new Person("Frankie", "Cheeks", 1));
        list.add(new Person("Jason", "Wise", 3));
        list.add(new Person("James", "Wong", 4));

        return list;
    }

}
