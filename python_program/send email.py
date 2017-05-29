# Send email by python


import smtplib


#create server object
#smtplib.SMTP('server address',port number)

serobj =  smtplib.SMTP('smtp.gmail.com',587)

serobj.starttls()    #estabilish connection

serobj.login('mymail@gmail.com','password')    #serobj.login('addr','password')

serobj.sendmail( 'sender addr' , 'reciver addr' , 'massage' )



