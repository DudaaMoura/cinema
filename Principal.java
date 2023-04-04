public class Principal {
    public static void main(String[] args) {
        Filme f = new Filme();

        f.setCodigo(16);
        f.setNome("Guardiões da galaxia");
        f.setValor(25);

        f.setDisponivel(true);
        if(f.isDisponivel()){
            System.out.println(" "+f.getCodigo());
            System.out.println(f.getNome());
            System.out.println(f.getValor());
        }else{
            System.out.println("Filme não disponível");
        }
    }
}
