package uk.co.codera.java.eight.kata;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.time.StopWatch;

//Speed test between stream and loop
//Conclusion - loops are faster
public class Java8SpeedTest {
    public static void main(String... args) {
        Java8SpeedTest.loopVsStreamTimeTest();
    }

    public static void loopVsStreamTimeTest() {
        int numberToFind = 99456;
        List<Integer> numberArray = new ArrayList<>();

        for (int i = 0; i <= 100000; i++) {
            numberArray.add(i);
        }

        StopWatch timer = new StopWatch();
        timer.start();

        for (Integer number : numberArray) {
            if (number.intValue() == numberToFind) {
                break;
            }
        }

        timer.stop();
        System.out.println("Loop Time:" + timer.getTime() + "ms");

        timer.reset();
        timer.start();

        numberArray.stream().filter(it -> it.intValue() == numberToFind).findFirst();

        timer.stop();
        System.out.println("Stream Time:" + timer.getTime() + "ms");
    }
}
