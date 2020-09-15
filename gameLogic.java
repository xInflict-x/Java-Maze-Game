import java.util.Scanner;

public class gameLogic {
    public static void printGrid(String[][] level) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[0].length; j++) {
                System.out.print(level[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findPlayer(String[][] level, int[] playerPosition) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[0].length; j++) {
                if (level[i][j].contentEquals("o")) {
                    playerPosition[0] = i;
                    playerPosition[1] = j;
                }
            }
        }
    }

    public static void checkStatus(String[][] level, int[] playerPosition, int[] endPosition, int currentLevel) {
        for (int i = 0; i < level.length; i++) {
            for (int j = 0; j < level[0].length; j++) {
                if (level[i][j].contentEquals("x")) {
                    endPosition[0] = i;
                    endPosition[1] = j;
                }
            }
        }
        if (playerPosition[0] == endPosition[0] && playerPosition[1] == endPosition[1]) {
            System.out.println("You win!");
            currentLevel++;
            menu(currentLevel);
        }
    }

    public static void move(String[][] level, int[] playerPosition) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contentEquals("a")) {
            if (level[playerPosition[0]][playerPosition[1] - 1].contentEquals("-") || level[playerPosition[0]][playerPosition[1] - 1].contentEquals("x")) {
                level[playerPosition[0]][playerPosition[1] - 1] = "o";
                level[playerPosition[0]][playerPosition[1]] = "-";
            }
        }
        if (input.contentEquals("d")) {
            if (level[playerPosition[0]][playerPosition[1] + 1].contentEquals("-") || level[playerPosition[0]][playerPosition[1] + 1].contentEquals("x")) {
                level[playerPosition[0]][playerPosition[1] + 1] = "o";
                level[playerPosition[0]][playerPosition[1]] = "-";
            }
        }
        if (input.contentEquals("w")) {
            if (level[playerPosition[0] - 1][playerPosition[1]].contentEquals("-") || level[playerPosition[0] - 1][playerPosition[1]].contentEquals("x")) {
                level[playerPosition[0] - 1][playerPosition[1]] = "o";
                level[playerPosition[0]][playerPosition[1]] = "-";
            }
        }
        if (input.contentEquals("s")) {
            if (level[playerPosition[0] + 1][playerPosition[1]].contentEquals("-") || level[playerPosition[0] + 1][playerPosition[1]].contentEquals("x")) {
                level[playerPosition[0] + 1][playerPosition[1]] = "o";
                level[playerPosition[0]][playerPosition[1]] = "-";
            }
        }
    }

    public static void clear() {
        for (int x = 0; x < 12; x++) {
            System.out.println("\n");
        }
    }

    public static void menu(int currentLevel) {
        int[] endPosition = {0, 0};
        int[] playerPosition = {0, 0};
        String[][] level1 = {
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "o", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "-", "-", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "-", "-", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "-", "-", "-", "=", "-", "-", "-", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "-", "=", "-", "=", "-", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "-", "-", "-", "=", "-", "-", "-", "=", "-", "-", "-", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "-", "=", "-", "=", "-", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "-", "-", "-", "=", "-", "-", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "x", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"}
        };
        String[][] level2 = {
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "o", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "-", "-", "-", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "-", "-", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "-", "-", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "x", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"}
        };
        System.out.println("1)Play (Level " + currentLevel + ")\n2)Info\n3)Exit\n> ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contentEquals("1")) {
            if (currentLevel == 1) {
                play(level1, playerPosition, endPosition, currentLevel);
            }
            if (currentLevel == 2) {
                play(level2, playerPosition, endPosition, currentLevel);
            }
            if (currentLevel == 3) {
                ;
            }
            if (currentLevel == 4) {
                ;
            }
        }
        if (input.contentEquals("2")) {
            info(currentLevel);
        }
        if (input.contentEquals("3")) {
            System.exit(0);
        }
    }

    public static void info(int currentLevel) {
        System.out.println("Info");
        menu(currentLevel);
    }

    public static void play(String[][] level, int[] playerPosition, int[] endPosition, int currentLevel) {
        boolean run = true;

        while (run) {
            clear();
            System.out.println("Level: " + currentLevel + "\n| =: Barrier | *: Border | o: Player | x: Goal | -: Path |");
            printGrid(level);
            findPlayer(level, playerPosition);
            checkStatus(level, playerPosition, endPosition, currentLevel);
            move(level, playerPosition);
        }

    }

    public static void main(String[] args) {
        int currentLevel = 1;
        menu(currentLevel);
    }
}
