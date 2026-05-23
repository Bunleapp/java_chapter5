
public class FiringGun {
    public static void main(String[] args) {

        int rounds = 100;
        int[] players = new int[6];

        for (int r = 0; r < rounds; r++) {

            int bullets = 5;

            for (int i = 0; i < 6; i++) {
                if (bullets == 0) {
                    // no bulllets left
                    break;
                }

                int chamber = (int) (Math.random() * 6);
                if (chamber < bullets) {
                    players[i]++; // if the player got shot increase 1
                    bullets--;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Player " + (i + 1) + " gets shot " + players[i] + " / " + rounds + " times");
        }
    }
}
