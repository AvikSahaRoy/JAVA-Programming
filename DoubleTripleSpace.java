class DoubleTripleSpace {
    public static void main(String args[]) {
        String a = "Double  Space, Triple Space";
        if (a.indexOf("  ") == -1) {
            System.out.println("Double space not their");
        } else {
            System.out.println("Double space is their");
        }

        if (a.indexOf("   ") == -1) {
            System.out.println("Triple space not their");
        } else {
            System.out.println("Triple space is their");
        }

    }
}
