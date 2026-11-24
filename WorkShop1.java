void main() {

    System.out.println("Regjistrimi ne Cacttus");

    System.out.print("Emri: ");
    String emri = IO.readln().trim();

    System.out.print("Mbiemri: ");
    String mbiemri = IO.readln().trim();

    System.out.print("Viti i lindjes: ");
    int viti = Integer.parseInt(IO.readln());

    int mosha = 2026 - viti;

    if (mosha < 16 || mosha > 80) {
        System.out.println("Viti i lindjes nuk eshte i sakte!");
    } else {

        System.out.println("1. Zhvillues i aplikacioneve   1200 €");
        System.out.println("2. Siguria kibernetike        1100 €");
        System.out.println("3. Dizajn grafik               900 €");

        System.out.print("Programi (1-3): ");
        int programi = Integer.parseInt(IO.readln());
        var tarifa = switch (programi) {
            case 1 -> 1200;
            case 2 -> 1100;
            case 3 -> 900;
            default -> -1;
        };

        if (tarifa == -1) {
            System.out.println("Program i panjohur!");
        } else {

            System.out.print("Nota mesatare (6-10): ");
            double nota = Double.parseDouble(IO.readln());

            if (nota < 6 || nota > 10) {
                System.out.println("Nota mesatare nuk eshte e sakte!");
            } else {

                int bursa = 0;

                if (mosha < 25) {
                    if (nota >= 9 && nota <= 10) {
                        bursa = 50;
                    } else if (nota >= 8 && nota < 9) {
                        bursa = 20;
                    }
                }

                String inicialet = emri.toUpperCase().charAt(0)
                        + "." + mbiemri.toUpperCase().charAt(0) + ".";

                double pagesa = tarifa * (1 - bursa / 100.0);

                String statusi = bursa > 0 ? "Me burse" : "Pa burse";

                System.out.println("Studenti: " + inicialet
                        + ", " + mosha + " vjeç");

                System.out.printf("%s: %.2f €%n", statusi, pagesa);
            }
        }
    }
}





