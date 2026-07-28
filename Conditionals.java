import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
    	
        int dailyPractice = 12;

        if(dailyPractice >= 10){
            System.out.println("Good Consistency!");
        }
        

        int age = 100;
        if(age > 18){
            System.out.println("You are eligible to vote");
        }
        

        int score = 420;

        if(score >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        

        int age = 12;
        if(age > 18){
            System.out.println("Can Vote");
        }else{
            System.out.println("Can't vote");
        }
        

        int accuracy = 78;

        if(accuracy >= 90){
            System.out.println("Excellent");
        }else if(accuracy >= 75){
            System.out.println("Good");
        }else if(accuracy >= 60){
            System.out.println("Average");
        }else{
            System.out.println("Needs Improvement");
        }
        

        int day = 3;

        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
        

        boolean hasSubscription = true;
        int solvedProblems = 200;

        if(hasSubscription){
            if(solvedProblems >=200){
                System.out.println("Unlock Advanced Sheet");
            }else{
                System.out.println("Practice More Problems");
            }

        }else{
            System.out.println("Upgrade to Premium");
        }
        

        
        int age = 12;
        char gender = 'M';

        if(gender == 'M'){
            System.out.println("You are a male");
            if(age >  18){
                System.out.println("You are male and age > 18");
            }else{
                System.out.println("You are male and age <= 18");
            }
        }else{
            System.out.println("You are not a male");
            if(age > 18){
                System.out.println("You are not a male and age > 18");
            }else{
                System.out.println("You are not a male and age <= 18");
            }
        }


         
        int streakDays = 5;
        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
        System.out.println(status);
        
        

       
        int age = 100;
        int ans = (age > 18) ? 22 : 12;
        System.out.println("Ans: " + ans);
       
         

        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        sc.close();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
       
    }
}
