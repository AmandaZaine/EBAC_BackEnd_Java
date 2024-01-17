import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("MODULO 22");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nome e sexo no padrão: Nome-Sexo. Sendo que Sexo pode ser F ou M. Para mais de uma pessoa, separe com virgula (,): ");
        String stringPessoasESexo = scanner.nextLine();

        List<String> listaPessoasESexo = List.of(stringPessoasESexo.split(","));
        Map<String, String> mapPessoaESexo = new HashMap<>();

        listaPessoasESexo.stream().forEach(nomeEsexo -> {
            if(nomeEsexo.endsWith("F") || nomeEsexo.endsWith("f")){
                mapPessoaESexo.put(nomeEsexo.split("-")[0], "Mulher");
            } else {
                mapPessoaESexo.put(nomeEsexo.split("-")[0], "Homem");
            }
        });

        Set<Map.Entry<String, String>> setPessoaESexo = mapPessoaESexo.entrySet();

        setPessoaESexo.stream()
                .filter(pessoaESexo -> Objects.equals(pessoaESexo.getValue(), "Mulher"))
                .forEach(pessoaESexo -> System.out.println(pessoaESexo.getKey()));

    }
}