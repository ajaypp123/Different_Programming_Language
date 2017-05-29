Python 2.7.9 (default, Dec 10 2014, 12:24:55) [MSC v.1500 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> 

>>> import calendar
>>> 
>>> #####################################################
>>> 
>>> dir(calendar)
['Calendar', 'EPOCH', 'FRIDAY', 'February', 'HTMLCalendar', 'IllegalMonthError', 'IllegalWeekdayError', 'January', 'LocaleHTMLCalendar', 'LocaleTextCalendar', 'MONDAY', 'SATURDAY', 'SUNDAY', 'THURSDAY', 'TUESDAY', 'TextCalendar', 'TimeEncoding', 'WEDNESDAY', '_EPOCH_ORD', '__all__', '__builtins__', '__doc__', '__file__', '__name__', '__package__', '_colwidth', '_locale', '_localized_day', '_localized_month', '_spacing', 'c', 'calendar', 'datetime', 'day_abbr', 'day_name', 'error', 'firstweekday', 'format', 'formatstring', 'isleap', 'leapdays', 'main', 'mdays', 'month', 'month_abbr', 'month_name', 'monthcalendar', 'monthrange', 'prcal', 'prmonth', 'prweek', 'setfirstweekday', 'sys', 'timegm', 'week', 'weekday', 'weekheader']
>>> ###################################################
>>> 
>>> print calendar.month(1995,7)
     July 1995
Mo Tu We Th Fr Sa Su
                1  2
 3  4  5  6  7  8  9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28 29 30
31

>>> 
>>> #####################################################
>>> 
>>> calendar.calendar(2012)
'                                  2012\n\n      January                   February                   March\nMo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su\n                   1             1  2  3  4  5                1  2  3  4\n 2  3  4  5  6  7  8       6  7  8  9 10 11 12       5  6  7  8  9 10 11\n 9 10 11 12 13 14 15      13 14 15 16 17 18 19      12 13 14 15 16 17 18\n16 17 18 19 20 21 22      20 21 22 23 24 25 26      19 20 21 22 23 24 25\n23 24 25 26 27 28 29      27 28 29                  26 27 28 29 30 31\n30 31\n\n       April                      May                       June\nMo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su\n                   1          1  2  3  4  5  6                   1  2  3\n 2  3  4  5  6  7  8       7  8  9 10 11 12 13       4  5  6  7  8  9 10\n 9 10 11 12 13 14 15      14 15 16 17 18 19 20      11 12 13 14 15 16 17\n16 17 18 19 20 21 22      21 22 23 24 25 26 27      18 19 20 21 22 23 24\n23 24 25 26 27 28 29      28 29 30 31               25 26 27 28 29 30\n30\n\n        July                     August                  September\nMo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su\n                   1             1  2  3  4  5                      1  2\n 2  3  4  5  6  7  8       6  7  8  9 10 11 12       3  4  5  6  7  8  9\n 9 10 11 12 13 14 15      13 14 15 16 17 18 19      10 11 12 13 14 15 16\n16 17 18 19 20 21 22      20 21 22 23 24 25 26      17 18 19 20 21 22 23\n23 24 25 26 27 28 29      27 28 29 30 31            24 25 26 27 28 29 30\n30 31\n\n      October                   November                  December\nMo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su      Mo Tu We Th Fr Sa Su\n 1  2  3  4  5  6  7                1  2  3  4                      1  2\n 8  9 10 11 12 13 14       5  6  7  8  9 10 11       3  4  5  6  7  8  9\n15 16 17 18 19 20 21      12 13 14 15 16 17 18      10 11 12 13 14 15 16\n22 23 24 25 26 27 28      19 20 21 22 23 24 25      17 18 19 20 21 22 23\n29 30 31                  26 27 28 29 30            24 25 26 27 28 29 30\n                                                    31\n'
>>> calendar.calendar(2012,2,1,11)
'                                       2012\n\n      January                        February                        March\nMo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su\n                   1                  1  2  3  4  5                     1  2  3  4\n 2  3  4  5  6  7  8            6  7  8  9 10 11 12            5  6  7  8  9 10 11\n 9 10 11 12 13 14 15           13 14 15 16 17 18 19           12 13 14 15 16 17 18\n16 17 18 19 20 21 22           20 21 22 23 24 25 26           19 20 21 22 23 24 25\n23 24 25 26 27 28 29           27 28 29                       26 27 28 29 30 31\n30 31\n\n       April                           May                            June\nMo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su\n                   1               1  2  3  4  5  6                        1  2  3\n 2  3  4  5  6  7  8            7  8  9 10 11 12 13            4  5  6  7  8  9 10\n 9 10 11 12 13 14 15           14 15 16 17 18 19 20           11 12 13 14 15 16 17\n16 17 18 19 20 21 22           21 22 23 24 25 26 27           18 19 20 21 22 23 24\n23 24 25 26 27 28 29           28 29 30 31                    25 26 27 28 29 30\n30\n\n        July                          August                       September\nMo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su\n                   1                  1  2  3  4  5                           1  2\n 2  3  4  5  6  7  8            6  7  8  9 10 11 12            3  4  5  6  7  8  9\n 9 10 11 12 13 14 15           13 14 15 16 17 18 19           10 11 12 13 14 15 16\n16 17 18 19 20 21 22           20 21 22 23 24 25 26           17 18 19 20 21 22 23\n23 24 25 26 27 28 29           27 28 29 30 31                 24 25 26 27 28 29 30\n30 31\n\n      October                        November                       December\nMo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su           Mo Tu We Th Fr Sa Su\n 1  2  3  4  5  6  7                     1  2  3  4                           1  2\n 8  9 10 11 12 13 14            5  6  7  8  9 10 11            3  4  5  6  7  8  9\n15 16 17 18 19 20 21           12 13 14 15 16 17 18           10 11 12 13 14 15 16\n22 23 24 25 26 27 28           19 20 21 22 23 24 25           17 18 19 20 21 22 23\n29 30 31                       26 27 28 29 30                 24 25 26 27 28 29 30\n                                                              31\n'
>>> ###########################################
>>> calendar.isleap(2000)
True
>>> #######################################
>>> 
>>> help(calendar)
Help on module calendar:

NAME
    calendar - Calendar printing functions

FILE
    c:\python27\lib\calendar.py

DESCRIPTION
    Note when comparing these calendars to the ones printed by cal(1): By
    default, these calendars have Monday as the first day of the week, and
    Sunday as the last (the European convention). Use setfirstweekday() to
    set the first day of the week (0=Monday, 6=Sunday).

CLASSES
    exceptions.ValueError(exceptions.StandardError)
        IllegalMonthError
        IllegalWeekdayError
    
    class IllegalMonthError(exceptions.ValueError)
     |  # Exceptions raised for bad input
     |  
     |  Method resolution order:
     |      IllegalMonthError
     |      exceptions.ValueError
     |      exceptions.StandardError
     |      exceptions.Exception
     |      exceptions.BaseException
     |      __builtin__.object
     |  
     |  Methods defined here:
     |  
     |  __init__(self, month)
     |  
     |  __str__(self)
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __weakref__
     |      list of weak references to the object (if defined)
     |  
     |  ----------------------------------------------------------------------
     |  Data and other attributes inherited from exceptions.ValueError:
     |  
     |  __new__ = <built-in method __new__ of type object>
     |      T.__new__(S, ...) -> a new object with type S, a subtype of T
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from exceptions.BaseException:
     |  
     |  __delattr__(...)
     |      x.__delattr__('name') <==> del x.name
     |  
     |  __getattribute__(...)
     |      x.__getattribute__('name') <==> x.name
     |  
     |  __getitem__(...)
     |      x.__getitem__(y) <==> x[y]
     |  
     |  __getslice__(...)
     |      x.__getslice__(i, j) <==> x[i:j]
     |      
     |      Use of negative indices is not supported.
     |  
     |  __reduce__(...)
     |  
     |  __repr__(...)
     |      x.__repr__() <==> repr(x)
     |  
     |  __setattr__(...)
     |      x.__setattr__('name', value) <==> x.name = value
     |  
     |  __setstate__(...)
     |  
     |  __unicode__(...)
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors inherited from exceptions.BaseException:
     |  
     |  __dict__
     |  
     |  args
     |  
     |  message
    
    class IllegalWeekdayError(exceptions.ValueError)
     |  Method resolution order:
     |      IllegalWeekdayError
     |      exceptions.ValueError
     |      exceptions.StandardError
     |      exceptions.Exception
     |      exceptions.BaseException
     |      __builtin__.object
     |  
     |  Methods defined here:
     |  
     |  __init__(self, weekday)
     |  
     |  __str__(self)
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors defined here:
     |  
     |  __weakref__
     |      list of weak references to the object (if defined)
     |  
     |  ----------------------------------------------------------------------
     |  Data and other attributes inherited from exceptions.ValueError:
     |  
     |  __new__ = <built-in method __new__ of type object>
     |      T.__new__(S, ...) -> a new object with type S, a subtype of T
     |  
     |  ----------------------------------------------------------------------
     |  Methods inherited from exceptions.BaseException:
     |  
     |  __delattr__(...)
     |      x.__delattr__('name') <==> del x.name
     |  
     |  __getattribute__(...)
     |      x.__getattribute__('name') <==> x.name
     |  
     |  __getitem__(...)
     |      x.__getitem__(y) <==> x[y]
     |  
     |  __getslice__(...)
     |      x.__getslice__(i, j) <==> x[i:j]
     |      
     |      Use of negative indices is not supported.
     |  
     |  __reduce__(...)
     |  
     |  __repr__(...)
     |      x.__repr__() <==> repr(x)
     |  
     |  __setattr__(...)
     |      x.__setattr__('name', value) <==> x.name = value
     |  
     |  __setstate__(...)
     |  
     |  __unicode__(...)
     |  
     |  ----------------------------------------------------------------------
     |  Data descriptors inherited from exceptions.BaseException:
     |  
     |  __dict__
     |  
     |  args
     |  
     |  message

FUNCTIONS
    calendar = formatyear(self, theyear, w=2, l=1, c=6, m=3) method of TextCalendar instance
        Returns a year's calendar as a multi-line string.
    
    firstweekday = getfirstweekday(self) method of TextCalendar instance
    
    isleap(year)
        Return True for leap years, False for non-leap years.
    
    leapdays(y1, y2)
        Return number of leap years in range [y1, y2).
        Assume y1 <= y2.
    
    month = formatmonth(self, theyear, themonth, w=0, l=0) method of TextCalendar instance
        Return a month's calendar string (multi-line).
    
    monthcalendar = monthdayscalendar(self, year, month) method of TextCalendar instance
        Return a matrix representing a month's calendar.
        Each row represents a week; days outside this month are zero.
    
    monthrange(year, month)
        Return weekday (0-6 ~ Mon-Sun) and number of days (28-31) for
        year, month.
    
    prcal = pryear(self, theyear, w=0, l=0, c=6, m=3) method of TextCalendar instance
        Print a year's calendar.
    
    prmonth(self, theyear, themonth, w=0, l=0) method of TextCalendar instance
        Print a month's calendar.
    
    setfirstweekday(firstweekday)
    
    timegm(tuple)
        Unrelated but handy function to calculate Unix timestamp from GMT.
    
    weekday(year, month, day)
        Return weekday (0-6 ~ Mon-Sun) for year (1970-...), month (1-12),
        day (1-31).

DATA
    __all__ = ['IllegalMonthError', 'IllegalWeekdayError', 'setfirstweekda...
    day_abbr = <calendar._localized_day instance>
    day_name = <calendar._localized_day instance>
    month_abbr = <calendar._localized_month instance>
    month_name = <calendar._localized_month instance>


>>> 
