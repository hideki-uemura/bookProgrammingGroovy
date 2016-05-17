package com.csfact.verify.assured.gloovy.test.chap03.p33

/**
 * Created by uemura on 2016/05/18.
 */
class ScP33Class {
    def test() {
        def map = [:].withDefault { 0 }
        def path = /D:\012_DATA\30_repository\03_GitRepository\programmingGroovy\src\com\csfact\verify\assured\gloovy\test\chap03\p33\input.txt/

        new File(path).eachLine { line ->
            line.split(/\s+/).each {word->
                map[word]++
            }
        }

        map.entrySet().sort { it.value }.each {
            println("${it.key} : ${it.value}")
        }
    }
}
new ScP33Class().test()
