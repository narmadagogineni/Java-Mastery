//Left angle triangle pattern

import java.util.*;

public class patterns {
    public static void main(String args[]) {
        //vertical
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {   //horizontal
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
