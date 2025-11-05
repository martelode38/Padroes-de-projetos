package observerClassico;
//define o contrato q todos os observadores devem seguir
//qualquer classe q implemente essa interface deve observar um sujeito
public interface Observer {
    void update(String message);   
}
