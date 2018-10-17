package pl.lodz.uni.math.android.factoryexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.lodz.uni.math.android.factoryexample.datasource.IDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.impl.DBDataSource;
import pl.lodz.uni.math.android.factoryexample.model.Person;

import java.util.List;

/**
 * Example factory application.
 *
 * @author Piotr Krzyminski
 */
public class FactoryApplication  {

    private static final Logger LOG = LoggerFactory.getLogger(FactoryApplication.class);
    private static DataSourceEnum sourceEnum = DataSourceEnum.XML_SOURCE;
    private static IDataSource source;

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        // XML source
        source = sourceEnum.getSource(DataSourceEnum.XML_SOURCE);

        List<Person> xmlResult = source.getPersonsByName("Janusz");
        LOG.info(xmlResult.get(0).getName());
        //DB source
        source = sourceEnum.getSource(DataSourceEnum.DB_SOURCE);

        List<Person> dbResult = source.getPersonsByName("Ala");
        LOG.info(dbResult.get(0).getName());
    }
}
