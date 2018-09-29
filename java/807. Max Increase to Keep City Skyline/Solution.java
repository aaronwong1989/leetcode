import java.util.Arrays;

class Solution {

  int maxIncreaseKeepingSkyline(int[][] grid) {
    int maxIncrease = 0;
    // 存储 横向 天际线，每一列的最大值
    int[] hSkyline = new int[grid[0].length];
    // 存储 纵向 天际线，每一行的最大值
    int[] vSkyline = new int[grid.length];

    System.out.println("old grid : ");
    // 求得天际线
    for (int i = 0; i < grid.length; i++) {
      System.out.println(Arrays.toString(grid[i]));
      for (int j = 0; j < grid[0].length; j++) {
        hSkyline[j] = Math.max(hSkyline[j],grid[i][j]);
        vSkyline[i] = Math.max(vSkyline[i],grid[i][j]);
      }
    }

    System.out.println("\nhSkyline : " + Arrays.toString(hSkyline));
    System.out.println("vSkyline : " + Arrays.toString(vSkyline));
    System.out.println("\nnew grid : ");
    // 求得新的grid
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        int tmp = Math.min(hSkyline[j], vSkyline[i]);
        maxIncrease += tmp - grid[i][j];
        grid[i][j] = tmp;
      }
      System.out.println(Arrays.toString(grid[i]));
    }
    System.out.println("\nmaxIncrease : " + maxIncrease);
    return maxIncrease;
  }
}