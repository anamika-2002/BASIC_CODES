public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 2;
        int n= arr.length;
        int low = 0;
        int high = n-1;
        boolean flag = true;
        while(low<high){
            int mid= high - (high-low)/2;

           if(arr[mid] == key){
               System.out.println(key + " is found at " + mid);
               flag = false;
               break;
               

           }
           if(arr[mid] > key){
               high = mid;
               
           }
           else
            low = mid;
        }
        if(flag){
            System.out.println(key + " not found.");
        }
    }
    
}