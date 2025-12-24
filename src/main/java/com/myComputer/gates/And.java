package com.myComputer.gates;

public class And implements Gate{
    private Nand nand=new Nand();
    private Not not=new Not();

    @Override
    public String getName() {
        return "And";
    }

    public boolean execute(boolean a,boolean b)
    {
        boolean nandResult= nand.execute(a,b);
        return not.execute(nandResult);
    }
}
