class Hello {
    public static void main(String[] args) {
        String example = "Hello world No.1 champion 2021 bye 2024";
        int sum = 0;
        String temp = "";

        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) >= '0' && example.charAt(i) <= '9') {
                temp += example.charAt(i);
            } else {
                if (temp.length() > 0) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (temp.length() > 0) {
            sum += Integer.parseInt(temp);
            temp = "";
        }

        System.out.println(sum);
    }
}