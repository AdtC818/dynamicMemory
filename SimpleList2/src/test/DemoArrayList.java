package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DemoArrayList {
  private List<Integer> list;

   public void testArrayList(Random random) {
       loadDataArrayList(random);
   }

   private void loadDataArrayList(Random random) {
       list = new ArrayList<>();
       for (int i = 0; i < 300000; i++) {
           list.add(random.nextInt(10000) + 1);
       }
   }

   public List<Integer> getList() {
       return list;
   }
}