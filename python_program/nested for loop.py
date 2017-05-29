# nested for loop for prime no bet 1 - 100
# range (stop)
# range (start , stop)   stop value not include in range
# range (start , stop , increment)

for var1 in range(2 , 101):
     flag =0
     for var2 in (2 , var1-1):
          if(var1%var2==0):
               flag = 1
               print (var1 , " is not prime number")
               break

     if flag == 0:
          print (var1 , " is prime num")

          
          
