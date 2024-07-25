#!/bin/bash

while read day earn hrs; do

  # printf allows you to use \n
  printf "\nDay: ${day}\nEarn: ${earn}\nHRs: ${hrs}\n "______"\n"

# Pipe data into the while loop
done < grab_delivery_earnings.txt