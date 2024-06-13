package br.edu.insper.desagil.aps1;

public class Pois {
    public boolean verifica(int n) {
        int num = 1;

        for (int i = 0; i < n; i++) {
            if (num == n) {
                return true;
            }
            num *= 2;
        }
        return false;
    }
}