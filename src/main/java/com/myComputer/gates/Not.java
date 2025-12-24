package com.myComputer.gates;

public class Not implements Gate {
    private Nand nand=new Nand();
    @Override
    public String getName()
    {
        return "Not";
    }

    public boolean execute(boolean in)
    {
        return nand.execute(in,in);
    }
}
