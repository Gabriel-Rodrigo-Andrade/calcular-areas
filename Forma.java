import java.util.ArrayList;
import java.util.List;

public abstract class Forma {
    public abstract double area();
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}

class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(3, 4));
        formas.add(new Circulo(2));
        formas.add(new Retangulo(5, 6));
        formas.add(new Circulo(1.5));

        double somaAreas = 0;
        for (Forma f : formas) {
            somaAreas += f.area();
        }

        System.out.println("Soma das áreas: " + somaAreas);
    }
}

/*
abstract: A classe Forma é abstrata porque representa um conceito genérico de forma geométrica, mas não pode ser instanciada diretamente. Ela define o método abstrato area(), que obriga as subclasses a fornecerem sua própria implementação para calcular a área.

extends: As classes Retangulo e Circulo usam extends Forma para herdar da classe abstrata. Isso significa que ambas são tipos de Forma e devem implementar o método area().

Subclasses: Você tem subclasses (Retangulo e Circulo) porque cada tipo de forma tem uma maneira diferente de calcular a área. Usando subclasses, você pode criar objetos específicos que compartilham uma interface comum (area()), mas têm comportamentos distintos. 
*/