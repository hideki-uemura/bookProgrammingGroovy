package com.csfact.verify.assured.gloovy.test.chap03.p53

/**
 * Created by uemura on 2016/05/18.
 */
class P56ClassPropField {
    private def field01 = "1111";
    public def field02 = "2222";
    def field03 = "33333";
}
def a = new P56ClassPropField()


println a.field01
println a.@field01
println a.field02
println a.@field02


def fieldName = "field01"
println a."$fieldName"
println a."field01"
println a["field01"]
println a.getProperty("field01")

println "test=> ${a.field01}"


def methodName = "getField03"
println a."$methodName"()
println a."getField03"()



