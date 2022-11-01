public class BinaryTest{
    public static void main(String[] args){
        int n=-16;
        BinaryInterface b1=new OneComplement();
        BinaryInterface b2=new TwoComplement();
        BinaryInterface b3=new SignedMagnitude();
        b1.toBinary(n);
        b2.toBinary(n);
        b3.toBinary(n);
    }
}