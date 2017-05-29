######################################################

#class and self

######################################################

# Every method in class has first parameter self
#self is replaced by object name

#########################################################
#create class
##################################################
class biodata :
     def create(self , name):
          self.name = name
          print name
          
     def get(self):
          return self.name
     
     def dis(self):
          print "Hello %s " % self.name
          print "Hello " + self.name

###########################################################

first = biodata() #create object , here self set as first
sec = biodata() #create object , here self set as sec

first.create('ajay')  #here first = self , name = ajay
sec.create('paratmandali' )

first.dis()
sec.dis()

print '\n\n' + first.name

raw_input()

############################################################






