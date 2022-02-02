package properties;

import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {
    @Test
    void someTest(){
        String value = System.getProperty("value");
        System.out.println(value);
        //null
    }

    @Test
    void someTest1(){
        String value = System.getProperty("value", "default_value");
        System.out.println(value);
        //default_value
    }
    @Test
    void someTest2(){
        System.setProperty("value", "another_value");
        String value = System.getProperty("value", "another_value");
        System.out.println(value);
        //another_value
    }
    @Test
    void someTest3(){
        String value = System.getProperty("browser", "chrome");
        System.out.println(value);
    }
    @Test
    void someTest4(){
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");
        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
        //gradle clean properties_tests -Dbrowser=opera -Dversion=93
    }
}
