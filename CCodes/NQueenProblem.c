#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

typedef unsigned char boolean;
typedef unsigned int UINT;


boolean isQueenAttacked (UINT pos_x, UINT pos_y, UINT boardArr[4][4], UINT N){
    unsigned int xIndex = 0 , yIndex = 0;

    for (xIndex = 0; xIndex <= 4; ++xIndex){
        if ( 1 == xIndex)
            return TRUE;
    }

    for (yIndex = 0; yIndex <=4 ; ++yIndex){
        if (1 == yIndex)
            return TRUE;
    }
}


boolean NQueens (unsigned int boardArr[4][4], unsigned int N){

    if (0 == N){
        printf("All queens placed \n");
        return TRUE;
    }

    return FALSE;
}

int main(){
    printf("Welcome to N Queens Problem \n");
    return 0;
}

