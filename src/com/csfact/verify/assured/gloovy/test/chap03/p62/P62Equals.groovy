package com.csfact.verify.assured.gloovy.test.chap03.p62

/**
 * Created by uemura on 2016/05/19.
 */
class ScP62Equals {
    def equalsTest(){
        println 1 ? "1はTrueになる" : "NG"
        println 0 ? "NG" : "0がFalseとなる"
        println "  " ? "空文字でないときはTrue" : "NG"
        println "" ? "NG" : "空文字はFalse"
        println ([] ? "NG" : "からListはFalse")
        println ([1] ? "サイズ０以外にリストはTRUE" : "NG")
    }
}

def a = new ScP62Equals()
a.equalsTest()