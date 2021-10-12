public class Main {
  public static void main(String[] args) {
    int[] houses = new int[]{0,2,3,6,4};
    House h = modelStreet(houses);
    System.out.println("next candy value should be 2, it is:"+h.nextHouse.candy);
    System.out.println("get candy value should be 5, it is:"+getCandy(h,2));
    System.out.println("the candy value of the house returned should be 3, it is:"+getMaxCandyOnStreet(h,2).candy);

  }
  public static House modelStreet(int[] input){
    return new House(0);
  }

  public static int getCandy(House h, int n){
    return 50;
  }

  public static House getMaxCandyOnStreet(House h, int n){
    return new House(0);
  }

}
