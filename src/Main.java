public class Main {
    public static void main(String[] args) {
        String word="Hello World";
        System.out.println(word.length());
        System.out.println(word.substring(6));
        System.out.println(word.toUpperCase());
        if(word.contains("Hello")){
            System.out.println("true");
        }else{
            System.out.println("false");

        }

    }
}