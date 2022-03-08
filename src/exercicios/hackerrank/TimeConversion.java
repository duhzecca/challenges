package exercicios.hackerrank;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("12:01:00AM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder formattedTime = new StringBuilder();
        boolean isPM = s.contains("PM");
        String[] split = s.replace("AM", "").replace("PM", "").split(":");

        formattedTime.append(formatHour(split[0], isPM)).append(":");
        formattedTime.append(split[1]).append(":");
        formattedTime.append(split[2]);

        return formattedTime.toString();
    }

    private static String formatHour(String hour, boolean isPM) {
        if (isPM) {
            if (hour.equals("12")) {
               return hour;
            } else {
                return String.valueOf(Integer.parseInt(hour) + 12);
            }
        } else {
            if (hour.equals("12")) {
                return "00";
            }
            return hour;
        }
    }
}
