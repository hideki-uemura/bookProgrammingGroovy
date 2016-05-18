package com.csfact.verify.assured.gloovy.test.chap03.p74

/**
 * Created by uemura on 2016/05/19.
 */
class ScP74ClosureContext {
    private int param1
    private String param2

    def method(add) {

        def clos = { nm ->
            param1 = 123
            param1 = nm + param1
        }
        new Test().xyz(add, clos)

        new Test().xyz(add)
                { nm ->
                    param1 = 123
                    param1 = nm + param1
                }

        println param1
    }


}

class Test {
    def xyz(int add, Closure c) {
        c.call(add);
    }

}

def a = new ScP74ClosureContext(param1: 456, param2: "bbbb").method(111)
