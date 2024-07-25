#!/bin/bash 

read -p "Enter a number: " num

if ((num == 50)); then
    echo "Your number equals 50"
fi

if ((num > 50)); then 
    echo "Your number is more then 50"
fi

if ((num < 50)); then
    echo "Your number is less then 50"
fi

if (( ((num % 2)) == 0 )); then 
    echo "It is an even number"
else
    echo "It is an odd number"
fi

if (( ((num > 0)) && ((num < 51)) )); then
    echo "$num is between 1 and 50"
else
    echo "its more then 50"
fi


#Strings

str2="Sad"
str3="Happy"

if [ "$str2" == "$str3" ]; then
    echo "$str2 equals $str3"

elif [ "$str2" != "$str3" ]; then
    echo "$str2 is not equal to $str3"
fi
