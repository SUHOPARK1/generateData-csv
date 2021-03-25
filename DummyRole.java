package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class DummyRole {
        public static String role() {
            List<String> role = new ArrayList<>();
            role.add("user");
            return role.get(0);
        }
        public static void main(String[] args) {
            DummyRole dummyRole = new DummyRole();
            for (int i = 0; i < 1000; i++) {
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(DummyRole.role() + " ");
            }
        }
    }
