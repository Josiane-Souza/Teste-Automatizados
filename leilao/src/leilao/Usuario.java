package leilao;

public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
//    private Lance ultimoLanceDado() {
//        return lances.get(lances.size()-1);
//    }
//    public void propoe(Lance lance) {
//        if(lances.isEmpty() || podeDarLance(lance.getUsuario())) {
//            lances.add(lance);            
//        }
//    }
//    
//    private boolean podeDarLance(Usuario usuario) {
//        return !ultimoLanceDado().getUsuario().equals(usuario)
//            && qtdDelancesDo(usuario) < 5;
//    }
//
//    private int qtdDelancesDo(Usuario usuario) {
//        int total = 0;
//        for(Lance lance : lances) {
//            if(lance.getUsuario().equals(usuario)) total++;
//        }
//        return total;
//    }
}
