package com.csfact.verify.assured.gloovy.test.chap03.test

def map = [:]

def str = "D:\\012_DATA\\30_repository\\03_GitRepository\\programmingGroovy\\src\\com\\csfact\\verify\\assured\\gloovy\\test\\input.txt"
new File(str).eachLine {
    it.split(/\s+/).each {
        map[it] = map[it] == null ? 1 : map[it] + 1;
    }

    map.entrySet().sort{it.value}.each{
        println "${it.value} : ${it.key}"
    }
}