public class Main {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        level1.handleRequest("Level 1");
        level1.handleRequest("Level 2");
        level1.handleRequest("Level 3");
        level1.handleRequest("Unknown Level");
    }
}