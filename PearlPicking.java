public class PearlPicking {
    public static void main(String[] args) {

        int case1 = 0, case2 = 0, case3 = 0, case4 = 0;
        int rounds = 100;

        for (int i = 0; i < rounds; i++) {

            // ---------- Case 1: [W] vs [WWBBB] ----------
            int bowl1 = (int) (Math.random() * 2) + 1; // randomly select a bowl (1 or 2)

            if (bowl1 == 1) {
                // [W] → always survive
                case1++;
            } else {
                // [WWBBB]
                int[] b1 = { 1, 1, 0, 0, 0 };
                shuffle(b1);
                if (b1[0] == 1)
                    case1++;
            }

            // ---------- Case 2: [WW] vs [WBBB] ----------
            int bowl2 = (int) (Math.random() * 2) + 1;

            if (bowl2 == 1) {
                // [WW] → always survive
                case2++;
            } else {
                // [WBBB]
                int[] b1 = { 1, 0, 0, 0 };
                shuffle(b1);
                if (b1[0] == 1)
                    case2++;
            }

            // ---------- Case 3: [WWW] vs [BBB] ----------
            int bowl3 = (int) (Math.random() * 2) + 1;

            if (bowl3 == 1) {
                // [WWW] → always survive
                case3++;
            }

            // ---------- Case 4: [WWWBB] vs [B] ----------
            int bowl4 = (int) (Math.random() * 2) + 1;

            if (bowl4 == 1) {
                // [WWWBB]
                int[] b1 = { 1, 1, 1, 0, 0 };
                shuffle(b1);
                if (b1[0] == 1)
                    case4++;
            }
            // else: [B] → always die
        }

        System.out.println("[W] & [WWBBB], and survivals: " + case1 + " / 100");
        System.out.println("[WW] & [WBBB], and survivals: " + case2 + " / 100");
        System.out.println("[WWW] & [BBB], and survivals: " + case3 + " / 100");
        System.out.println("[WWWBB] & [B], and survivals: " + case4 + " / 100");

    }

    public static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = array[index]; // swaq process
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
