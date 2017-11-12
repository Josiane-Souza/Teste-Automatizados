package leilao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Leilao {
    private String descricao;
    private List<Lance> lances;
    
    public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<Lance>();
    }
    public void propoe(Lance lance) {
        lances.add(lance);
    }
    public String getDescricao() {
        return descricao;
    }
    public List<Lance> getLances() {
        return Collections.unmodifiableList(lances);
    }   

    Calendar getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void encerra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean isEncerrado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}