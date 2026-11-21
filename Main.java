public class Main {

    // Salary = hours * rate
    public static int calculateSalary(int hours, int rate) {
        return hours * rate;
    }

    // getCategory wala 
    public static String getCategory(int salary) {
        if (salary >= 50000) {
            return "High";
        } else if (salary >= 35000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    // Hours 0 se 60 ke beech hain ya nahi
    public static boolean isValid(int hours) {
        if (hours >= 0 && hours <= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int rate = 1000;
        String[] names = {"Hina", "Omar", "Zara", "Bilal"};
        int[] hoursArr = {40, -5, 70, 55};

        int validCount = 0;
        int totalSalary = 0;

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int h = hoursArr[i];

            if (isValid(h) == false) {
                System.out.println("Invalid hours for " + name);
                continue;
            }

            int salary = calculateSalary(h, rate);
            String category = getCategory(salary);

            System.out.println(name + ": " + h + " hours, Rs " + salary + " " + category);

            validCount = validCount + 1;
            totalSalary = totalSalary + salary;
        }

        double average = (double) totalSalary / validCount;

        System.out.println("Valid employees: " + validCount);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + average);
    }
}