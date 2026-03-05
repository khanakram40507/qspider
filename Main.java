import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = -10;
        arr[1] = 20;
        arr[2] = 30;    
        arr[3] = 40;
        arr[4] = 50;
        for(int i=0; i<arr.length; i++){  // here length is variable which is used to find the length of array , in case of string it is length() method.
            System.out.println(arr[i]);
        }       

}
}