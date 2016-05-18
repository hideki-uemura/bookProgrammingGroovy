package com.csfact.verify.assured.gloovy.test.chap03.p71

import java.util.function.BiConsumer

/**
 * Created by uemura on 2016/05/19.
 */
class ScP71ClosureTest01 {
    def test(){
        Closure closure = {param-> println "Hello ${param}"}
        closure.call("world")
        Closure closure2 = {param1,param2 -> println "Hello ${param1}  ${param2}"}
        closure2.call("world", "aaa")



        def params = [1,2,3]
        params.forEach({println "Count $it"})

        def map = [a:"1",b:"2",c:"3"]
        map.each { k,v ->  println "$k => $v" }
        map.forEach { k,v ->  println "$k => $v"}
        map.each { closure2}

        BiConsumer closure3 = { param1, param2 -> println "Hello ${param1}  ${param2}"}
        map.forEach closure3

    }
}

def a = new ScP71ClosureTest01()
a.test()
