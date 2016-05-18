package com.csfact.verify.assured.gloovy.test.chap03.p62

/**
 * Created by uemura on 2016/05/19.
 */
class ScP62isBoolean {
    def a = 0
    def b = 1

    def asBoolean(){
        a == b
    }

}


def x = new ScP62isBoolean(a:1,b:1);
println x ? "TRUE" : "FALSE"
def y = new ScP62isBoolean(a:2,b:2);
println y ? "TRUE" : "FALSE"
