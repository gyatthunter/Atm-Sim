public class WeedLeaf {
    public static void main(String[] args) {
        // ANSI escape codes for coloring the console output
        String green = "\u001B[32m";
        String reset = "\u001B[0m";

        // Applying the green color
        System.out.print(green);

        // Printing the ASCII Art line by line
        // Note: Backslashes (\) are escaped with another backslash (\\) in Java
        System.out.println("         .");
        System.out.println("        / \\");
        System.out.println("       /   \\");
        System.out.println("      /     \\");
        System.out.println(" .   /       \\   .");
        System.out.println("  \\  \\       /  /");
        System.out.println("   \\  \\     /  /");
        System.out.println("    \\  \\   /  /");
        System.out.println(".    \\  \\ /  /    .");
        System.out.println(" \\    \\  |  /    /");
        System.out.println("  \\    \\ | /    /");
        System.out.println("   \\    \\|/    /");
        System.out.println("    \\----|----/");
        System.out.println("         |");
        System.out.println("         |");

        // Resetting the console color back to default
        System.out.print(reset);
    }
}