package Pattterns;

public class Pattern7 {
    public static void main(String[] args) {
        {
            for(int i=1;i<=5;i++)
            {
                for(int j=4;j>=i;j--)
                { 
                   for(int s=0;s<=i;s++){
                    System.out.println(s+i);
                   }
                    //System.out.print(i);
                }
                System.out.println();
            } 
    }
}
}
