import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try{
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            LinkedList<Integer> size = new LinkedList<>();
            Scanner in = new Scanner(System.in);
            int n=1;
            int newsize=1;
            System.out.println("Enter count of comparisons: ");
            while(!in.hasNextInt() || in.nextInt()<0) {
                System.out.println("Incorrect type!");
                in.next();
            }
            n=in.nextInt();
            for (int j = 0;j < n; j++) {
                System.out.println("Enter new size for comparison: ");
                while(!in.hasNextInt()) {
                    System.out.println("Incorrect type!");
                    in.next();
                }
                if(in.hasNextInt()) newsize = in.nextInt();
                size.add(newsize);
            }
            for(int i = 0; i < n; i++) {
                System.out.println("For method : Add");
                System.out.print("Number of elements : " + size.get(i));
                System.out.println(" ArrayList  : " + new Comparison().checkAdd(arrayList, size.get(i)));
                System.out.println(" LinkedList : " + new Comparison().checkAdd(linkedList, size.get(i)));

                System.out.println("For method : Get ");
                System.out.print("Number of elements : " + size.get(i));
                System.out.println(" ArrayList  : " + new Comparison().checkGet(arrayList, size.get(i)));
                System.out.println(" LinkedList : " + new Comparison().checkGet(linkedList, size.get(i)));

                System.out.println("For method : Delete ");
                System.out.print("Number of elements : " + size.get(i));
                System.out.print(" ArrayList  : " + new Comparison().checkDelete(arrayList, size.get(i)));
                System.out.println(" LinkedList : " + new Comparison().checkDelete(linkedList, size.get(i)));
            }
        }
        catch(InputMismatchException exp){
            System.out.println("Error in data management!\nInt type is required");
        }
    }
}