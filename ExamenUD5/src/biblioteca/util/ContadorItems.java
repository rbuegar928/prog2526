package biblioteca.util;

public class ContadorItems {
    private static int totalItems = 0;

    public static int getTotalItems() {
        return totalItems;
    }
    
    public static void incrementar() {
        totalItems = totalItems + 1;
    }

}
