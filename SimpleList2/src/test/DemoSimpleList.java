package test;
import java.util.List;
import java.util.Random;

import co.edu.uptc.models.aplications.Calculator;
import co.edu.uptc.utils.dynamic.SimpleListV2;

public class DemoSimpleList {

  private List<Integer> list;

   public void testArrayList(Random random) {
       loadDataArrayList(random);
   }

   private void loadDataArrayList(Random random) {
       list = new SimpleListV2<>();
       for (int i = 0; i < 300000; i++) {
           list.add(random.nextInt(10000) + 1);
       }
   }

   public List<Integer> getList() {
       return list;
   }
}
