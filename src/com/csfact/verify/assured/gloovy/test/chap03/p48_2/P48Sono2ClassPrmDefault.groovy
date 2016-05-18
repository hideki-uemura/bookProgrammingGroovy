package com.csfact.verify.assured.gloovy.test.chap03.p48_2

/**
 * Created by uemura on 2016/05/18.
 */
class ScP48Sono2Class {
    def test(prmDef = 2){
        prmDef
    }

}

println new ScP48Sono2Class().test()
println new ScP48Sono2Class().test(3)
