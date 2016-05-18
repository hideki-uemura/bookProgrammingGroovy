package com.csfact.verify.assured.gloovy.test.chap03.p75

/**
 * Created by uemura on 2016/05/19.
 */
class ScP75ClosureControl {
    def test() {
        (1..10).each {println "itistat=> $it"}
        10.times {cnt -> println "count=> $cnt"}
    }

    def test2(){
        def path =/d:\temp\tmp.txt/
        def str = ""
        new BufferedInputStream(new FileInputStream(path)).withStream {
            def line = it.readLines()
            println "${line}\r\n"
        }//ここでクローズする
    }

    def test3(){
        (1..10).grep{cnt-> cnt % 2 == 0}.each {println it}
    }
    def test4(){
        (1..10).collect{it * 2}.each {println it}
    }

}
println "▼1=================================="
new ScP75ClosureControl().test()
println "▼2=================================="
new ScP75ClosureControl().test2()
println "▼3=================================="
new ScP75ClosureControl().test3()
println "▼4=================================="
new ScP75ClosureControl().test4()
