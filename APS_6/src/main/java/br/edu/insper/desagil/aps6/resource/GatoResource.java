package br.edu.insper.desagil.aps6.resource;

import br.edu.insper.desagil.aps6.core.Gato;
import br.pro.hashi.sdx.dao.Dao;
import br.pro.hashi.sdx.rest.server.RestResource;
import br.pro.hashi.sdx.rest.server.annotation.Body;

import java.util.List;

public class GatoResource extends RestResource {
    public GatoResource() {
        super("/gatos");
    }
    public List<Gato> get(){
        Dao<Gato> dao = Dao.of(Gato.class);
        return dao.collect().retrieve();
    }
    public Gato get(String algumId){
        Dao<Gato> dao = Dao.of(Gato.class);
        return dao.retrieve(algumId);
    }
    public void post(@Body Gato gatoReceived){
        Dao<Gato> dao = Dao.of(Gato.class);
        dao.create(gatoReceived);
    }
    public void put(@Body Gato gatoReceived){
        Dao<Gato> dao = Dao.of(Gato.class);
        dao.update(gatoReceived);
    }
    public void delete(String algumId){
        Dao<Gato> dao = Dao.of(Gato.class);
        dao.delete(algumId);
    }
}
