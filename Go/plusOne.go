package main

import (
    "fmt"
    "bufio"
    "os"
    "strconv"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    scanner.Split(bufio.ScanLines)
    for scanner.Scan() {
        x, _ := strconv.Atoi(scanner.Text())
        fmt.Println(x + 1)
    }
}
