import math

class MyMath:
    def __init__(self, a, b):
        self.a = a
        self.b = b
        
    def addition (self):
        print (self.a+self.b)
        
    def multiplication (self):
        print (self.a*self.b)
        
    def division (self):
        print (self.a/self.b)
        
    def subtraction (self):
        print (self.a - self.b)
        
    def pow(self):
        print (self.a**self.b)
        
    def sqrt(self):
        print (math.sqrt(self.a))

mymath = MyMath (float(input()), float (input()))
mymath.addition()
mymath.multiplication()
mymath.division()
mymath.subtraction()
mymath.pow()
mymath.sqrt()


