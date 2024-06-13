package br.edu.insper.desagil.aps1;

public class Linter {
    public String limpa(String s) {
        String novo_s = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
                novo_s += c;
            }
            else if (c >= 'a' && c <= 'z'){
                novo_s += c;
            }
            else if ((c >= '0' && c <= '9')) {
                continue;
            }
        }
        return novo_s;
    }
}
