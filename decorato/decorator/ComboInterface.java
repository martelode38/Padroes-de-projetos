package decorato.decorator;
// permite composição uniforme, define um contrato comum, facilita a extensibilidade do codigo
//define funcionalidades basicas que podem ser extendidas
//permite o polimorfismo, voce pode tratar todos os tipos de combo da mesma forma
public interface ComboInterface {
    String getDescricao();
    double getValor();
}
