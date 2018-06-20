import com.bin.spring.design.singleton.enumeration.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.SINGLETON;
            }).start();
        }
    }
}
