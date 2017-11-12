package leilao;
//A classe CriadorDeLeilao instancia os leilões para os nossos testes.

import java.util.Calendar;

public class CriadorDeLeilao {

    private Leilao leilao;
    
    public CriadorDeLeilao() {
    }
    
    public CriadorDeLeilao para(String descricao) {
        this.leilao = new Leilao(descricao);
        return this;
    }
    public CriadorDeLeilao lance(Usuario usuario, double valor) {
        leilao.propoe(new Lance(usuario, valor));
        return this;
    }
    public Leilao constroi() {
        return leilao;
    }

    Object naData(Calendar antiga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
