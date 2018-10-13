#!/usr/bin/env python
# -*- coding: utf-8 -*-

from setuptools import setup, find_packages

with open('README.rst') as f:
    readme = f.read()

with open('LICENSE') as f:
    license = f.read()

setup(
    name='string_calculator',
    version='0.1',
    description='Developing a String Calculator using TDD',
    long_description=readme,
    author='Agility Roots',
    author_email='hack@agilityroots.com',
    url='https://github.com/agilityroots/musings',
    license=license,
    packages=find_packages(exclude=('tests', 'docs'))
)