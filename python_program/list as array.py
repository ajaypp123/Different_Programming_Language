#  list used as array

# list is hybrid of number and string

a = input ("Enter size of list :")

mylist = []

b = 0

while b < a :
     mylist[b:b] = input (" Enter number : ")
     b +=1

print "   \n\naddition of all number in list\n\n "

print mylist

b = 0
p=0

while b < a :
     p = p + mylist[b]
     b +=1

print (p)

raw_input ()

     
