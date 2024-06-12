package com.example;

public class App 
{
    public static void main( String[] args )
    {
        // Departamento[] departamento = new Departamento[10];
        // Funcionario[] funcionario = new Funcionario[100];

        // 1 - Cria uma empresa 
        Empresa empresa = new Empresa("Churrascaria JHR", "999.999.0001-99");

        // 2 - Adicione a essa empresa um departamento

        Departamento dep1 = new Departamento("Garcons");
        Departamento dep2 = new Departamento("Cozinha");

        empresa.setDepartamento(dep1);

        // 3 - Adicione aos departamento alguns funcionários

        Funcionario funcionario = new Funcionario("Rodolfo", 1700.00f, "03/07/2022"); 
        Funcionario funcionario2 = new Funcionario("Gillyan", 1700.00f, "16/09/2020");
        Funcionario funcionario3 = new Funcionario("Maria", 2000.00f, "28/07/2019");

        dep1.setFuncionario(funcionario);
        dep1.setFuncionario(funcionario2);

        dep2.setFuncionario(funcionario3);
        

        // 4 - Dê um aumento de 10% a todos funcionários de determinado departamento

        
        funcionario.NovoSalario();
        funcionario2.NovoSalario();
        funcionario3.NovoSalario();
        
        System.out.println("Salário Com Reajuste: " + funcionario.getSalario());


        // 5 - Transfira um funcionário de um departamento para outro

        dep1.removeFuncionario(funcionario2);  //remove o funcionario3 do departamento1
        dep2.addFuncionario(funcionario2); //insere o funcionario3 no departamento2


        System.out.println("\nEmpresa: ");
        System.out.println(empresa.getNome());

        System.out.println("\nFuncionários da Empresa "+ empresa.getNome()+ ":");
        System.out.println("Nome: " + funcionario.getNome() + " | " + "Salario com reajuste: " + funcionario.getSalario());
        System.out.println("Nome: " + funcionario2.getNome() + " | " + "Salario com reajuste: " + funcionario2.getSalario());
        System.out.println("Nome: " + funcionario3.getNome() + "   | " + "Salario com reajuste: " + funcionario3.getSalario());

        System.out.println("\nDepartamentos da Empresa "+ empresa.getNome()+ ":");
        System.out.println(dep1.getNome());
        System.out.println(dep2.getNome());

        System.out.println("\nFuncionários do departamento Garcons:");
        for (Funcionario func : dep1.getFuncionario()) {
            System.out.println(func.getNome());
        }

        System.out.println("\nFuncionários do departamento Cozinha:");
        for (Funcionario func : dep2.getFuncionario()) {
            System.out.println(func.getNome());
        }

    }
}
