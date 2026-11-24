class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> a = new ArrayList<>();
        int i = 0, j = 1;
        while(j<=n && i<target.length){
            if(j==target[i]){
                a.add("Push");
                j++;i++;
            }else{
                while(j<target[i]){
                    a.add("Push");
                    a.add("Pop");
                    j++;
                }
            }
        }
        return a;
    }
}