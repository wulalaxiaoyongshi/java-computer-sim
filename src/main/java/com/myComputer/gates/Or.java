package com.myComputer.gates;

public class Or implements Gate{

    private Nand nand=new Nand();
    private Not not=new Not();

    @Override
    public String getName() {
        return "Or gate";
    }

    public boolean execute(boolean a,boolean b)
    {
        boolean notA=not.execute(a);
        boolean notB=not.execute(b);
        // 摩根定律：非A 和 非B 的 NAND 结果，就是 A OR B
        return nand.execute(notA,notB);
    }

}
