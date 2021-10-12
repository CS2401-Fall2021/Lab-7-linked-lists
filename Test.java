import java.util.Arrays;
import java.util.Scanner;

// Used for running automatic tests. DO NOT EDIT
public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] inputs=line.split("-");
    int[] array=new int[]{};
    if(inputs.length>1) {
      array= Arrays.stream(inputs[1].split(","))
          .map(String::trim).mapToInt(Integer::parseInt).toArray();
    } else {
      array = new int[]{};
    }
    if(inputs[0].equals("model")){
      House h = Main.modelStreet(array);
      if(h==null){
        System.out.println("model:null");
      }else {
        for(int i=0;i<array.length-2;i++){
          h=h.nextHouse;
        }
        System.out.println("model:" + h.candy);
      }
    }
    if(inputs[0].equals("step")){
      House h = Main.modelStreet(array);
      int steps =Integer.parseInt(inputs[2]);
      System.out.println("step:"+Main.getCandy(h,steps));
    }
    if(inputs[0].equals("max")){
      House h = Main.modelStreet(array);
      int steps =Integer.parseInt(inputs[2]);
      House max = Main.getMaxCandyOnStreet(h,steps)
      if(h==null){
         System.out.println("max:null");
      }
      else {
      System.out.println("max:"+max.candy);
           }
    }
  }

}
