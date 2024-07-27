package questions;

public class CurrencyConverter {
    private static final String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] HUNDREDS = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};

    public static String convertCurrency(String amount) {
        // Remove the dollar sign and split the amount into dollars and cents
        amount = amount.substring(1);  // Remove the dollar sign
        String[] parts = amount.split("\\.");
        int dollars = Integer.parseInt(parts[0]);
        int cents = (parts.length > 1) ? Integer.parseInt(parts[1]) : 0;  // Handle missing cents part

        // Convert dollars to words
        String dollarWords = convertNumberToWords(dollars);
        if (!dollarWords.isEmpty()) {
            dollarWords += " dollars";
        }

        // Convert cents to words
        String centWords = convertNumberToWords(cents);
        if (!centWords.isEmpty()) {
            centWords += " cents";
        }

        // Combine dollars and cents
        if (!dollarWords.isEmpty() && !centWords.isEmpty()) {
            return dollarWords + " and " + centWords;
        } else if (!dollarWords.isEmpty()) {
            return dollarWords;
        } else if (!centWords.isEmpty()) {
            return centWords;
        } else {
            return "zero dollars";
        }
    }

    private static String convertNumberToWords(int number) {
        StringBuilder words = new StringBuilder();

        if (number >= 100) {
            words.append(HUNDREDS[number / 100]).append(" ");
            number %= 100;
        }
        if (number > 10 && number < 20) {
            words.append(TEENS[number - 10]).append(" ");
        } else if (number == 10) {
            words.append(TENS[1]).append(" ");
        } else {
            words.append(TENS[number / 10]).append(" ");
            number %= 10;
            words.append(ONES[number]).append(" ");
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(convertCurrency("$138.17"));  // "one hundred thirty eight dollars and seventeen cents"
        System.out.println(convertCurrency("$241.00"));  // "two hundred forty one dollars"
        System.out.println(convertCurrency("$0.99"));    // "ninety nine cents"
        System.out.println(convertCurrency("$100.00"));  // "one hundred dollars"
        System.out.println(convertCurrency("$0.00"));    // "zero dollars"
        System.out.println(convertCurrency("$50"));      // "fifty dollars"
        System.out.println(convertCurrency("$0"));       // "zero dollars"
        System.out.println(convertCurrency("$100"));     // "one hundred dollars"
    }
}

