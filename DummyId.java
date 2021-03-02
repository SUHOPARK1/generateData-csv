package dummy;

public class DummyId {
    public static String nId() {
        String text = "";
        String ran = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 6; i++) {
            text += ran.charAt((int) (Math.random() * ran.length()));
        }
        return text;
    }

    public static String nNo2() {
        return (int) (Math.random() * 500) + 1 + "";
    }

    public static void main(String[] args) { // 아이디
        for (int i = 0; i < 1000; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(nId() + nNo2() + " ");
        }
    }

}