public class ThrowExample2 {
    public static void main(String[] args) {
        try {
            throw new java.lang.Exception("Here's my Exception");
        } catch (java.lang.Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():" + e.getMessage());
            System.out.println("e.toString():" + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}

//Analisis:
//Pada program diatas, terdapat sebuah class ThrowExample2 yang memiliki method main. Di dalam method main, terdapat blok try-catch yang mencoba untuk melemparkan sebuah Exception dengan pesan "Here's my Exception". Ketika Exception tersebut dilemparkan, blok catch akan menangkapnya dan mencetak beberapa informasi tentang Exception tersebut, termasuk pesan, representasi string, dan jejak tumpukan (stack trace).