package com.csfact.verify.assured.gloovy.test.chap03.p53

class MyClass {

	def name
	String address
	private int prvAge
	public int pubAge

	void print(){
		println name
		println address
		println prvAge
		println pubAge
	}

	void kizonJavaAccess(){

		Date d  = new Date();
		println d.time
	}
}


def my = new MyClass()
my.address = "aaaa"
my.setName("3123213")
my.prvAge = 123
my.pubAge = 3123123

my.print()
my.kizonJavaAccess()


