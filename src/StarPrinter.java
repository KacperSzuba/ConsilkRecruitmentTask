class StarPrinter {
    void printStars(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("*".repeat(i));
            System.out.println("*".repeat(i + 2));
        }
    }
}
