class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c = 0;
        for(int i = 0;i<arr1.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<arr2.length;j++){
                if(min>Math.abs(arr1[i]-arr2[j])){
                    min = Math.abs(arr1[i]-arr2[j]);
                }
            }
            if(d<min) c++;
        }
        
        return c;
    }
}