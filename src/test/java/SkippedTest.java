import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SkippedTest {
    @Test @Disabled("not need")
    void  test(){
        Assertions.assertTrue(false);
    }
    @Test @Disabled("not need")
    void  test1(){
        Assertions.assertTrue(false);
    }
    @Test @Disabled("not need")
    void  test2(){
        Assertions.assertTrue(false);
    }
    @Test @Disabled("not need")
    void  test3(){
        Assertions.assertTrue(false);
    }
}
