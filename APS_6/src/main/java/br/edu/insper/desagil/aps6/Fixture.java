package br.edu.insper.desagil.aps6;

import br.edu.insper.desagil.aps6.converter.FromLocalDateToString;
import br.edu.insper.desagil.aps6.core.Gato;
import br.edu.insper.desagil.aps6.core.Sexo;
import br.pro.hashi.sdx.dao.Dao;
import br.pro.hashi.sdx.dao.DaoClient;
import br.pro.hashi.sdx.dao.annotation.Converted;

import java.time.Instant;
import java.time.LocalDate;

public class Fixture {
    public static void main(String[] args) {
        DaoClient client = DaoClient.fromCredentials(Settings.CREDENTIALS_PATH);
        client.connect();

        /* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */
        Dao<Gato> dao = Dao.of(Gato.class);
        dao.create(new Gato("Milla", Sexo.FEMEA, "Tricolor", "Longa", "Amarelos", LocalDate.of(2022, 10, 3), LocalDate.of(2023, 1, 15)));
        dao.create(new Gato("Pepe", Sexo.MACHO, "Amarelo", "Longa", "Verdes", LocalDate.of(2022, 9, 2), LocalDate.of(2023, 4, 17)));
        dao.create(new Gato("Nino", Sexo.MACHO, "Sialata", "Curta", "Azuis", LocalDate.of(2022, 7, 1), LocalDate.of(2023, 3, 16)));
        dao.create(new Gato("Pan", Sexo.FEMEA, "Frajola", "Curta", "Amarelos", LocalDate.of(2022, 8, 4), LocalDate.of(2023, 2, 18)));

        /* NÃO MODIFIQUE NADA ABAIXO DESTA LINHA. */

        client.disconnect();
    }
}
