package com.csfact.verify.assured.gloovy.test.chap03.p52

/**
 * Created by uemura on 2016/05/18.
 */
class ScP52ClassGroovyBean {
    def ptn01setAri
    String pnt02setAri
    private def ptn03setNashi1
    private String ptn04setNashi2
    protected def ptn05setNashi1
    protected String ptn05setNashi2
    public def ptn06setNashi1
    public String ptn06setNashi2
    public static def ptn07Nashi

}


def a = new ScP52ClassGroovyBean()
a.setPnt02setAri("aaaa")
println a.getPnt02setAri()
a.setPtn01setAri("xxxxx")
println a.getPtn01setAri()
