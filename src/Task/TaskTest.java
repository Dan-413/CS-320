package Task;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskTest {

  @Test public void createValidTaskData() {
      Task task = new Task("0000000001", "Reading", "Read Novel Book");
      System.out.println(task);
   }
   
}