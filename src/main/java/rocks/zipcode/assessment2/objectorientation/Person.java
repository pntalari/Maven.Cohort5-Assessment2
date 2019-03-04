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
        this.pId = Long.MIN_VALUE;
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
    public String toString() {
        String str = "";
        if(pAddress!=null) {
            str = String.format("Person{id=" + pId + "," +
                    " name=" + "'" + pName + "'" + ","
                    + " address=" + getAddress().toString() + "}");
        }
        return str;
    }

    @Override
    public boolean equals(Object o) {
        Person per = (Person) o;
        Boolean ret = false;
        if(o == null){
            ret = false;
        }
        else if((this.pName==per.getName()) && (this.pAddress== per.getAddress())
            && this.pId==per.getId()){
            ret = true;
        }
        else{
            ret = false;
        }
        return ret;
    }

}