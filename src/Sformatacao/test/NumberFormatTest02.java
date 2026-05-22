package Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale lcBrasil = new Locale("pt", "BR");
        Locale lcJapan = Locale.JAPAN;
        Locale lcItaly = Locale.ITALY;
        Locale lcUS = Locale.US;
        NumberFormat[] nfa = new NumberFormat[5];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(lcJapan);
        nfa[2] = NumberFormat.getCurrencyInstance(lcBrasil);
        nfa[3] = NumberFormat.getCurrencyInstance(lcItaly);
        nfa[4] = NumberFormat.getCurrencyInstance(lcUS);

        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        String valroString = "1000.2130";
        try {
            System.out.println(nfa[1].parse(valroString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
