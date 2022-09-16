import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "The 1st day of the week is Monday"; break;
            case 2: dayName = "The 2nd day of the week is Tuesday"; break;
            case 3: dayName = "The 3rd day of the week is Wednesday"; break;
            case 4: dayName = "The 4th day of the week is Thursday"; break;
            case 5: dayName = "The 5th day of the week is Friday"; break;
            case 6: dayName = "The 6th day of the week is Saturday"; break;
            case 7: dayName = "The 7th day of the week is Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
    }

