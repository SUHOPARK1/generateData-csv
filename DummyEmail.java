package dummy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DummyEmail {
    public static String nId() {
        String text = "";
        String ran = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 6; i++) {
            text += ran.charAt((int) (Math.random() * ran.length()));
        }
        return text;
    }

    public static String nNo2() {
        return (int) (Math.random() * 2000) + 1 + "";
    }

    public static String emailAdress() {
        List<String> domain = new ArrayList<>();
        domain.add("@naver.com");
        domain.add("@daum.net");
        domain.add("@google.com");
        Collections.shuffle(domain);
        return domain.get(0);
    }

    public static void main(String[] args) {
        DummyEmail dummyEmail = new DummyEmail();
        List<String> email = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            email.add(dummyEmail.nId() + dummyEmail.nNo2() + dummyEmail.emailAdress());
            System.out.print(email.get(i));

        }
    }

}
