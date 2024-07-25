# A function that receives 2 values and prints a sum

getSum() {

# Attributes are retrieved by referring to $1, $2, etc.
local num3=$1
local num4=$2
# Sum values
local sum=$((num3+num4))

# Pass values back with echo
echo $sum
}

num1=5
num2=6
# You pass atributes by separating them with a space
# Surround function call with $() to get the return value
sum=$(getSum num1 num2)
echo "The sum is $sum"  ##output will print 11


