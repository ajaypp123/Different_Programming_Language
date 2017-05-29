Python 2.7.9 (default, Dec 10 2014, 12:24:55) [MSC v.1500 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> 

>>> 
>>> #string function
>>> 
>>> s = "hey , wat's up"
>>> s.capitalize()	#cpitalize first letter
"Hey , wat's up"
>>> 
>>> ################
>>> s = 'ajaypp123@gmail.com'
>>> s.endswith('.org')		#cheak end of string
False
>>> s.endswith('.com.)
	   
SyntaxError: EOL while scanning string literal
>>> s.endswith('.com')
True
>>> ##################
>>> 
>>> s= 'Gsd ,dsf'
>>> s.islower()
False
>>> #cheak lower or not
>>> ################
>>> 
>>> s.lpwer()

Traceback (most recent call last):
  File "<pyshell#19>", line 1, in <module>
    s.lpwer()
AttributeError: 'str' object has no attribute 'lpwer'
>>> 
>>> #############
>>> s.lower()
'gsd ,dsf'
>>> #make lower
>>> #####################
>>> s = 'Hellsdf ,fd'
>>> s.isupper()
False
>>> #################
>>> s.upper()
'HELLSDF ,FD'
>>> #######################
>>> 
>>> s = 'hello ..........'
>>> s.rstrip('.')  	#exclude letter from string
'hello '
>>> ###################
>>> s = 'i LOVE python'
>>> s.swapcase
<built-in method swapcase of str object at 0x027AF660>
>>> s.swapcase()	#capital and small are swap
'I love PYTHON'
>>> ###################
>>> 
>>> s.title()
'I Love Python'
>>> ###################
>>> 
>>> dir(str)
['__add__', '__class__', '__contains__', '__delattr__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__', '__getitem__', '__getnewargs__', '__getslice__', '__gt__', '__hash__', '__init__', '__le__', '__len__', '__lt__', '__mod__', '__mul__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__rmod__', '__rmul__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '_formatter_field_name_split', '_formatter_parser', 'capitalize', 'center', 'count', 'decode', 'encode', 'endswith', 'expandtabs', 'find', 'format', 'index', 'isalnum', 'isalpha', 'isdigit', 'islower', 'isspace', 'istitle', 'isupper', 'join', 'ljust', 'lower', 'lstrip', 'partition', 'replace', 'rfind', 'rindex', 'rjust', 'rpartition', 'rsplit', 'rstrip', 'split', 'splitlines', 'startswith', 'strip', 'swapcase', 'title', 'translate', 'upper', 'zfill']
>>> 
