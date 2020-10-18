import java.util.Stack;

public class Convert {
    public static String DecimalToBinary(int number){
        String result = "";
        Stack<Integer> myS = new Stack<>();
        while (number > 0){
            myS.push(number % 2);
            number = number / 2;
        }
        while (!myS.empty()){
            result += myS.pop();
        }
        return result;
    }

    public static int BinaryToDecimal(String num){

        int result = 0;
        Stack<Integer> myS = new Stack<>();
        String[] numB = num.split("");
        for (int i = 0; i < numB.length; i++) {
            myS.push(Integer.parseInt(numB[i]));
        }

        for (int i = 0; i < numB.length; i++) {
            result += myS.pop()*Math.pow(2,i);
        }
        return result;
    }

}
