package com.csfact.verify.assured.gloovy.test.chap03.p7273

/**
 * Created by uemura on 2016/05/19.
 */
class ScP7273ClosureNoParam {
    def test(){

        def b = {println "hello no param $it"}//仮引数なし
        b.call("aaaaa")

        try{
            def a = { -> println "hello no param"}//仮引数なし
            a.call("aaa") //パラメータ渡すとエラーになる
        }catch(Exception e){
            println "エラーOK"
        }
    }


    def x(def bln,Closure closure){
        closure.call("value => $bln")
    }

    def paramNashi(Closure consure){
        consure.call()
    }

}

//new ScP7273ClosureNoParam().test()
new ScP7273ClosureNoParam().x(true,{println "aaaaaaa > $it"})
new ScP7273ClosureNoParam()."paramNashi" {println "aaaaaaa"}



