package observerClassico;

//ex: um display que mostra informações atualizadas
//representa o display que mostra informações atualizadas
//sempre que um subject muda

public class ConcreteObserver implements Observer{
    private String name;

    private String lastUpdate;

    public ConcreteObserver(String name){
        this.name = name;
    }

    public void update(String data){
        this.lastUpdate = data;

        System.out.println("[" + name + "] Recebeu atualização: " + data);
    }

    public String getLastUpdate(){
        return lastUpdate;
    }
}
