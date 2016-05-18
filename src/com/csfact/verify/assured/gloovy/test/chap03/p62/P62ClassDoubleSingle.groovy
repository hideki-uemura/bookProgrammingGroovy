package com.csfact.verify.assured.gloovy.test.chap03.p62

/**
 * Created by uemura on 2016/05/18.
 */
class P62ClassDoubleSingleQuote {

    def test(){
        println "aaaa\\bbbb"
        println 'aaaa\\bbbb'
        def path = /D:\012_DATA\30_repository\03_GitRepository\programmingGroovy\src\com\csfact\verify\assured\gloovy\test\chap03\p33\input.txt/
        println path

        def str  = "123"
        println "aaaa\\bbbb$str"
        println 'aaaa\\bbbb$str'
        path = /\\bbbb$str/
        println path


    }

}

def a = new P62ClassDoubleSingleQuote()
a.test()
