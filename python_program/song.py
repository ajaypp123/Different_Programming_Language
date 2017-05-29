#!/usr/bin/python
#displaying song of US
def song(z):
	if z:
		print z,"bottels of beer on the wall,",z,"bottels of beer.\nTake one down,pass it around,",z-1,"bottels of beer on the wall"
		z=z-1
		song(z)
song(99)
