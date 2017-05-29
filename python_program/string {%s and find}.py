# string stuff   (%s-find-lower-replace)

print '-----------------------------------------'

print '   Fill in blanks'

print " Hello ___ , your class is ___ , nice to meet ___ "

print ("fill ( name , class , pronoun ) ")

old = " Hello %s , your CLASS is %s , nice TO meet %s "

# here %s are missing letter

print '-----------------------------------------'

a = raw_input ( "Enter name :" )
b = raw_input ( "Enter class :" )
c = raw_input ( "Enter pronoun :" )

ver = (a,b,c)

print '-----------------------------------------'

new = old % ver

print new

print '-----------------------------------------'

#find method is used to find word in string

a = raw_input ( "Enter word to be find : " )

print (new.find(a))

print '-----------------------------------------'

#lower method is used to convert string
print "All string is in lower letter"

print ( new.lower())


print '-----------------------------------------'

#replace method

a = raw_input ( "Enter word to be replace : " )

b = raw_input ( "Enter word : " )

print (new.replace(a,b))

print '-----------------------------------------'


raw_input ()
