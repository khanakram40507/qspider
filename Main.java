import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        int arr[] = new int[5];
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
        for(int i=0; i<arr.length; i++){  // here length is variable which is used to find the length of array , in case of string it is length() method.
            System.out.print(arr[i] + " ");
        }       

}
}