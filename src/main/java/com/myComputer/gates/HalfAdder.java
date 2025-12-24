package com.myComputer.gates;

public class HalfAdder {
    private Xor xor=new Xor();
    private And and=new And();

    public boolean sum; //本位
    public boolean carry;//进位

    public String getName() {
        return "HalfAdder";
    }

    /**
     * 执行加法
     * 结果存储在 sum 和 carry 字段中
     */
    public void execute(boolean a, boolean b) {
        // Sum = A XOR B
        this.sum = xor.execute(a, b);

        // Carry = A AND B
        this.carry = and.execute(a, b);
    }
}
