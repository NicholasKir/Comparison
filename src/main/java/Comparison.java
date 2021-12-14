import org.apache.commons.lang3.time.StopWatch;

import java.util.Date;
import java.util.List;

public class Comparison {
    public long checkAdd(List list, int amountOfElements) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        //Date start = new Date();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i);
        }
        stopWatch.stop();
        //Date finish = new Date();
        //return (int) (finish.getTime() - start.getTime());
        return stopWatch.getTime();
    }

    public long checkGet(List list, int amountOfElements) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < amountOfElements; i++) {
            int x = (int) list.get(i);
        }
        stopWatch.stop();
        return stopWatch.getTime();
    }

    public long checkDelete(List list, int amountOfElements) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = amountOfElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        stopWatch.stop();
        return stopWatch.getTime();
    }
}