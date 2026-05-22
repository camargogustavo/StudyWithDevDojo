package Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale lcBrasil = new Locale("pt", "BR");
        Locale lcJapan = Locale.JAPAN;
        Locale lcItaly = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(lcJapan);
        nfa[2] = NumberFormat.getInstance(lcBrasil);
        nfa[3] = NumberFormat.getInstance(lcItaly);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

    }
}
