public class Main {
        public static String cifrar(String texto, int desplazamiento) {
            StringBuilder resultado = new StringBuilder();
    
            // Iteramos sobre cada carácter del texto
            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
    
                // Si es una letra mayúscula
                if (Character.isUpperCase(c)) {
                    char cifrado = (char) (((c - 'A' + desplazamiento) % 26) + 'A');
                    resultado.append(cifrado);
                }
                // Si es una letra minúscula
                else if (Character.isLowerCase(c)) {
                    char cifrado = (char) (((c - 'a' + desplazamiento) % 26) + 'a');
                    resultado.append(cifrado);
                }
                // Si no es una letra, lo dejamos igual
                else {
                    resultado.append(c);
                }
            }
    
            return resultado.toString();
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Introduce el texto a cifrar: ");
            String texto = scanner.nextLine();
    
            System.out.println("Introduce el número de desplazamiento: ");
            int desplazamiento = scanner.nextInt();
    
            // Llamada a la función de cifrado
            String textoCifrado = cifrar(texto, desplazamiento);
    
            System.out.println("Texto cifrado: " + textoCifrado);
        }
    }
