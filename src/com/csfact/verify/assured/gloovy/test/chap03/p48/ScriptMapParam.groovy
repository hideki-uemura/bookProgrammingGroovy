package com.csfact.verify.assured.gloovy.test.chap03.p48

class MapParam{

	void paramTest(param){
		println param.age
		println param.name



	}
}

new ScriptMapParam().paramTest(age:12,name:"uemura")

