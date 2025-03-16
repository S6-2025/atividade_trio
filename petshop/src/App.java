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
    final static Scanner sc = new Scanner(System.in);

    public static void agendarConsulta(){
        System.out.println("Digite o nome do animal: ");
        String name = sc.nextLine();
        System.out.println("Digite a data de sua preferencia (dd/MM/yyyy)");
        String date = sc.nextLine();

        System.out.println("Escolha um médico");
        for(int i = 0; i < medicos.size(); i++){
            System.out.printf("%d - %s\n", i+1 , medicos.get(i));
        }
        System.out.print("Escolha: ");
        int doctor = sc.nextInt();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH); //Formatador de String pra data
        try{
            consultas.add(new Consulta(formatter.parse(date), name,medicos.get(doctor - 1))); //Adiciona consulta na lista de consultas
            System.out.println("Consulta marcada!");
        }
        catch (Exception e){
            System.out.println("Erro ao adicionar consulta!");
        }
    }

    public static void verConsultas(){
        for(Consulta consulta: consultas){
            System.out.println(consulta);
        }
    }


    public static void main(String[] args) throws Exception {
        //Adicionando medicos
        medicos.add("Rafinha Bastos");
        medicos.add("Seu Jorge");
        medicos.add("Seu lau lau");


        agendarConsulta();// Chama pra cadastrar consulta
        verConsultas();
    }
}
