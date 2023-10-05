
public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex : System.out.println("the answer is " + answer);
        // REPEAT FOR NEXT EXERCISE
        double bobSalary = 45000;
        double garySalary = 47000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("the highest salary is " + highestSalary);

        //Question 2:
        // carPrice =13500, truckPrice = 22000
        int carPrice = 13500;
        int truckPrice = 22000;
        int lowerPrice;
        {
            lowerPrice = Math.min(carPrice, truckPrice);
        }
        System.out.println("The more afforfable car is " + lowerPrice);

        // Question 3: Display the area of a circle.

        double radius = 7.25F;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The circle area is " + circleArea);

        // Question 4: Display the sqroot of a variable set to 5

        double variable = 5;
        double answer = Math.sqrt(variable);
        System.out.println("The square root of 5 is approximately " + answer);

        // Question 5 : Display the distance between the points (5,10) and (85,50)

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between the points is " + distance);

        //Question 6: find the absolute value of -3.8

        double num2 = -3.8;
        double absNum = Math.abs(num2);
        System.out.println("The absolute value of " + num2 + " is " + absNum);

        //Question 7: Display a random number between 0-1
        double randomNum = Math.random();
        System.out.println("The random number is " + randomNum);
    }
}


