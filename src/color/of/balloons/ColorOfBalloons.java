/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color.of.balloons;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ColorOfBalloons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int count1=0,count2=0;
            String str = input.next();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a')
                {
                    count1++;
                }
                else if(ch=='b')
                {
                    count2++;
                }
            }
            if (count1 >= count2)
            {
                System.out.printf("%d\n", count2);
            }
            else if (count1 < count2)
            {
                System.out.printf("%d\n", count1);
            }
        }
        t--;
    }
    
}
