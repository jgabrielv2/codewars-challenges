public class VowelCount {

    public static int getCount(String str) {
        char[] letras = str.toLowerCase().toCharArray();
        int contador = 0;
        for (char letra : letras) {
            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Conta o número de vogais em uma string.
     * Substitui todos os caracteres que não são vogais por uma string vazia e retorna o
     * comprimento da string resultante
     *
     * @param str A string de entrada
     * @return O número de vogais da string de entrada
     */
    public static int newGetCount(String str){
        // Substitui todos os caracteres que não [^aeiou] são vogais (case-inensitive (?i)) por uma string vazia
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
