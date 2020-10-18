import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    @org.junit.jupiter.api.Test
    void decimalToBinary() {
        int number = 99;
        String expected = "1100011";

        String result = Convert.DecimalToBinary(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void decimalToBinary1() {
        int number = 123456789;
        String expected = "111010110111100110100010101";

        String result = Convert.DecimalToBinary(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void BinaryToDecimal(){
       String number = "111010110111100110100010101";
        int expected = 123456789;

        int result = Convert.BinaryToDecimal(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void BinaryToDecimal1(){
        String number = "1100011";
        int expected = 99;

        int result = Convert.BinaryToDecimal(number);
        assertEquals(expected,result);
    }

}