package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    int massivSize;
    ArrayList<Integer> arrayList=new ArrayList();
    public void makeMassiveUsingKeybord(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter massive size: → ");
        massivSize=scanner.nextInt();
    }
    public void vvodMasiva(){
        Scanner scanner = new Scanner(System.in);
   for (int i=0;i<massivSize;i++){
       System.out.print("Enter element " + i + ": ");
       arrayList.add(scanner.nextInt());
   }
    }

    public void printMassive(){
        vvodMasiva();
        System.out.println("Your base massive is: ");
        for (int i=0;i<arrayList.size();i++){
            if (i==arrayList.size()-1){
                System.out.println(arrayList.get(i)+".");
            }else System.out.print(arrayList.get(i)+", ");

        }
    }
    public void sortMassiveByBubbleWay(){
        boolean isSorted=true;
        int buf;
        while (isSorted){
            isSorted=false;
            for (int i=0;i<massivSize-1;i++){
                if (arrayList.get(i)<arrayList.get(i+1)){
                    isSorted=true;
                    buf=arrayList.get(i);
                arrayList.set(i,arrayList.get(i+1));
                arrayList.set(i+1,buf);
                }
            }

        }
    }
  public void   printSortedDescMassive(){
        sortMassiveByBubbleWay();
      System.out.println("Sorted massive DESC: ");
      for (int i=0;i<arrayList.size();i++){
          if (i==arrayList.size()-1){
              System.out.println(arrayList.get(i)+".");
          }else System.out.print(arrayList.get(i)+", ");

      }
  }
}
