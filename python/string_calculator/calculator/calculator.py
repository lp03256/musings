#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Calculator:
    
    def add(self, numbers):
        if not numbers:
            return 0
        else:
            numbersArray = [ int(number) for number in numbers.split(',')]
            return sum(numbersArray)         