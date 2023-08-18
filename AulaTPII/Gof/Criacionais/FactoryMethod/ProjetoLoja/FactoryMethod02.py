#SUPERCLASSE CONSTRUTOR
class Produto:
    def __init__(self, nome, preco):
        self.nome = nome
        self.preco = preco

    def exibirDetalhes(self):
        print(f"Produto:{self.nome}, Preço: R${self.preco}")


 

#SUBCLASSES DE PRODUTOS
class Eletronico(Produto):
    def __init__(self, nome, preco):
        super().__init__(nome, preco)



class Roupa(Produto):
    def __init__(self, nome, preco):
        super().__init__(nome, preco)




#FABRICA ABSTRATA DE PRODUTOS
class FabricaDeProdutos:
    def criarProduto(self,nome,preco):
        raise NotImplementedError('O método criarProduto deve ser implementado pelas subclasses')

#FABRICA CONCRETA - PRODUTO ELETRONICA
class FabricaDeEletronico(FabricaDeProdutos):
    def criarProduto(self,nome,preco):
        return Eletronico(nome, preco)


#FABRICA CONCRETA - PRODUTO ROUPAS
class FabricaDeRoupa(FabricaDeProduto):
    def criarProduto(self,nome,preco):
        return Roupa(nome, preco)


#INTERFACE DE USO ################
FabricaDeEletronico = FabricaDeEletronico()
celular = FabricaDeEletronico.criarProduto("celular", 500)
celular.exibirDetalhes()


FabricaDeRoupa = FabricaDeRoupa()
camiseta = FabricaDeRoupa.criarProduto("camiseta", 50)
camiseta.exibirDetalhes()