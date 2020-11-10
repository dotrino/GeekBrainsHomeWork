import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        generalFields();
        drawField();

        while (true) {
            playerStep();
            drawField();
            if (verifyWin(Player)) {
                System.out.println("PLAYER WINNER!");
                break;
            }
            if (isFilledField()) {
                System.out.println("Paint!");
                break;
            }
            artificialIntelligenceStep();
            drawField();
            if (verifyWin(ArtificialIntelligence)) {
                System.out.println("Computer WIN! YOU LOSE!");
                break;
            }
            if (isFilledField()) {
                System.out.println("DRAW!");
                break;

            }
        }
    }
        static final int SizeX = 6;
        static final int SizeY = 5;
        static final char Player = 'X';
        static final char ArtificialIntelligence = 'O';
        static final char Spot = '.';
        static final int Win = 3;

    private static char[][] field = new char[SizeY][SizeX];
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

     static void generalFields() {
        for (int i = 0; i < SizeY; i++) {
            for (int j = 0; j < SizeX; j++) {
                field[i][j] = Spot;
            }
        }
    }

     static void drawField() {
        System.out.println("-------");
        for (int i = 0; i < SizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < SizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X (от 1 до " + SizeX + ")   Y  (от 1 до " + SizeY + ")");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, Player);
    }


     static void artificialIntelligenceStep() {

        for (int i = 0; i < SizeY; i++)
            for (int j = 0; j < SizeX; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, ArtificialIntelligence);
                    if (verifyWin(ArtificialIntelligence)) return;
                    setSym(i, j, Spot);
                }
            }

        for (int i = 0; i < SizeY; i++)
            for (int j = 0; j < SizeX; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, Player);
                    if (verifyWin(Player)) {
                        setSym(i, j, ArtificialIntelligence);
                        return;
                    }
                    setSym(i, j, Spot);
                }
            }

        int x;
        int y;
        do {
            x = random.nextInt(SizeX);
            y = random.nextInt(SizeY);
        } while (!isCellValid(y, x));
        setSym(y, x, ArtificialIntelligence);
    }

     static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SizeX - 1 || y > SizeY - 1) {
            return false;
        }
        return field[y][x] == Spot;
    }

    static boolean isFilledField() {
        for (int i = 0; i < SizeY; i++) {
            for (int j = 0; j < SizeX; j++) {
                if (field[i][j] == Spot) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean verifyWin(char sym) {
        for (int i = 0; i < SizeY; i++) {
            for (int j = 0; j < SizeX; j++) {
                if (verifyLine(i, j, 0, 1,  sym)) return true;
                if (verifyLine(i, j, 1, 1,  sym)) return true;
                if (verifyLine(i, j, 1, 0,  sym)) return true;
                if (verifyLine(i, j, -1, 1, sym)) return true;
            }
        }
        return false;
    }

    static boolean verifyLine(int y, int x, int vy, int vx, char sym) {
        int wayX = x + (Win - 1) * vx;
        int wayY = y + (Win - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SizeX - 1 || wayY > SizeY - 1) return false;
        for (int i = 0; i < Win; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (field[itemY][itemX] != sym) return false;
        }
        return true;
    }
}



