public class Main {

  public static void main(String[] args) {
    int[][] grid = new int[][]{
        new int[]{3, 0, 8, 4},
        new int[]{2, 4, 5, 7},
        new int[]{9, 2, 6, 3},
        new int[]{0, 3, 1, 0},
        new int[]{4, 7, 1, 9}
    };

    int maxIncrease = new Solution().maxIncreaseKeepingSkyline(grid);

    assert maxIncrease > 0;
  }
}