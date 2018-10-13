#!/usr/bin/env python
# -*- coding: utf-8 -*-
import unittest
import sys

from calculator.calculator import Calculator

class CalculatorTest(unittest.TestCase):

    def test_sum_of_empty_string_is_zero(self):
        calc = Calculator()
        