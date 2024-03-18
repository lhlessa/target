public class Reverse {

    static String reverseText(String reverse){
        StringBuilder reverseText = new StringBuilder();
        for(int i = reverse.length() - 1; i>= 0; i--){
            reverseText.append(reverse.charAt(i));
        }
        
        String stringInvertida = reverseText.toString();
        return stringInvertida;
        
    }
}
