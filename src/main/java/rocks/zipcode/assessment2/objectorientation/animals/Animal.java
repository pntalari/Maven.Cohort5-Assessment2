package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {

    Long aId;
    Person aPerson = new Person();

    public Animal() {
    }


    /**
     * @param id    - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.aId = id;
        this.aPerson = owner;
    }

    public Long getId() {

        return this.aId;
    }

    public void setId(Long id) {
        this.aId = id;
    }

    public Person getOwner() {

        return this.aPerson;
    }

    public void setOwner(Person owner) {
        this.aPerson = owner;
    }

    public Address getAddress() {
        return aPerson.getAddress();
    }

    @Override
    public boolean equals(Object o) {
        Animal ani = (Animal) o;
        Boolean ret = false;

        if (o == null) {
            ret = false;
        } else if (this.aPerson.equals(((Animal) o).getOwner())) {

        } else {
            ret = false;
        }

        return ret;

    }
}

