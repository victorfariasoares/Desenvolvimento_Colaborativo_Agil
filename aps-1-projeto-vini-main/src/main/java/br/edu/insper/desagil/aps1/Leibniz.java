package br.edu.insper.desagil.aps1;

public class Leibniz {
    public double aproxima(int n) {
        double calculo = 1.0;
        int i = 1;

        while (i <= n) {
            calculo -= (1.0 / (2 * i + 1));
            i += 1;

            if (i <= n) {
                calculo += (1.0 / (2 * i + 1));
                i += 1;
            }
        }
        return (4 * calculo);
    }
}
