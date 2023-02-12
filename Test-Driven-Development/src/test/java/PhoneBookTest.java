import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    static PhoneBook phoneBook = new PhoneBook();
    @BeforeEach
    public void init() {
        System.out.println("Test started");
    }

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
        phoneBook.add("Anna", "523-23-13");
        phoneBook.add("Tom", "523-23-46");
        phoneBook.add("Den", "523-21-87");
        phoneBook.add("Ben", "523-21-21");
        phoneBook.add("Anet", "523-21-29");
    }

    @AfterEach
    public void finished() {
        System.out.println("Test completed");
    }


    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests completed");
    }

    @Test
    void testAdd() {
        String name = "Stefan";
        String number = "523-23-13";
        int expected = 6;
        assertEquals(expected, phoneBook.add(name, number));
    }
}