package CalculadoraBases.logic;


public class BaseConverter {
    public static String convert(String number, int fromBase, int toBase) throws NumberFormatException {
        if (fromBase < 2 || fromBase > 36 || toBase < 2 || toBase > 36) {
            throw new NumberFormatException("Las bases deben estar entre 2 y 36");
        }
        
        
        for (char c : number.toCharArray()) {
            if (Character.digit(c, fromBase) == -1) {
                throw new NumberFormatException("Dígito no válido para la base " + fromBase);
            }
        }
        
        long decimal = Long.parseLong(number, fromBase);
        return Long.toString(decimal, toBase).toUpperCase();
    }
}