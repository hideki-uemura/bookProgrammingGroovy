package com.csfact.verify.assured.gloovy.test.chap03.p48_2

/**
 * Created by uemura on 2016/05/18.
 */

class ScP48Ptn2ClassNamedParam {
    def final paramTest2(Map prm) {
        println prm.prmNm1 + prm.prmNm2
    }
}


//***************名前付きパラメータで引数を渡す場合は呼び出され側のメソッドの引数がMapであること***************
new ScP48Ptn2ClassNamedParam().paramTest2(prmNm2:"p1",prmNm1:"p2")

