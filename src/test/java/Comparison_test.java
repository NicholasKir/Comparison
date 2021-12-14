import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class ComparisonTest {

    @Test
    void AddTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        assertEquals(new Comparison().checkAdd(arrayList, 10000),1);
    }

    @Test
    void GetTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<20000;i++) {
            arrayList.add(i);
        }
        assertEquals(new Comparison().checkGet(arrayList, 20000),2);
    }

    @Test
    void DeleteTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<20000;i++) {
            arrayList.add(i);
        }
        assertEquals(new Comparison().checkDelete(arrayList, 20000),1);
    }
}