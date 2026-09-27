class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int r = 0; r < 9; r++) {
            HashSet<Character> seen = new HashSet<Character>();
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') {
                    continue;
                }
                if (seen.contains(val)) {
                    return false;
                }
                seen.add(val);
            }
        }

        // Check columns
        for (int c = 0; c < 9; c++) {
            HashSet<Character> seen = new HashSet<Character>();
            for (int r = 0; r < 9; r++) {
                char val = board[r][c];
                if (val == '.') {
                    continue;
                }
                if (seen.contains(val)) {
                    return false;
                }
                seen.add(val);
            }
        }

        // Check boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> seen = new HashSet<Character>();
                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        char val = board[r][c];
                        if (val == '.') {
                            continue;
                        }
                        if (seen.contains(val)) {
                            return false;
                        }
                        seen.add(val);
                    }
                }
            }
        }

        return true;
    }
}