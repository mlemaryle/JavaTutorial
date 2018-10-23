import java.util.ArrayList;
import java.util.List;

public class Looping {

    public List<Integer> filterForValuesUnder10(List<Integer> fullList) {
        List<Integer> filteredList = new ArrayList<>();

        for (Integer number : fullList) { //[2,3,11,12,22]
            if (number < 10) {
                filteredList.add(number);
            }
        }
        return filteredList;
    }
}
