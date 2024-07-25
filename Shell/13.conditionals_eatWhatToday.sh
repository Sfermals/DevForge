#!/bin/bash
# Generate a randomly based range defined by the user


echo "Hmm what should we eat today??"

sleep 1

echo "lets see.."

sleep 1

echo "..."

sleep 1

minimum=1
maximum=10

#Generate the random number
randomNumber=$(($minimum + $RANDOM % $maximum))
#Print the generated number
echo "lucky number: $randomNumber"

eat=$randomNumber

case $eat in
1)
    echo "Les Amis"
    ;;

2)
    echo "Restaurant André"
    ;;

3)
    echo "Candlenut Kitchen"
    ;;

4)
    echo "Crystal Jade"
    ;;

5)
    echo "Din Tai Fung"
    ;;

6)
    echo "Pizza Hut"
    ;;

7)
    echo "McDonald’s"
    ;;

8)
    echo "KFC"
    ;;

9)
    echo "Jollibee"
    ;;

10)
    echo "Ippudo"
    ;;
esac

