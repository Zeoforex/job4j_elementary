package ru.job4j.array;

public class MatrixCheck {
    /**
     * Проверка по горизонтали что все одинаковы если нет то false
     * @param board
     * @param row
     * @return
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверка по вертикали что все одинаковы если нет то false
     * @param board
     * @param column
     * @return
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] chars : board) {
            if (chars[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Проверка идет по диагонали
     * @param board
     * @return
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * И в итоге выигрышная позиция когда по диагонали и по горизонали или по вертикали
     * @param board
     * @return
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}