public class Binary_search_recursion {
    public static void main(String args[]){
        int arr[]={2,4,6,8,23,34,54,65,76};
        int t=76;
        int s=0;
        int e=arr.length-1;
        System.out.print(bs(arr,t,s,e));

    }
    static int bs(int arr[],int target,int s,int e){

        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bs(arr,target,s,mid-1);
        }
        return bs(arr,target,mid+1,e);
    }
}
