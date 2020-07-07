class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] cellsPrev = new int[cells.length];
        for(int i=0 ; i < N ; i++){
            System.arraycopy(cells, 0, cellsPrev, 0, cells.length);
            int j=1;
            while(j != cells.length-1){
                if(cellsPrev[j-1] == 0 && cellsPrev[j+1] == 0){
                    cells[j] = 1;
                }else if(cellsPrev[j-1] == 1 && cellsPrev[j+1] == 1){
                    cells[j] = 1;
                }else{
                    cells[j] = 0;
                }
                j++;
            }
            cells[cells.length-1]=0;
        }
        cells[0]=0;
        cells[cells.length-1]=0;

        return cells;
    }
}
