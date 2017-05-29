#studen data

#!/usr/bin/python
class Student:
	def __init__(self):
		print "new object created\n"
	
	def setattr(self,name,prn,percent):
		self.name=name
		self.prn=prn
		self.percent=percent

	def getattr(self):
		return self.name,self.prn,self.percent

s1=Student()
s1.setattr("a",130450,8.18)
#print s1.getattr()
a,s,d=s1.getattr()
print a,s,d
		
