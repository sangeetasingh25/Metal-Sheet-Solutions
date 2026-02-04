public int createPIN(int input1, int input2, int input3) {

    int h1 = input1 / 100;
    int t1 = (input1 / 10) % 10;
    int o1 = input1 % 10;

    int h2 = input2 / 100;
    int t2 = (input2 / 10) % 10;
    int o2 = input2 % 10;

    int h3 = input3 / 100;
    int t3 = (input3 / 10) % 10;
    int o3 = input3 % 10;

    int ones = Math.min(o1, Math.min(o2, o3));
    int tens = Math.min(t1, Math.min(t2, t3));
    int hundreds = Math.min(h1, Math.min(h2, h3));

    int thousands = Math.max(
        Math.max(Math.max(h1, t1), o1),
        Math.max(Math.max(h2, t2), Math.max(o2, Math.max(h3, Math.max(t3, o3))))
    );

    return thousands * 1000 + hundreds * 100 + tens * 10 + ones;
}