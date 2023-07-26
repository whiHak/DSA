
public class Sort {
    public static void bubble(int arr[]){
        int temp;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    } 

    public static void selection(int arr[]){
        for (int i = 0; i < arr.length ; i++){
            int smallest = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }    
    }
    
    // public static void insertion(int arr[]){

    //     for(int i = 1; i< arr.length; i++){
    //         int current = arr[i];
    //         int j = i - 1; 

    //         while(j >= 0 &&current < arr[j]){
    //             arr[j + 1] = arr[j];
    //             j--;
    //         }

    //         arr[j+1] = current;
    //     }
    // }
    public static void insertion(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            for(int j = i; j > 0; j--){
                if(temp < arr[j-1]){
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}

