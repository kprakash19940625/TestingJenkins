import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.EmptyStackException;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Main.class);
      int total = result.getRunCount();
      int failed = result.getFailureCount();
      int succeeded = total - failed;
      System.out.println("Total Test Cases Runned : "+total);
      System.out.println("Total Test Cases Failed : "+failed);
      System.out.println("Total Test Cases Successful : "+succeeded);
      if (failed>0) {
         System.out.println("Failed Cases : \n\t "+result.getFailures());
      }
      if (failed>=3) {
        throw new EmptyStackException();
      }
   }
}
