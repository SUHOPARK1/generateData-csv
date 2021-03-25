package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DummyProvider {
    public static String provider() {
        List<String> provider = new ArrayList<>();
        provider.add("naver");
        provider.add("kakao");
        provider.add("google");
        Collections.shuffle(provider);
        return provider.get(0);
    }
    public static void main(String[] args) {
        DummyProvider dummyProvider = new DummyProvider();
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(DummyProvider.provider() + " ");
        }
    }
}
