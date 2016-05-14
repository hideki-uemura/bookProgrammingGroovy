class MultiMethod{

	def hello(String s){
		println "hello(string) -> $s"
	}

	def hello(int s){
		println "hello(int) -> $s"
	}
}

new MultiMethod(). hello("3")
new MultiMethod().hello(3)

