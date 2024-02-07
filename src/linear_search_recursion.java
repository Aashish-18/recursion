public class linear_search_recursion {
    public static void main(String args[]){
        int arr[]={2,4,5,7,8};
        System.out.println(search(arr,7,0));
        System.out.println("At "+search_index(arr,7,0)+" Index");
    }
    static boolean search(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return target==arr[index] || search(arr,target,index+1);
    }
    static int search_index(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(target==arr[index]){
            return index;
        }
        return search_index(arr,target,index+1);
    }
}
