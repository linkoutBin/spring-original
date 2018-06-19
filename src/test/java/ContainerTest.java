import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class ContainerTest {
    public static void main(String[] args) {
        //hashtableTest();
        HashMap<String,String> map = new HashMap<>();
        map.put("key","value");
        System.out.println("key".hashCode());
        System.out.println("key".hashCode() ^ ("key".hashCode() >>> 16));//1

    }

    private static void hashtableTest() {
        Hashtable<String, String> table = new Hashtable<>();
        String[] arrays = new String[2];
        arrays[0] = "aaaaa";
        arrays[1] = "vvv";
        long num = 0XBF;
        long nu = 0X38;
        System.out.println(num ^ nu);
        table.put("key", "value");
        Enumeration<String> encum = table.keys();
        while (encum.hasMoreElements()) {
            System.out.println(encum.nextElement());
        }
    }
}