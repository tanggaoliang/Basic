/*
 * @author:tang gao liang
 * @time:2019/3/5 19:35:41
 * @qq:1440535574
 */
package new_start_2019.data_structure;

//        位集合（BitSet）
//        位集合类实现了一组可以单独设置和清除的位或标志。
//        该类在处理一组布尔值的时候非常有用，你只需要给每个值赋值一"位"，然后对位进行适当的设置或清除，就可以对布尔值进行操作了。
//        关于该类的更多信息，请参见位集合（BitSet）。


import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if ((i % 2) == 0) bitSet1.set(i);
            if ((i % 5) != 0) bitSet2.set(i);
        }
        System.out.println("Initial pattern in bitSet1:");
        System.out.println(bitSet1);
        System.out.println("Initial pattern in bitSet2:");
        System.out.println(bitSet2);

        //交集
//        //AND bits
//        bitSet2.and(bitSet1);
//        System.out.println(bitSet2);

        //并集
      // OR bits
//        bitSet2.or(bitSet1);
//        System.out.println("\nbits2 OR bits1: ");
//        System.out.println(bitSet2);

//          集合的异或
//          a⊕b = (¬a ∧ b) ∨ (a ∧¬b)
 //         XOR bits
        bitSet2.xor(bitSet1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bitSet2);
    }
}
