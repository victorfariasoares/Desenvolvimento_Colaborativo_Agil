package br.edu.insper.desagil.aps1;


public class Xis {
    public String constroi(int n) {
        String resposta = "";
        // dado que a altura de todos os "X" vão ser n * 2 - 1
        for (int i = 0; i < n * 2 - 1; i++) { // Loop para cada linha com altura n*2 - 1
            String linha = "";
            for (int j = 0; j < n * 2 - 1; j++) { // Loop para cada coluna com largura n*2 - 1
                // 'X' aparece em j == i e j == (n*2 - 2) - i
                if (j == i || j == (n * 2 - 2) - i) {
                    linha += "X";
                    if (((n * 2 - 1) - i - 1) == j && (i < (n * 2 - 1) / 2)) {
                        j = (n * 2 - 1) * 2;
                    } else if (i == j && (i >= (n * 2 - 1) / 2)) {
                        j = (n * 2 - 1) * 2;
                    }
                }
                else {
                        linha += " ";
                    }
            }
            resposta += linha + "\n";
        }
        return resposta;
    }
}
