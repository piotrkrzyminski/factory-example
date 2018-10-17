package pl.lodz.uni.math.android.factoryexample.datasource.impl;

import pl.lodz.uni.math.android.factoryexample.ExampleDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.IDataSource;
import pl.lodz.uni.math.android.factoryexample.model.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Simple xml data source
 *
 * @author Piotr Krzyminski
 */
public class XmlDataSource implements IDataSource {

    private List<Person> persons;

    public XmlDataSource() {
        persons = ExampleDataSource.createSamplePersons();
    }

    /**
     * Gets persons list from data source with the selected name.
     *
     * @param name name of users to find.
     * @return list of persons with the specific name.
     */
    @Override
    public List<Person> getPersonsByName(String name) {
        return persons.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
    }
}
