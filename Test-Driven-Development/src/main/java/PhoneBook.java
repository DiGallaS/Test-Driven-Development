import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhoneBook {
    List<People> phonebook = new ArrayList<>();
    public int add(String name, String number) {
        phonebook.add(new People(name, number));
        phonebook.sort(Comparator.comparing(People::getName));
        return phonebook.size();
    }

    public String findByNumber(String number){
        return null;
    }
}
