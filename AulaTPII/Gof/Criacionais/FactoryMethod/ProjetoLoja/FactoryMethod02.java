// SUPERCLASSE CONSTRUCTOR
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + "Preco: " + preco);
    }
}

// SUBCLASSES DE PRODUTOS
class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
}

class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }
}

// FABRICA ABSTRATA DE PRODUTOS
abstract class FabricaDeProduto {
    public abstract Produto criarProduto(String nome, double preco);
}

// FABRICA CONCRETA - PRODUTO ELETRONICO
class FabricaDeEletronico extends FabricaDeProduto {
    public Produto criarProduto(String nome, double preco) {
        return new Eletronico(nome, preco);
    }
}

// FABRICA CONCRETA - PRODUTO ROUPAS
class FabricaDeRoupa extends FabricaDeProduto {
    public Produto criarProduto(String nome, double preco) {
        return new Roupa(nome, preco);
    }
}

//#################### USO DAS FÁBRICAS ####################
public class Main {
    public static void main(String[] args){
        FabricaDeProduto fabricaDeEletronico = new FabricaDeEletronico();
        Produto celular = fabricaDeEletronico.criarProduto(nome:"Celular", preco:500);
        celular.exibirDetalhes();

        FabricaDeProduto fabricaDeRoupa = new FabricaDeRoupa();
        Produto camiseta = fabricaDeRoupa.criarProduto(nome:"Camiseta", preco:50);
        camiseta.exibirDetalhes();
    }
}