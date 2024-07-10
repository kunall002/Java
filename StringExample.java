public class StringExample {
    public static void main(String[] args) {
        String s= "kunal";
        char [] ch ={'k','u','n','a','l'};
        String s1 =new String(ch);
        String s2= new String("example");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();
//return charter index
        String name="javatpoint";
        char ch1=name.charAt(9);//returns the char value at the 9th index
        System.out.println(ch1);
        System.out.println();
//convert to lower
        String s11="JAVATPOINT HELLO stRIng";
        String s11lower=s11.toLowerCase();
        System.out.println(s11lower);
        System.out.println();
//equal string check
        String s3= "kunal";
        String s4= "KUNAL";
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println();
//compaire
        String s5 ="premjit";
        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s5));
        System.out.println(s5.compareTo(s3));
        System.out.println();
//concatation
        String s6= "Rajput";
        String s66=s4.concat(s6);
        System.out.println(s66);
        System.out.println();
//substring
        System.out.println(s6.substring(0,2));
        System.out.println();


    }
}