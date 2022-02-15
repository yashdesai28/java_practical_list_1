 import java.util.*;
 public class jpr10 {
        public static void main(String[] args) {
            int[] input = { 2,1,3,4};
            for (int x = 0; x < 4; x++)
            {
                //System.out.println("==x"+x);
                for (int y = 0; y < 4; y++)
                {
                    //System.out.println("==y"+y);
                    for (int z = 0; z < 4; z++)
                    {
                        //System.out.println("==z"+z);

                        for (int p = 0; p < 4; p++)
                        {
                            //System.out.println("==p"+p);
                            if (x != y && y != z && z != p && p!=x && x!=z &&y!=p)
                            {
                                System.out.println(input[x] + " " + input[y] + " " + input[z]+ " " +input[p]);
                            }
                        }
                    }
                }
            }
        }
    }