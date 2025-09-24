class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[n-1-j][i];
                arr[n-1-j][i]=arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j]=arr[j][n-1-i];
                arr[j][n-1-i]=temp;
            }
        }
        for(int[] r:arr){
            for(int a:r){
                System.out.print(a);
            }
        }
    }
}