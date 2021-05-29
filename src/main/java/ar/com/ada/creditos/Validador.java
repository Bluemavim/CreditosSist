package ar.com.ada.creditos;

public class Validador {

    String ANSI_CYAN;
    String ANSI_PURPLE;
    
    public static int ingresoOpcionMenu() {

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            String ANSI_PURPLE;
            System.out.println(ANSI_PURPLE + "𝐼𝑛𝑔𝑟𝑒𝑠𝑒 𝑢𝑛𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 ---->");
            System.out.println(ANSI_CYAN
                    + "═════════════════════════════════════════════════════════════════════════════════════════");
            while (!sc.hasNextInt()) {
                System.out.println(ANSI_PURPLE + "𝐿𝑎 𝑜𝑝𝑐𝑖𝑜́𝑛 𝑖𝑛𝑔𝑟𝑒𝑠𝑎𝑑𝑎 𝑛𝑜 𝑒𝑠 𝑢𝑛 𝑛𝑢́𝑚𝑒𝑟𝑜.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
        } while (opcion < 0 || opcion > 4);

        return opcion;
    }
}
