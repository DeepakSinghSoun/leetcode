class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int twice = -1;
        int missing = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i< n; i++){
            for(int j =0; j < n; j++){
                int num = grid[i][j];

                map.put(num, map.getOrDefault(num,0)+1);
            }
        }

        for(int num = 1; num <= n*n; num++){
            if(map.getOrDefault(num,0) == 2){
                twice = num;
            }

            if(map.getOrDefault(num,0) == 0){
                missing = num;
            }
        }

        return new int[] {twice,missing};
    }
}