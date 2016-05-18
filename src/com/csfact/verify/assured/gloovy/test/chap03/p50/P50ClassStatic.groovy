package com.csfact.verify.assured.gloovy.test.chap03.p50

/**
 * Created by uemura on 2016/05/18.
 */
class ScP50ClassStatic {
    def str = "123"
    static str2 = "456"
    def static test(){
        //thisがつかえるがそれはクラスインスタンスを指す。
        this.test2()
    }

    def static test2(){
        this.str2
    }

}


println(ScP50ClassStatic.test())