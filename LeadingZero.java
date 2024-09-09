public class LeadingZero {
    public static void main(String[] args)
    {
 
        String str = "00000123569";
        String newstr = "";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x != '0') {
                index = i;
                break;
            }
        }
        newstr = str.substring(index, str.length());
        // Printing leading zeros inside string
        System.out.println(newstr);
    }

}
