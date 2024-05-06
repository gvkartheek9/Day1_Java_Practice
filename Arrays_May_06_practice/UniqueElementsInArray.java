package Arrays_May_06_practice;

import java.util.Scanner;

//10th program on Arrays

public class UniqueElementsInArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int visited = -1;
        int count;
        System.out.println("Enter number of elements in an array");
        int n = sc.nextInt();
        System.out.println("Please Enter the elements here: ");
        int[] a = new int[n];
        int[] fr=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }
        System.out.print("The unique Elements are ");
        for(int i=0;i<a.length;i++){
            if(fr[i]==1||fr[i]==0)
                System.out.print(a[i]+" ");
        }
    }
}
