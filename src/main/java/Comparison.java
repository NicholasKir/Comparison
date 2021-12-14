import org.apache.commons.lang3.time.StopWatch;

import java.util.Date;
import java.util.List;

/**
 * Class with main methods of comparisons.
 */
public class Comparison {
    /**
     * Check of Add-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
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

    /**
     * Check of Get-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
    public long checkGet(List list, int amountOfElements) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < amountOfElements; i++) {
            int x = (int) list.get(i);
        }
        stopWatch.stop();
        return stopWatch.getTime();
    }

    /**
     * Check of Delete-method
     *
     * @param list             ArrayList or LinkedList
     * @param amountOfElements number of iterations for this method
     * @return
     */
    public long checkDelete(List list, int amountOfElements) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = amountOfElements - 1; i >= 0; i--) {
            list.remove(i);
        }
        stopWatch.stop();
        return stopWatch.getTime();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}