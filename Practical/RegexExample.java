import java.util.regex.*;
public class RegexExample {
public static void main(String args[]) {
Pattern p = Pattern.compile(".a"); //.represents single character
Matcher m = p.matcher("ma");//T
boolean b = m.matches();
//or
boolean bb = Pattern.compile("..m").matcher("aam").matches();//F 
//or
boolean b1 = Pattern.matches(".a", "sa");//T // (["a-zA-Z0-9]{8,}","keerthi22ayshu");
boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}","9150339822"); //mobile number
boolean b3 = Pattern.matches("^[a-z0-9+_.-]*+@[a-zA-Z0-9]*+\\.[a-z]{1}","keerthi123@gmail.com"); //email
boolean b4 = Pattern.matches("^[a-zA-Z0-9+_.-]{8,}","keerthi@123_."); //password
System.out.println(b + "" + bb + "" + b1 + "" + b2 + "" + b3 + "" + b4);
}
}