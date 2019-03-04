package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T> implements Iterable<T> {

    private T obj;

    ArrayList<Object> list = new ArrayList<>();

    public Shelter(T... type) {
        obj = null;
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return list.size();
    }

    public void add(Object object) {
        list.add(object);
    }

    public Boolean contains(Object object) {

        return list.contains(object);
    }

    public void remove(Object object) {
        list.remove(object);
    }

    public Object get(Integer index) {

      return list.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        Integer ret = 0;
        for(int i =0;i<list.size();i++){
            if(list.get(i).equals(ageable)){
                ret = i;
                break;
            }
        }
        
        return ret;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}