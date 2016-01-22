import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.EmptyStackException;
import java.io.*;

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
      try {
         PrintWriter pw = new PrintWriter("Report.txt");
         pw.println("Total Test Cases Runned : "+total);
         pw.println("Total Test Cases Failed : "+failed);
         pw.println("Total Test Cases Successful : "+succeeded);
         if (failed>0) {
            pw.println("Failed Cases : \n\t "+result.getFailures());
         }
         pw.flush();
        }
      catch (Exception ex) {
         ex.printStackTrace();
      }
      if (failed>0) {
        throw new EmptyStackException();
      }
   }
}
