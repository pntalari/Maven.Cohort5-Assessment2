package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    Long pId;
    String pName;
    Address pAddress;
    public Person(Long id, String name, Address address) {
        this.pId = id;
        this.pName = name;
        this.pAddress = address;
    }

    public Person() {
        this.pId = 0L;
        this.pName = "";
        this.pAddress = null;
    }

    public Long getId() {

        return this.pId;
    }

    public void setId(Long id) {
        this.pId = id;
    }

    public String getName() {

        return this.pName;
    }

    public void setName(String name) {
        this.pName = name;
    }

    public Address getAddress() {

        return this.pAddress;
    }

    public void setAddress(Address address) {
        this.pAddress = address;
    }

    @Override
    public boolean equals(Object o) {

        return (Boolean)null;
    }
}