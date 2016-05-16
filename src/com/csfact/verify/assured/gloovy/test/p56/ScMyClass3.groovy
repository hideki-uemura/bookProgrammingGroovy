package com.csfact.verify.assured.gloovy.test.p56

class MyClass3{
    def name = 'nametest'
    def yobidashi01(){
        println 'yobidashi01'
    }

    def yobidashi02(){
       println "yobidashi02"
    }


    def yobidashi03(){
        println "yobidashi03"
    }
    String yobidashi01Call(){
        "yobidashi01"
    }
}
def a = new MyClass3()
println(a["name"])
a."yobidashi01"()

