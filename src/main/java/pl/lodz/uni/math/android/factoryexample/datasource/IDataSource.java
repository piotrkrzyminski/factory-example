package pl.lodz.uni.math.android.factoryexample.datasource;

import pl.lodz.uni.math.android.factoryexample.model.Person;

import java.util.List;

/**
 * Example interface for factory example.
 *
 * @author Piotr Krzyminski
 */
public interface IDataSource {

    /**
     * Gets persons list from data source with the selected name.
     *
     * @param name name of users to find.
     * @return list of persons with the specific name.
     */
    List<Person> getPersonsByName(final String name);
}
