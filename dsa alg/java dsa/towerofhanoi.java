class towerofHanoi {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            return 1;
        }
        int move1 = towerOfHanoi(n - 1, from, aux, to);
        int move2 = 1;
        int move3 = towerOfHanoi(n - 1, aux, to, from);

        return move1 + move2 + move3;

    }
}

class main {
    public static void main(String[] args) {
        towerofHanoi toh = new towerofHanoi();
        System.out.println(toh.towerOfHanoi(3, 1, 3, 2));
    }
}
