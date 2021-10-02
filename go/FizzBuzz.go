package main

import (
	"fmt"
	"strconv"
)

var fizz = []byte{0b1000110, 0b1110101, 0b1100011, 0b1101011}
var buzz = []byte{0b1010100, 0b1101000, 0b1101001, 0b1110011}

func main() {
	for i := 0; i < 100; i++ {
            fmt.Println(getFizzBuzz(i + 1));
	}
}

func getFizzBuzz(n int) string{
    var out = "";
    var test1 = 3;
    var test2 = 5;

    if(n % test1 == 0) {
        out += string(fizz);
    }
    if(n % test2 == 0) {
        out += string(buzz);
    }
    var length = len([]rune(out))
    if(length == 0){
        out = strconv.Itoa(n);
    }
    return out;
}