#store cart

#!/usr/bin/python
dict1={101:"Bat   ",102:"Ball  ",103:"Stumps",104:"TShirt",105:"Track "}
dict2={101:2500,102:200,103:300,104:400,105:600}
dict3={101:0,102:8,103:9,104:11,105:12}
cart = []
print "========= CRICKET CART ========="
while 1:
	a=input("\n\n1.Display\n2.Purchase\n3.Bill\n4.Exit\n")
	if a==1:
		for x in dict1:
			print x,"\t" , dict1[x]+"=",dict2[x],"\tavailable =",dict3[x]
	elif a==2:
		c=1
		print "Enter 0 to stop Selecting products"
		while c!=0:
			c=input()
			if c!=0:
				if dict3[c]>=1:
					cart.append(c)
					dict3[c]-=1
				else:print "Not Available in stock", dict1[c]
	elif a==3:
		total = 0
		for x in cart:
			total+=dict2[x]
		print "\n\nTOTAL =",total
		print "\nAmount to be paid adding Tax",total+(total*15)/100
		cart=[]
	elif a==4:break
	else: print "Enter valid option\n"
