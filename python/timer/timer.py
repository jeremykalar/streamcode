# -*- coding: utf-8 -*-
"""
Created on Mon Jan 30 15:50:59 2023

@author: Jeremy
"""
from countdown import *
def start():
    hours = int(input('Enter hours: '))
    minutes = int(input('Enter minutes: '))
    seconds = int(input('Enter seconds: '))
    #inputed time
    timer(hours, minutes, seconds)
