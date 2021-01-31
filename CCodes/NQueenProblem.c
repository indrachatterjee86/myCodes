#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

#define BOARD_ROW 4
#define BOARD_COL 4
#define CHECK_FORWARD 10
#define CHECK_BACKWARD 11
#define CHECK_LEFT_FORWARD 12
#define CHECK_RIGHT_BACKWARD 13

typedef unsigned char boolean;
typedef  int UINT;



boolean checkDiagonalAttack(UINT row, UINT col, UINT boardArr[BOARD_ROW][BOARD_COL], UINT type){
    int r =row, c = col;
    if (CHECK_FORWARD == type){
        ++r; ++c;
        while (r < BOARD_ROW && c < BOARD_COL){
            if (1 == boardArr[r][c])
                return TRUE;
            
            ++r; ++c;
        }
    }else if (CHECK_BACKWARD == type){
        --r; --c;
        while (r>=0 && c>=0){
            if (1 == boardArr[r][c])
                return TRUE;
            --r; --c;
        }
    }else if (CHECK_LEFT_FORWARD == type){
        ++r; --c;
        while (r < BOARD_ROW && c >= 0 ){
            if (1 == boardArr[r][c])
                    return TRUE;
            ++r; --c;
        }
    }else // Check Right backward
    {
        --r; ++c;
        while (r>=0 && c < BOARD_COL){
            if (1 == boardArr[r][c])
                return TRUE;
            --r; ++c;
        }
    }
    return FALSE;
}

void displayBoard(UINT boardArr[BOARD_ROW][BOARD_COL]){
    for (int i = 0; i < BOARD_ROW; ++i){
        for (int j = 0; j< BOARD_COL; ++j){
            printf("%u \t", boardArr[i][j]);
        }
        printf("\n");
    }
}
boolean isQueenAttacked (UINT row, UINT col, UINT boardArr[BOARD_ROW][BOARD_COL]){
    unsigned int rIndex = 0 , cIndex= 0;

    /**
     * Check if queen placed in row
     */
    for (cIndex = 0; cIndex <= BOARD_COL; ++cIndex){
        if ( 1 == boardArr[row][cIndex])
            return TRUE;
    }
    /*
     * Check if queen is attacked column wise
     */
    for (rIndex = 0; rIndex <= BOARD_ROW ; ++rIndex){
        if (1 == boardArr[rIndex][col])
            return TRUE;
    }

    /*
     * Check Diaognals here
     */
    if (checkDiagonalAttack(row, col, boardArr,CHECK_FORWARD) ||
            checkDiagonalAttack(row, col, boardArr, CHECK_BACKWARD) ||
            checkDiagonalAttack(row, col, boardArr, CHECK_LEFT_FORWARD) ||
            checkDiagonalAttack(row, col, boardArr, CHECK_RIGHT_BACKWARD))
    {
        displayBoard(boardArr);
        printf("Diagonal Attack Identified\n");
        return TRUE;
    }

    return FALSE;
}

boolean NQueens (UINT boardArr[BOARD_ROW][BOARD_COL], UINT  N){

    if (0 == N){
        printf("All queens placed \n");
        return TRUE;
    }
    int rowIndex = 0;
    int colIndex = 0;

    for ( rowIndex = 0; rowIndex < BOARD_ROW; ++rowIndex){
        for (colIndex = 0; colIndex< BOARD_COL; ++colIndex){
            if (isQueenAttacked(rowIndex, colIndex , boardArr)){
                printf("Continuing: queen being attacked\n");
                continue;
            }
            /*
             * Placing queen here
             */
            printf("Placing Queen at [row:%u][col:%u]\n", rowIndex, colIndex);
            boardArr[rowIndex][colIndex] =1;
            if (NQueens(boardArr, N-1)){
                return TRUE;
            }
            printf("Remove Queen at [row:%u][col:%u] \n", rowIndex, colIndex);
            /*
             * Backtracking here, undoing queen placed location to 0 from 1
             */
            boardArr[rowIndex][colIndex] = 0;
        }
    }

    printf("End of NQueens\n");
    return FALSE;
}

int main(){
    printf("Welcome to N Queens Problem \n");
    const char *yes = "yes";
    const char *no = "no";
    UINT chessBoard[BOARD_ROW][BOARD_COL] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    displayBoard(chessBoard);
    printf("Can 3 Queens be placed in 4x4 board : %s \n", NQueens(chessBoard, 4)== TRUE? yes:no);
    displayBoard(chessBoard);
    return 0;
}

