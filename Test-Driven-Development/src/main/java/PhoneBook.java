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
        List<People> sortNumber = new ArrayList<>();
        sortNumber.addAll(phonebook);
        sortNumber.sort(Comparator.comparing(People::getNumber));

        int first = 0;
        int last = sortNumber.size()-1;

        while (first <= last ){
            int medium = (first + last) / 2;
            String mediumNumber = sortNumber.get(medium).getNumber();
            if (mediumNumber.compareTo(number) == 0){
                return sortNumber.get(medium).getName();
            }else if (mediumNumber.compareTo(number) < 0){
                first = medium + 1;
            }else if (mediumNumber.compareTo(number) > 0){
                last = medium - 1;
            }
        }
        return null;
    }

    public String findByName(String name){
        return null;
    }
}
