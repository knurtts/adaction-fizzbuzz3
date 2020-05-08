public class FizzBuzzThree {

    public String fizzleBuzzle(int[] numbers) {

        Object[] result = new Object[numbers.length];
        String report = "";
        int fizz = 0;
        int buzz = 0;
        int fizzBuzz = 0;
        int lucky = 0;
        int integers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (String.valueOf(numbers[i]).contains("3")) {
                result[i] = "lucky";
                lucky++;
            } else if (numbers[i] % 3 == 0 && numbers[i] % 15 != 0) {
                result[i] = "fizz";
                fizz++;
            } else if (numbers[i] % 15 == 0) {
                result[i] = "fizzbuzz";
                fizzBuzz++;
            } else if (numbers[i] % 5 == 0) {
                result[i] = "buzz";
                buzz++;
            } else {
                result[i] = numbers[i];
                integers++;
            }

            report = report + " " + result[i];
        }
        report = report +
                "\nFizz: " + fizz +
                "\nBuzz: " + buzz +
                "\nFizzbuzz: " + fizzBuzz +
                "\nLucky: " + lucky +
                "\nInteger: " + integers;

        return report.trim();
    }
}
