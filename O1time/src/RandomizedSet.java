import java.util.HashSet;
import java.util.Random;

public class RandomizedSet {

    HashSet<Integer> set;
    Random rand;

    public RandomizedSet() {
        set = new HashSet<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int index = rand.nextInt(set.size());

        for(Integer i : set) {
            index--;
            if (index < 0){
                return i;
            }
        }
        return -1;
    }
}
