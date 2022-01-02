package Assignments.Searching;

public class Ceiling_of_a_number {
    public static void main(String[] args) { /* ceiling  = Smallest element in an array,
        greater or =to target
        */
        int[] arr={2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int start = 0;
        int end = arr.length-1;
        int middle = (start+end)/2;
        while(start <= end){
            if(target==arr[middle]){
                System.out.println("Ceiling found, at index no. : "+middle);
            } else if(target> arr[middle]){
                start = middle+1;
                middle = (start+end)/2;
                
            } else if(target<arr[middle]){
                end = middle;
                middle = (start+end)/2;
            } else{
                System.out.println("Ceiling found, at index no. : "+arr[start]);
            }
        }
        System.out.println("Ceiling found, at index no. : "+start);
    }
}
