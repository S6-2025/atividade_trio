import models.Animal;
import models.Cachorro;
import models.Furao;
import models.Gato;
import models.Consulta;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    protected static ArrayList<Consulta> consultas = new ArrayList<>();
    protected static ArrayList<String> medicos = new ArrayList<>();
    protected static ArrayList<Animal> animais = new ArrayList<>();
    final static Scanner sc = new Scanner(System.in);

public static Animal addAnimal(){
    System.out.println("__ INFORMAÇÕES DO ANIMAL__");
    System.out.println("Informe o nome do dono do animal:");
    String nomeDono = sc.nextLine();

    System.out.println("\nDigite o nome do animal:");
    String nome = sc.nextLine();

    System.out.println("\nInforme o tipo de animal: \n[C] Cachorro\n[F] Furão\n[G] Gato");
    String tipo = sc.nextLine();

    System.out.println("\nDigite a Raça do animal:");
    String raca = sc.nextLine();

    System.out.println("\nDigite a cor do animal:");
    String cor = sc.nextLine();

    System.out.println("\nDigite a idade do animal:");
    int idade = sc.nextInt();
    sc.nextLine();

    if (tipo.equalsIgnoreCase("C")) {
        System.out.println("\nInforme o comportamento do Cão: \n[1] Agitado \n[2] Bravo \n[3] Neutro");
        int comportamento = sc.nextInt();
        sc.nextLine();
        Cachorro cachorro = new Cachorro(raca, cor, nome, nomeDono, idade, comportamento);
        animais.add(cachorro);
        System.out.println("\nO DOGUINHO: " + nome.toUpperCase() + " FOI CADASTRADO COM SUCESSO!!");
        return cachorro;
    }else if(tipo.equalsIgnoreCase("F")){
        System.out.println("\nInforme o remelexo do Furão:");
        int remelexo = sc.nextInt();
        sc.nextLine();
        Furao furao = new Furao(raca, cor, nome, nomeDono, idade, remelexo);
        animais.add(furao);
        System.out.println("\nO FURÃOZINHO: " + nome.toUpperCase() + " FOI CADASTRADO COM SUCESSO!!");
        return furao;
    }else{
        System.out.println("\nInforme o Tamanho do Gato:");
        double comprimento = sc.nextDouble();
        sc.nextLine();
        Gato gato = new Gato(raca, cor, nome, nomeDono, idade, comprimento);
        animais.add(gato);
        System.out.println("\nO GATINHO: " + nome.toUpperCase() + " FOI CADASTRADO COM SUCESSO!!");
        return gato;
    }
}

    public static void agendarConsulta(){
        System.out.println("\n__AGENDAMENTO DE CONSULTA__");
        Animal animalCadastrado = addAnimal();
        String name = animalCadastrado.getNome();
        System.out.println("\nDigite a data de sua preferencia (dd/MM/yyyy)");
        String date = sc.nextLine();

        System.out.println("\nEscolha um médico:");
        for(int i = 0; i < medicos.size(); i++){
            System.out.printf("%d - %s\n", i+1 , medicos.get(i));
        }
        int doctor = sc.nextInt();
        sc.nextLine();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); //Formatador de String pra data
        try{
            consultas.add(new Consulta(formatter.parse(date), name,medicos.get(doctor - 1))); //Adiciona consulta na lista de consultas
            System.out.println("\nCONSULTA MARCADA COM SUCESSO!\n");
        }
        catch (Exception e){
            System.out.println("\nERRO AO ADICIONAR CONSULTA.\n");
        }
    }

    public static void verConsultas(){
        System.out.println("\n__CONSULTAS MARCADAS__");
        for(Consulta consulta: consultas){
            System.out.println(consulta);
            System.out.println("---");
        }
    }

    public static void verAnimais(){
        System.out.println("__ANIMAIS CADASTRADOS__");
        for (Animal i : animais){
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        //Adicionando medicos
        medicos.add("Rafinha Bastos");
        medicos.add("Seu Jorge");
        medicos.add("Seu Lau Lau");

        while (true){
            System.out.println("~~~~~");
            System.out.println("Bem vindo ao PetShop do Lau Lau!!! \n\nO que deseja fazer?");
            System.out.println("[1] Agendar uma consulta: \n[2] Ver consultas: \n[3] Ver Animais: \n[0] Sair:");

            String option = sc.nextLine();
            switch (option) {
                case "1":
                    agendarConsulta();// Chama pra cadastrar consulta
                    break;
                case "2":
                    verConsultas();
                    break;
                case "3":
                    verAnimais();
                    break;
                case "0":
                    System.out.println("Saindo...");
                    return;
                case"9":
                    addAnimal();
                    break;
                default:
                    System.out.println("Informe um valor válido!");
                    break;
            }
        }
    }
}