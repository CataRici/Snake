class Snake {
    private int posLine = 8, posCol = 9, validMoves = 0;

    public void deplasare(int move) {
        if(move == 0 && posLine != 1) {
            ++validMoves;
            --posLine;
        }
        if(move == 1 && posCol != 17) {
            ++validMoves;
            ++posCol;
        }
        if(move == 2 && posLine != 15) {
            ++validMoves;
            ++posLine;
        }
        if(move == 3 && posCol != 1) {
            ++validMoves;
            --posCol;
        }
    }
    public int mutariValide () {
        return validMoves;
    }
}

public class Main {
    public static void main(String[] args) {
        Snake joc = new Snake();
        /*for (int i = 0; i < 10; ++i) {
            joc.deplasare(2);
        }*/
        for (int i = 0; i < 10; ++i) {
            joc.deplasare(1);
        }
        for (int i = 0; i < 7; ++i) {
            joc.deplasare(0);
        }
        /*for (int i = 0; i < 4; ++i) {
            joc.deplasare(i);
        }*/
        System.out.println("mutari valide = " + joc.mutariValide());

    }
}