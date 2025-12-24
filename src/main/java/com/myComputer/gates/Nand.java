package com.myComputer.gates;

public class Nand implements Gate{

    @Override
    public String getName() {
        return "NAND";
    }

    /**
     * 核心逻辑：与非门
     * 输入：两个电平 (boolean)
     * 输出：一个电平 (boolean)
     */
    public boolean execute(boolean a,boolean b){
        return !(a && b);
    }

    public static int toBit(boolean val){
        return val ? 1:0;
    }

}
