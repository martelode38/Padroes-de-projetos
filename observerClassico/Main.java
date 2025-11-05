package observerClassico;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO OBSERVER CLÁSSICO ===\n");
        
        // CRIAR O SUBJECT (quem será observado)
        // Subject é o objeto que mantém o estado e notifica os observers
        // É como um "sensor" que quando muda, avisa todos os "displays"
        Subject subject = new Subject();
        
        // CRIAR OS OBSERVERS (quem observa)
        // Observers são objetos que querem ser notificados quando o Subject muda
        // Cada observer tem um nome para identificá-lo
        Observer observer1 = new ConcreteObserver("Display 1");  
        Observer observer2 = new ConcreteObserver("Display 2");  
        Observer observer3 = new ConcreteObserver("Display 3");  
        
        // PASSO 3: REGISTRAR OBSERVERS NO SUBJECT (attach)
        // Agora vamos "conectar" os observers ao subject
        // Isso significa que quando o subject mudar, esses observers serão notificados
        subject.attach(observer1);  
        subject.attach(observer2);  
        subject.attach(observer3);  
        
        System.out.println("Observers registrados!\n");
        
        // MUDAR O ESTADO DO SUBJECT (notifica observers automaticamente)
        // Quando chamamos setState(), o subject:
        // 1. Atualiza seu estado interno
        // 2. Chama notifyObservers() automaticamente
        // 3. Todos os observers registrados recebem update() com o novo valor
        
        System.out.println("Mudando estado para 'Temperatura: 25°C'...");
        subject.setState("Temperatura: 25°C");
        
        System.out.println("\nMudando estado para 'Temperatura: 30°C'...");
        subject.setState("Temperatura: 30°C");

        System.out.println("\nRemovendo observer 2...");
        subject.detach(observer2); 
        
        System.out.println("\nMudando estado para 'Temperatura: 35°C'...");
        subject.setState("Temperatura: 35°C");

    }
}

