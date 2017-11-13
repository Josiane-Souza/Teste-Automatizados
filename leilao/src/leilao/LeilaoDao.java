package leilao;
import java.util.List;

public class LeilaoDao extends RepositorioDeLeiloes{

    public List<Leilao> correntes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    LeilaoDao daoFalso = mock(LeilaoDao.class);
//    
//    Calendar antiga = Calendar.getInstance();
//    antiga.set(1999, 1, 20);
//    Leilao leilao1 = new CriadorDeLeilao().para("TV de plasma").naData(antiga).constroi();
//    Leilao leilao2 = new CriadorDeLeilao().para("Geladeira").naData(antiga).constroi();
//    
//    List<Leilao> leiloesAntigos = Arrays.asList(leilao1, leilao2);
//    // criando o mock!
//    LeilaoDao daoFalso = mock(LeilaoDao.class);
//    // ensinando o mock a reagir da maneira que esperamos!
//    when(daoFalso.correntes()).thenReturn(leiloesAntigos);
//
//    private LeilaoDao mock(Class<LeilaoDao> aClass) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static class CriadorDeLeilao {
//
//        public CriadorDeLeilao() {
//        }
//
//        private Object para(String tv_de_plasma) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//    }

    public void atualiza(Leilao leilao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
