#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LENGTH 10

const char* getFizzBuzz(int n);
const char* charArrToString(char* in);

char fizzCharArr[] = {0b1000110, 0b1110101, 0b1100011, 0b1101011};
char buzzCharArr[] = {0b1010100, 0b1101000, 0b1101001, 0b1110011};

int main(void){
    int i;
    for(i = 0; i < 100; i++){
        printf("%s\n", getFizzBuzz(i));
    }
    return 0;
}

const char* getFizzBuzz(int n){
    static char out[LENGTH];
    memset(out, 0, LENGTH);
    int test1 = 3;
    int test2 = 5;

    if(n % test1 == 0) {
        strcat(out, charArrToString(fizzCharArr));
    }
    if(n % test2 == 0) {
        strcat(out, charArrToString(buzzCharArr));
    }

    if(strlen(out) == 0){
        snprintf(out, 4, "%d", n);
    }
    return out;
}

const char* charArrToString(char* in){
    static char out[16];
    memset(out, 0, LENGTH);

    int i = 0;
    while(i<4){
        strncat(out, &in[i], 1);
        i++;
    }
    return out;
}