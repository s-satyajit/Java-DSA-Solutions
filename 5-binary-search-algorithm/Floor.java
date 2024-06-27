public class Floor {
    public static void main(String[] args) {
        int[] arr = {9, 16, 23, 34, 38, 41, 56, 58, 60, 67, 77, 89};
        int target = 60;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    //return the index: greatest number less than equal to target 
    static int floor(int[] arr, int target) {
        
        if(arr.length == 0)
            return -1;

        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid])
                start = mid + 1;
            else if(target < arr[mid])
                end = mid -1;
            else
                return mid;
        }
        return end;
    }

}
