package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DummyGender {
    public static String gender() {
        List<String> gender = new ArrayList<>();
        gender.add("M");
        gender.add("F");
        Collections.shuffle(gender);
        return gender.get(0);
    }
    public static void main(String[] args) {
        DummyGender dummyGender = new DummyGender();
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(DummyGender.gender() + " ");
        }
    }
}
