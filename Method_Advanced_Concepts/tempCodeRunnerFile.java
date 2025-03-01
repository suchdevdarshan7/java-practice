public static int fact(int num) {
        // base case terimate
        if (num == 0 || num == 1) {
            return 1;
        }

        return num * fact(num - 1);

    }