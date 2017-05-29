# main program 

def getdata ():
     print ("\n\nEnter the folloing data : ")
     whi = float(input ("\tEnter weight : "))
     hei = float(input ("\tEnter height : "))
     return whi , hei

def calbmi ( wt , hi ) :
     print ("\n\n calculate BMI for the given data : ")
     b = (703 * wt) / (hi * hi)
     return b

def main ():
     print ("\n\n######calculate body mass index ##########\n\n")
     (w,h) = getdata()
     bmi = calbmi (w,h)
     print ("BMI = " , bmi)

main()     

input()     
#raw_input()
     
