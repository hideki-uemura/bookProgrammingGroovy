package com.csfact.verify.assured.gloovy.test.chap03.p48;

class MapConstractor {
	def name
	int age

	def print(){
		println name
		println age
	}
}

new MapConstractor(name:"uemura",age:19).print()
