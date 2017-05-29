#test verb and add ing to it

#!/usr/bin/python
vouels=['a','e','i','o','u']
def make_ing_form(z):
	if z[-2]=='i'and z[-1]=='e':
		s=z[0:-2]
		s+='ying'
		print '\n',s
	elif z[-1]=='e':
		ln=len(z)
		s=z[0:-1]
		s+='ing'
		print "\n",s
		return
	elif z[-2] in vouels and z[-1] not in vouels:
		a=z[-1]
		z=z+a+'ing'
		print z
	else:
		z+='ing'
		print z
		
z=raw_input("Enter any verb\n")
make_ing_form(z)
