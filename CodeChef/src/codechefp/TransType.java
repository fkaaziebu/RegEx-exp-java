package codechefp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransType {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("databaseXSCORE.csv"));
        input.useDelimiter("\n");
        int i = 1;
        while (input.hasNext()) {
            String s = input.next();
            Pattern credit = Pattern.compile("credit", Pattern.CASE_INSENSITIVE);
            Matcher creditM = credit.matcher(s);
            boolean creditBool = creditM.find();
            Pattern credit1 = Pattern.compile("payment of", Pattern.CASE_INSENSITIVE);
            Matcher creditM1 = credit1.matcher(s);
            boolean creditBool1 = creditM1.find();
            Pattern credit2 = Pattern.compile("deposit", Pattern.CASE_INSENSITIVE);
            Matcher creditM2 = credit2.matcher(s);
            boolean creditBool2 = creditM2.find();
            Pattern debit = Pattern.compile("debit", Pattern.CASE_INSENSITIVE);
            Matcher debitM = debit.matcher(s);
            boolean debitBool = debitM.find();
            Pattern debit1 = Pattern.compile("withdrawal", Pattern.CASE_INSENSITIVE);
            Matcher debitM1 = debit1.matcher(s);
            boolean debitBool1 = debitM1.find();
            if (creditBool || creditBool1 || creditBool2) {
                System.out.println(i + " Credited");
            }
             else if (debitBool || debitBool1) {
                 System.out.println(i + " Not credited");
            }
             else {
                System.out.println(i + " Not applicable");
            }
             i++;
        }
    }
}
