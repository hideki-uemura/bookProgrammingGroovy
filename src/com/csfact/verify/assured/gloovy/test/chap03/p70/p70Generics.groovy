package com.csfact.verify.assured.gloovy.test.chap03.p70

/**
 * Created by uemura on 2016/05/19.
 */
class ScP70Generics {
    def test(){
        List<String> aaa = new ArrayList<String>();
        aaa = ["aaaa","bbbb"]
        println aaa
    }
}

def a = new ScP70Generics();
a.test()
