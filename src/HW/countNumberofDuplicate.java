package HW;

public class countNumberofDuplicate {
    public static void main(String[] args) {
        String str = "abcca";

        int count =0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(j) == str.charAt(i)){
                    count++;
                    break;
                }

            }

        }
        System.out.println(count);
    }
}
