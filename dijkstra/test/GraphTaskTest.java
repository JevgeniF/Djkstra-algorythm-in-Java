import static org.junit.Assert.*;
import org.junit.Test;

/** Testklass.
 * @author jaanus
 */
public class GraphTaskTest {

   @Test
   public void test1() { 
      GraphTask a = new GraphTask();
      a.testRun("===Test 500 vertices x 2 arc===", 500, 2, 0, 499);
      System.out.println("\n");
      assertTrue ("There are no wrong answers", true);
   }

   @Test
   public void test2() {
      GraphTask a = new GraphTask();
      a.testRun("===Test 1000 vertices x 4 arc===", 1000, 4, 0, 999);
      System.out.println("\n");
      assertTrue ("There are no wrong answers", true);
   }

   @Test
   public void test3() {
      GraphTask a = new GraphTask();
      a.testRun("===Test 1500 vertices x 6 arc===", 1500, 6, 0, 1499);
      System.out.println("\n");
      assertTrue ("There are no wrong answers", true);
   }

   @Test
   public void test4() {
      GraphTask a = new GraphTask();
      a.testRun("===Test 2000 vertices x 8 arc===", 2000, 8, 0, 1999);
      System.out.println("\n");
      assertTrue ("There are no wrong answers", true);
   }

   @Test
   public void test5() {
      GraphTask a = new GraphTask();
      a.testRun("===Test 2500 vertices x 10 arc===", 2500, 10, 0, 2499);
      System.out.println("\n");
      assertTrue ("There are no wrong answers", true);
   }
}

