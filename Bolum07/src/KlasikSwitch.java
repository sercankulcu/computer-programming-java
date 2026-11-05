/*
 * Klasik switch (case:) ve break: break yoksa sonraki case'e dusulur
 * (Slayt 27, Calisma Sorusu 25-27). default'un yeri serbesttir ama dusme kurali ona da uyar.
 * Beklenen cikti: Sali Car | Pzt Sali | Car Per | Yok Sali
 */
public class KlasikSwitch {

    public static void main(String[] args) {
        // Slayt 27: gun = 2, case 2'de break yok -> Car'a duser
        int gun = 2;
        System.out.println("gun = 2:");
        switch (gun) {
            case 1: System.out.println("Pzt"); break;
            case 2: System.out.println("Sali");
            case 3: System.out.println("Car"); break;
            default: System.out.println("Yok");
        }

        // Soru 25: break unutulursa
        gun = 1;
        System.out.println("gun = 1:");
        switch (gun) {
            case 1: System.out.println("Pzt");
            case 2: System.out.println("Sali"); break;
            case 3: System.out.println("Car");
            default: System.out.println("Yok");
        }

        // Soru 26: gun = 3
        gun = 3;
        System.out.println("gun = 3:");
        switch (gun) {
            case 1: System.out.println("Pzt"); break;
            case 2: System.out.println("Sali");
            case 3: System.out.println("Car");
            case 4: System.out.println("Per"); break;
            default: System.out.println("Yok");
        }

        // Soru 27: ortadaki default, gun = 7
        gun = 7;
        System.out.println("gun = 7:");
        switch (gun) {
            case 1: System.out.println("Pzt"); break;
            default: System.out.println("Yok");
            case 2: System.out.println("Sali");
        }
    }
}
