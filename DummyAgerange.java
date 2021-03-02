package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DummyAgerange {
    public static String range() {
        List<String> range = new ArrayList<>();
        range.add("10-20");
        range.add("20-30");
        range.add("30-40");
        range.add("40-50");
        range.add("50-60");
        range.add("60-70");
        Collections.shuffle(range);
        return range.get(0);
    }
    public static void main(String[] args) {
        DummyAgerange dummyAgerange = new DummyAgerange();
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(DummyAgerange.range() + " ");
        }
    }
}
