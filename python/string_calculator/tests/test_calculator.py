#!/usr/bin/env python
# -*- coding: utf-8 -*-
import unittest
import sys

from calculator.calculator import Calculator

class CalculatorTest(unittest.TestCase):

    def test_sum_of_empty_string_is_zero(self):
        calc = Calculator()
        self.assertEqual(calc.add(""), 0 , "Sum of empty string is zero")   

    def test_sum_of_number_is_itself(self):
        calc = Calculator()
        self.assertEqual(calc.add("5"), 5 , "Sum of number is itself")

    def test_sum_of_two_numbers_comma_separated(self):
        calc = Calculator()
        self.assertEqual(calc.add("5,3"), 8, "Sum of 5,3 is 8")
        