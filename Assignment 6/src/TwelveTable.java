public class TwelveTable {
    public static void main(String[] args) {

        int[][] table = new int[12][12];

        for (int row = 0; row < 12; ++row) {
            for (int col = 0; col < 12; ++col) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int row = 0;row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.printf("%6d",table[row][col]);
            }
            System.out.println();
        }
    }
}
