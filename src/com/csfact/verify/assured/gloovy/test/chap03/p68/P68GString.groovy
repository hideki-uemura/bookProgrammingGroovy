package com.csfact.verify.assured.gloovy.test.chap03.p68

/**
 * Created by uemura on 2016/05/19.
 */
class ScP68GString {
    def test(){
        def str = "aaaaa"
        def str2 = "bbbb${str}cccc"
        println str2 == "bbbbaaaaacccc" ? "OK" : "NG"

        def str3 = 'bbbb${str}cccc'
        println str3 == 'bbbb${str}cccc' ? "OK" : "NG"

        def str4 = /bbb\b${str}cccc/
       println str4 == "bbb\\baaaaacccc" ? "OK" : "NG"
    }

}
new ScP68GString().test()
