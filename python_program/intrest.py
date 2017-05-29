#simple and compound intrest

#!/usr/bin/python
def SI():
	p,t,r=input("Enter value of P,T,R\n")
	print "SI is :",(p*t*r)/100
def CI():
	p,t,r,n=input("Enter principal,duration,rate,no of years compunted\n")
	print "CI is :",p*(1+r/n)**(n*t)
c=input("\n1.SI\nCI\n")
if c==1:SI()
if c==2:CI()
