class Solution {
    public void rotate(int[] arr, int d) {
        int n=arr.length;
        int []temp=new int[n];
        d%=n;
        int c=0;
        
        for(int i=n-d;i<n;i++){
            temp[c]=arr[i];
            c++;
        }
        c=0;
        for(int i=d;i<n;i++){
            temp[i]=arr[c];
            c++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
}