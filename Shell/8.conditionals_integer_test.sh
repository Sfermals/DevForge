#!/bin/bash

read -p "Enter a number : " num
if ((num == 10)); then
    echo "Your number equals 10"
fi

if ((num > 10)); then
    echo "It is greater then 10"
else
    echo "It is less then 10"
fi

if (( ((num % 2)) == 0 )); then
    echo "It is an even number"
else
    echo "It is an odd number"
fi