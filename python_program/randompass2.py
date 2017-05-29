#random password generator 


#!/usr/bin/python
import random
import string 
k=''
a=string.letters
a+=string.digits
a+=string.punctuation

z=random.sample(a,8)
for x in z:
	k+=x
i=0
for x in k:
	i+=1
	if x in string.lowercase:
		print  i,"th element is lowercase","\n"
	elif x in string.uppercase:
		print  i,"th element is uppercase","\n"
	elif x in string.punctuation:
		print  i,"th element is Special symbol","\n"
print k	
