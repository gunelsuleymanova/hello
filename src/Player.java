import java.util.*;
    public class Player implements Comparable <Player> {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }



















        @Override
        public int compareTo(Player score) {
            return Double.compare(this.score,score.score);
        }


        public static void main(String[] args) {































        }

    }

