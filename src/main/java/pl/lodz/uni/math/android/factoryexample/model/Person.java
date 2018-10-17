package pl.lodz.uni.math.android.factoryexample.model;

/**
 * Simple person model.
 *
 * @author Piotr Krzyminski
 */
public class Person {

    private String name;

    public Person() { }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
