package teste.composicao;

/**
 * @author Victor$
 * @date 09/01/2024$
 * Description:
 */
import infra.DAO;
import modelo.composisao.Endereco;
import modelo.composisao.Fornecedor;
import modelo.composisao.Funcionario;

public class Demo {

    public static void main(String[] args) {

        // Criando endereços
        Endereco enderecoFornecedor1 = new Endereco();
        enderecoFornecedor1.setLongradouro("Rua da Pedra");
        enderecoFornecedor1.setComplemento("Apto 101");

        Endereco enderecoFornecedor2 = new Endereco();
        enderecoFornecedor2.setLongradouro("Avenida da Agua");
        enderecoFornecedor2.setComplemento("Loja");

        Endereco enderecoFuncionario1 = new Endereco();
        enderecoFuncionario1.setLongradouro("Rua do Fogo");
        enderecoFuncionario1.setComplemento("Casa");

        Endereco enderecoFuncionario2 = new Endereco();
        enderecoFuncionario2.setLongradouro("Avenida do Ar");
        enderecoFuncionario2.setComplemento("Apto 777");

        // Criando fornecedores
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("Joaquim Phoenix");
        fornecedor1.setEndereco(enderecoFornecedor1);

        Fornecedor fornecedor2 = new Fornecedor();
        fornecedor2.setNome("Michael Jackson");
        fornecedor2.setEndereco(enderecoFornecedor2);

        // Criando funcionários
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Fabricio");
        funcionario1.setEndereco(enderecoFuncionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Beatriz");
        funcionario2.setEndereco(enderecoFuncionario2);

        // Persistindo no banco de dados usando o DAO
        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .incluir(fornecedor1)
                .incluir(fornecedor2)
                .incluir(funcionario1)
                .incluir(funcionario2)
                .fecharTransacao();

        dao.fechar();
    }
}

