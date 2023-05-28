package workingPurpose;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,2,3,8,58,33};
        //sort(arr,0,arr.length-1);
        //System.out.println(Arrays.toString(arr));
        LL list=new LL();
       /* list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(6);
        list.insertfirst(9);
        list.insertfirst(10);
        list.display();

        */
        list.insertlastindex(45);
        list.insertlastindex(2);
        list.insertAtPosition(49,1);
        list.display();
        //list.deletefirst();
        //list.display();
         //list.deletelast();

    }
    public static void sort(int[] arr,int low,int high){

        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
           while(arr[start]<pivot){
               start++;
           }
           while(arr[end]>pivot){
               end--;
           }
           if(start<=end) {
               swap(arr, start, end);
               start++;
               end--;
           }
        }
        sort(arr,low,end);
        sort(arr,start,high);
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
