class EvenNumbers {
    public static void main(String[] args) {
        evenNumbers(Integer.parseInt(args[0]));
    }
    public static void evenNumbers(Integer n) {
        char[] chars = string.toCharArray(String.valueOf(n));
        for (char c: chars) {
            if (Integer.parseInt(String.valueOf(c))%2==0) {
                System.out.printf(String.valueOf(c)+" ");
            }
        }
    }
}

