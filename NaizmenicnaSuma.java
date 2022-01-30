//3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole. Na standardni izlaz ispisati resenje izraza:
//1 - 2 + 3 - .... (+/-) n.

package Domaci0912;

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = s.nextInt();

        int neparni = 0;

        for(int i = 1; i <= broj; i++){
            if(i % 2 != 0){
                neparni = neparni + i;
            }
            else{
                neparni = neparni - i;
            }
        }

        System.out.print("Naizmenicna suma do tog broja je " + neparni);


    }
}

