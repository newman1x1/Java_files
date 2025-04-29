public class EnumEx {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String args[]) {
        Day today = Day.MONDAY;

        switch (today) {
            case MONDAY:
                System.out.println("\n Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("End of the work week!");
                break;
            case SUNDAY:
                System.out.println("Relax, it's Sunday!");
                break;
            default:
                System.out.println("Midweek days are so busy!");
        }
    }
}