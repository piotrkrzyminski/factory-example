package pl.lodz.uni.math.android.factoryexample;

import pl.lodz.uni.math.android.factoryexample.datasource.IDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.impl.DBDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.impl.ExternalDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.impl.TextDataSource;
import pl.lodz.uni.math.android.factoryexample.datasource.impl.XmlDataSource;

/**
 * Enum containing available data sources.
 *
 * @author Piotr Krzyminski
 */
public enum DataSourceEnum {

    DB_SOURCE(DBDataSource.class),
    TXT_SOURCE(TextDataSource.class),
    XML_SOURCE(XmlDataSource.class),
    EXTERNAL_SOURCE(ExternalDataSource.class);

    private Class<? extends IDataSource> source;

    DataSourceEnum(Class<? extends IDataSource> source) {
        this.source = source;
    }

    public IDataSource getSource() throws IllegalAccessException, InstantiationException {
        return this.source.newInstance();
    }

    public IDataSource getSource(DataSourceEnum source) throws IllegalAccessException, InstantiationException {
        return this.source.newInstance();
    }
}
