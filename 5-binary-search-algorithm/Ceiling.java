public class Ceiling{
    public static void main(String[] args) {
        int[] arr = {9, 16, 23, 34, 38, 41, 56, 58, 60, 67, 77, 89};
        int target = 60;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    //return the index : smallest number greater than equal to target
    static int ceiling(int[] arr, int target) {

        //but if the target element is greater than the greatest number is the array
        if(target  > arr[arr.length - 1])
            return -1;

        if(arr.length == 0)
            return -1;
        
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > target)
                end = mid + 1;
            else if(arr[mid] < target)
                start = mid - 1;
            else {
                return mid;
            }
        }
        return start;
    }
}