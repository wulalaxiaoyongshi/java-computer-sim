package com.myComputer.gates;

public class Xor implements Gate{
    private Or or = new Or();
    private And and = new And();
    private Not not = new Not();
    @Override
    public String getName() {
        return "Xor gate";
    }
    public boolean execute(boolean a,boolean b)
    {
        boolean aOrB=or.execute(a,b);
        boolean aAndB= and.execute(a,b);
        boolean notAnd=not.execute(aAndB);
        return and.execute(aOrB,notAnd);
    }
}
