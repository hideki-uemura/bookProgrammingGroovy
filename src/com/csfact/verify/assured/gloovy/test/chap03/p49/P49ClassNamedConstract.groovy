package com.csfact.verify.assured.gloovy.test.chap03.p49

/**
 * Created by uemura on 2016/05/18.
 */
class ScP49ClassNamedConstract {
    def prm1
    def prm2

    def test(){
        println prm1 + prm2
    }

}


new ScP49ClassNamedConstract(prm1: "aaaa",prm2: "ffff").test()