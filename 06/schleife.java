public static void numbersequence(int lowerBound, int upperBound) {
        int count = lowerBound;

        // if number is even add 1 in order to skip every even number later on
        if (count % 2 == 0) {
            count++;
        }

        // in order to not check 2 numbers in line of System.out statement later on
        if (upperBound % 2 == 0) {
            upperBound -= 1;
        }

        for (; count <= upperBound; count += 2) {
            System.out.print((count != upperBound) ? count + " " : count);
        }

        System.out.println("");
    }

