package pl.lodz.uni.math.android.factoryexample;

import pl.lodz.uni.math.android.factoryexample.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to create and store example data for factory example purpose.
 *
 * @author Piotr Krzyminski
 */
public class ExampleDataSource {

    /**
     * Creates list with example persons.
     *
     * @return list of example persons.
     */
    public static List<Person> createSamplePersons() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Ala"));
        persons.add(new Person("Janusz"));

        return persons;
    }
}
