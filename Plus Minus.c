#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    n=len(arr)
    ne=0
    p=0
    z=0
    for i in arr:
        if i<0:
            ne+=1
        elif i>0:
            p+=1
        else:
            z+=1
    print(p/n)
    print(ne/n)
    print(z/n)
if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)

