//task 4
public class Combine {

	static String combineStrings(String a, String b, String c){
        String result = "";
        int lenA = a.length();
        int lenMax = lenA;
        int lenB = b.length();
        if (lenB>lenMax) lenMax = lenB;
        int lenC = c.length();
        if (lenC>lenMax) lenMax = lenC;

        for (int i=0;i<lenMax;i++){
            if(i<lenA) result += a.charAt(i);
            if(i<lenB) result += b.charAt(i);
            if(i<lenC) result += c.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) { 
        //change the parameters for different result
        System.out.println(combineStrings("aaaa","bbb","cc"));
    }
}