public class DataTypes {
    public static void main(String[] args) {
    	

        // Numeric DT - byte, short, int, long

        byte num1 = 127;
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3 = 50000;
        long num4 = 329421370;
        System.out.println(num3);
        System.out.println(num4);

        
        
        // floating DTs
        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.142435464777779;
        System.out.println(num6);


        
        // other - char, boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        char firstCharacter = 'n';
        System.out.println("My First Character is: " + firstCharacter);
        System.out.println((char) (firstCharacter+2));
        
        
    }
}
