class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int twice = -1;
        int missing = -1;
        int[] count = new int[n * n + 1];

        for(int i = 0;i< n; i++){
            for(int j =0; j < n; j++){
                count[grid[i][j]]++;
            }
        }

        for(int num = 1; num <= n*n; num++){
            if(count[num] == 2){
                twice = num;
            }

            if(count[num] == 0){
                missing = num;
            }
        }

        return new int[] {twice,missing};
    }
}