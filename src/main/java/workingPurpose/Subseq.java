package workingPurpose;

import java.util.ArrayList;
import java.util.Arrays;


public class Subseq {
    public static void main(String[] args) {
       String p="";
       String up="abc";
      // ArrayList<String>list=sub(p,up);
        //System.out.println(list);
        //int[] arr={3,4,5,6,1};
       // int j=resize(arr);
        //System.out.println(j);
        int n=5;
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static ArrayList<String> sub(String p, String up){
        if(up.length()==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(sub(first+ch+second,up.substring(1)));
        }
        return ans;
    }
    public static int resize(int[] arr){
        int n=arr.length+1;
        int sum=(n*(n+1))/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
    }

}
