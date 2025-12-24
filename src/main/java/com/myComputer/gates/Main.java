import com.myComputer.gates.*;

public class Main {
    public static void main(String[] args) {
        // --- 验证 XOR ---
        Xor xor = new Xor();
        System.out.println("TESTING XOR (期望: 0, 1, 1, 0)");
        System.out.println("0, 0 -> " + Nand.toBit(xor.execute(false, false)));
        System.out.println("0, 1 -> " + Nand.toBit(xor.execute(false, true)));
        System.out.println("1, 0 -> " + Nand.toBit(xor.execute(true, false)));
        System.out.println("1, 1 -> " + Nand.toBit(xor.execute(true, true)));
        System.out.println("-----------------------------");

        // --- 验证 Half Adder (半加器) ---
        HalfAdder adder = new HalfAdder();
        System.out.println("TESTING HALF ADDER (二进制加法)");
        System.out.println("A + B = Carry Sum  (数值)");
        System.out.println("-------------------------");

        // 0 + 0 = 00 (0)
        testAdder(adder, false, false);

        // 0 + 1 = 01 (1)
        testAdder(adder, false, true);

        // 1 + 0 = 01 (1)
        testAdder(adder, true, false);

        // 1 + 1 = 10 (2) -> 这里的 Carry 应该是 1, Sum 应该是 0
        testAdder(adder, true, true);
    }

    private static void testAdder(HalfAdder adder, boolean a, boolean b) {
        adder.execute(a, b);
        System.out.printf("%d + %d =   %d    %d\n",
                Nand.toBit(a),
                Nand.toBit(b),
                Nand.toBit(adder.carry),
                Nand.toBit(adder.sum));
    }
}