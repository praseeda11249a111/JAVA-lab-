public class StringDemo {
    public static void main(String[] args){
        String str="Java Programming";
        System.out.println("original string:"+str);
        System.out.println("length:"+str.length());
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("Lowercase:"+str.toLowerCase());
        System.out.println("substring:"+str.substring(5,16));
        System.out.println("Contains 'Java':"+str.contains("Java"));
    }
}
