import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCubeSumsTestSuite {

    @Test
    public void test1(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(1));
    }

    @Test
    public void test2(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(1729));
    }

    @Test
    public void test3(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(42));
    }

    @Test
    public void test4(){
        assertEquals(true, TwoCubeSums.hasTwoCubeSums(4104));
    }

    @Test
    public void test5(){
        assertEquals(false, TwoCubeSums.hasTwoCubeSums(4105));
    }

}