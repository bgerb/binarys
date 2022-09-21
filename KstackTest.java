import org.junit.jupiter.api.Test;
import com.google.common.base.Stopwatch;
import java.util.concurrent.TimeUnit;

class KstackTest {
/*
    @Test
    void normalPushAndPop() {
        Kstack myStack = new Kstack(6);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        assertEquals(4, myStack.pop());
        assertEquals(3, myStack.pop());
        assertEquals(2, myStack.pop());
        assertEquals(1, myStack.pop());
    }

    @Test
    void overflowTest () {
        Kstack f = new Kstack(6);
        for(int i=0; i<131072;++i){
            f.push(i);
        }
        assertThrows(RuntimeException.class, () -> {
            f.push(131072);
        });
    }

    @Test
    void underflowTest() {
        Kstack f = new Kstack(6);
        assertThrows(RuntimeException.class, () -> f.pop());
    }

    @Test
    void stressTest() {
        Kstack f = new Kstack(47);
        for (int i=0; i < Math.pow(2, 17); ++i) {
            f.push(i);
        }

        for (int i=(int)Math.pow(2, 17)-1; i>=0; --i) {
            assertEquals(i, f.pop());
        }
    }

    @Test
    void testIndex() {
        Kstack f = new Kstack();
        assertEquals(0, f.getSize());
        for (int i=0; i<20; ++i) {
            f.push(i*2);
        }
        assertEquals(20, f.getSize());
    }

    @Test
    void testSpeed() {
        Stopwatch startTime = new Stopwatch();
        Kstack f100 = new Kstack(1_000_000);
        startTime.start();
        for (int i=0; i<1_000_000; ++i) {
            f100.push(1);
        }
        startTime.stop();
        long elapsedTimeFor100 = startTime.elapsedTime(TimeUnit.MILLISECONDS);

        Stopwatch start2 = new Stopwatch();
        Kstack f100000 = new Kstack(100_000_000);
        start2.start();
        for (int i=0; i<100_000_000; ++i) {
            f100000.push(1);
        }
        start2.stop();
        long elapsedTimeFor100_000 = start2.elapsedTime(TimeUnit.MILLISECONDS);
        System.out.println(elapsedTimeFor100);
        System.out.println(elapsedTimeFor100_000);

        assertEquals(elapsedTimeFor100*100, elapsedTimeFor100_000, 5000);

    }


 */
    @Test
    void speedtest(){
        int pass =0;
        Stopwatch startTime = new Stopwatch();
        int var = 500000;
        int[] toadd = new int[var];
        for(int i = 0; i<var; ++i){
            toadd[i] = (int) Math.random()*30000;
        }

        startTime.start();
        Linked hi = new Linked();
        for(int test : toadd){
            hi.append(test);
        }
      //  for(int i =0; i<var; ++i){
      //      hi.delete(hi.getHead());
      //  }
        startTime.stop();
        long elapsedTimeFor100 = startTime.elapsedTime(TimeUnit.MILLISECONDS);
        System.out.println(elapsedTimeFor100);
        if(hi.getHead() == null) ++pass;


        Stopwatch startbinary = new Stopwatch();
        startbinary.start();
        binary hii = new binary();
        for(int test : toadd){
            hii.insert(new node(test));
        }
     //   for(int i =0; i<var; ++i){
     //       hii.delete(hii.getRoot());
    //   }
        startbinary.stop();
        long elsapedbinary = startbinary.elapsedTime(TimeUnit.MILLISECONDS);
        System.out.println(elsapedbinary);

        if(hii.getRoot() == null) ++pass;

        System.out.println(pass);





    }
}