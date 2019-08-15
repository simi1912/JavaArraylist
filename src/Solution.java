import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);
    static List<List<Integer>> big = new ArrayList<>();

    public static void main(String[] args) {

        int n = scan.nextInt();

        for(int i =0; i<n; i++){
            big.add(new ArrayList<>());
            int m = scan.nextInt();
            for(int j=0; j<m; j++){
                big.get(i).add(scan.nextInt());
            }
        }

        int l = scan.nextInt();

        for(int i = 0; i<l; i++){
            try {
                System.out.println(
                        big.get(scan.nextInt() - 1).get(scan.nextInt() - 1)
                );
            }catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR");
            }
        }
    }
}

