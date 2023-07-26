
public class Search {
    public static int linear (int arr[], int item){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == item )
                return i;
        }
        return -1;
    }

    public static int binary(int arr[], int item){
        int firstIndx = 0;
        int lastIndx = arr.length -1;
        int midIdx;
    
        while(firstIndx <= lastIndx){
            midIdx =  (firstIndx + lastIndx)/2;
            if(arr[midIdx] == item)
                return midIdx;
            else if(arr[midIdx]>item){
                lastIndx = midIdx - 1;
            }
            else
                firstIndx = midIdx +1;
            
        }  
        return -1;
    }
    // public static int binary(int arr[], int item){
    //     int left=0;
    //     int right=arr.length-1;
    //     int found=0;
    //     int index;
    //     int mid;
    //     do{
    //     mid=(left+right)/2;
    //     if(item==arr[mid])
    //         found=1; 
    //     else
    //     {
    //         if(item<arr[mid])
    //             right=mid-1;
    //         else
    //             left=mid+1;
    //     }
    //     }while(found==0&&left<right);
    //     if(found==0)
    //         index=-1;
    //     else
    //         index=mid;
    //     return index;

    // }
}

