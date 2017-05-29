#join string and number


x = raw_input(" Enter the Name : ")

y = input (" Enter the P.R.N. : ")

# method 1

num = str (y)  # str() and repr() are same string fuction convert into string

print ( x + " has P.R.N. " + num )


# method 2

print ( x + " has P.R.N. " + `y` )
# ` is symbol above tab key called backtic used to convert into string

raw_input()
