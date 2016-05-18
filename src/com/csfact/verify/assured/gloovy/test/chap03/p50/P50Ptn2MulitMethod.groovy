package com.csfact.verify.assured.gloovy.test.chap03.p50

/**
 * Created by uemura on 2016/05/18.
 */
class ScP50Ptn2MultiMethod {
    def testM(String x){
        println("str=>$x")
    }
    def testM(int x){
        println("int=>$x")
    }

}

new ScP50Ptn2MultiMethod().testM(1)
new ScP50Ptn2MultiMethod().testM("1")
