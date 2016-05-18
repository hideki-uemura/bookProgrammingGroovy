package com.csfact.verify.assured.gloovy.test.chap03.p80

/**
 * Created by uemura on 2016/05/19.
 */
class ScP80CllectinHani {
    def hani(){
        for(int i : (1..3)){println i}
        (1..3).each { println it}
        (3..1).each {println it}
        ("a".."x").each {println it}

        (1..10).each{ println "aaa $it" }
        (1..< 10).each{ println "aaa $it" }

    }


}

new ScP80CllectinHani().hani()