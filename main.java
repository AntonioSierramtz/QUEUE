package queque;



public class main {
    public static void main(String[] args) {
        Queue cola = new Queue(10); 
        cola.enqueue('A');
        cola.enqueue('B');
        cola.enqueue('C');

        
        System.out.println("Elemento eliminado de la cola: " + cola.dequeue());

        
        String originalString = "Hola";
        String reversedString = Queue.invertirCadena(originalString);
        System.out.println("String Original: " + originalString);
        System.out.println("String Invertida: " + reversedString);

        String palindromeString = "anitalavalatina";
        boolean isPalindrome = Queue.esPalindromo(palindromeString);
        System.out.println("Es palíndromo: " + isPalindrome);
    }
}

