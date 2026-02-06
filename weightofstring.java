public int weightOfString(String input1, int input2) {

    int sum = 0;
    input1 = input1.toLowerCase();

    for (int i = 0; i < input1.length(); i++) {

        char ch = input1.charAt(i);

        if (ch >= 'a' && ch <= 'z') {

        
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                if (input2 == 1) {  
                    sum += (ch - 'a' + 1);
                }

            } else {  
                sum += (ch - 'a' + 1);
            }
        }
    }

    return sum;
}