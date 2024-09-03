import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import co.edu.uptc.models.aplications.Calculator;
import test.DemoArrayList;
import test.DemoSimpleList;
import test.RealCal;
  public class App {
    public static void main(String[] args) throws Exception {
  Random random = new Random(); // Generador de números aleatorios compartido
  
          DemoArrayList da = new DemoArrayList();
          da.testArrayList(random);
          RealCal<Integer> ra = new RealCal<>();
          ra.run(da.getList(), "ArrayList");
  
          DemoSimpleList ds = new DemoSimpleList();
          ds.testArrayList(random);
          ra.run(ds.getList(), "SimpleList");
    }
  }
  
