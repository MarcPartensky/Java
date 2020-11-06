class Main {
    public static void main(String[] args) {
        Chevre chevre = new Chevre();
        chevre.faireDuBruit();
        Chien chien = new Chien();
        chien.faireDuBruit();
        Poule poule = new Poule();
        poule.faireDuBruit();
    }
}

class Animal {
    public Animal() {
    }
}

class Chevre extends Animal {
    public void faireDuBruit() {
        System.out.println("Beeeh");
    }
}

class Chien extends Animal {
    public void faireDuBruit() {
        System.out.println("Waf");
    }
}

class Poule extends Animal {
    public void faireDuBruit() {
        System.out.println("Cot cot");
    }
}

