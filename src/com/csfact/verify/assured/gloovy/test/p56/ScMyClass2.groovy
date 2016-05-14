package com.csfact.verify.assured.gloovy.test.p56

class MyClass2 {

	public x = 2

}



assert new MyClass2().x == 2
assert new MyClass2()."x" == 2
assert new MyClass2().'x' == 2
println "OK"



class FildNameTest{

	String getPtn01(){
		"x"
	}
	String getPtn02(){
		'x'
	}
}

//文字列をメソッドに出来る。それはクラス跨ぎでも出来る。
println (new MyClass2().(new FildNameTest().getPtn01()))

