#!/bin/bash

GetAvg(){

local num1=$1
local num1=$2
local num1=$3

local sum=$((num1+num2+num3))
local avg=$((sum/3))

echo $avg

}

num01=10
num02=20
num03=30

avg=$(GetAvg num01 num02 num03)
echo "The average is $avg"