package com.csfact.verify.assured.gloovy.test.chap03.p49

/**
 * Created by uemura on 2016/05/18.
 */
class ScP49Ptn2DefaultParam {
    def test(def a= 123123){
        println a * 10
    }
}
 new ScP49Ptn2DefaultParam().test()
new ScP49Ptn2DefaultParam().test(10)

