package com.csfact.verify.assured.gloovy.test.chap03.p79

/**
 * Created by uemura on 2016/05/19.
 */
class ScP79ClosureCallback {
     int cnt = 0
    def test(){
        def ss = new ServerSocket(8080)
        while(true){
            ss.accept {
                cnt++
                println cnt
                new BufferedOutputStream(it.getOutputStream()).write("ok")
            }
        }
    }

}

new ScP79ClosureCallback().test()