static void Ungerade(int n1, int n2) {
        int n;
        for (int i = n1; i <= n2; i++) {
            
            while ((i % 2) != 0) {
                System.out.print(i + " ");
                break;

            }
        }
    }
