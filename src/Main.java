import java.util.*;

public class Main {
    public static void main(String[] args) {
//1 - Crie um programa em Java que permita ao usuário adicionar itens a uma lista de strings e, em seguida, imprima todos os itens da lista. Utilize a classe Scanner para capturar a entrada do usuário.
//2 - Crie um programa em Java que permita ao usuário remover um item específico de uma lista de strings e verifique se o item foi removido. Utilize a classe Scanner para capturar a entrada do usuário.
//3 - Crie um programa em Java que permita ao usuário adicionar itens a uma lista de strings e, em seguida, ordene a lista em ordem alfabética. Utilize a classe Scanner para capturar a entrada do usuário.
//4 - Crie um programa em Java que permita ao usuário adicionar números a uma lista e, em seguida, filtre e mostre os itens maiores que um valor fornecido. Utilize a classe Scanner para capturar a entrada do usuário.
    boolean control = true;

    List<String> itens = new ArrayList<>();
    List<Integer> numeros = new ArrayList<>();

        while (control) {
        System.out.println(" Escolha a opção desejada: " +
                "\n 1 - para adicionar um item " + //ok
                "\n  2 - para remover um item " + //ok
                "\n  3 - para fazer a lista ordenada" + //ok
                "\n  4 - para adicionar um número" + //ok
                "\n  0 - para sair do programa");
        int menu = scanner("Digite a opção desejada").nextInt();

        if (menu == 1) {
            addItem(itens);
        } else if (menu == 2) {
            remove(itens);
        } else if (menu == 3) {
            order(itens);
        } else if (menu == 4) {
            filter(numeros);
        } else if (menu == 0) {
            control = false;
        }
    }

    }

    public static void addItem (List<String> itens) {
        // itens a uma lista de strings e, em seguida, imprima todos os itens da lista
        String item = scanner("Digite um item: ").nextLine();
        itens.add(item);
        System.out.println("Item adicionado com sucesso! Agora temos: \n "+itens);
    }

    public static void remove (List<String> itens) {
        //remover um item específico de uma lista de strings e verifique se o item foi removido
        String removido = scanner("Digite o item que deseja remover: ").nextLine();
        itens.remove(removido);
        System.out.println(removido+" foi removido com sucesso!");
    }

    public static void order (List<String> itens) {
        //adicionar itens a uma lista de strings e, em seguida, ordene a lista em ordem alfabética
        boolean condicao = true;

        while(condicao) {
            int opcao = scanner("Digite uma opção:" +
                    "\n 1 - Adicionar item na lista" +
                    "\n 0 - Finalizar").nextInt();
            if (opcao == 1) {
                String item = scanner("Digite um item: ").nextLine();
                itens.add(item);
                Collections.sort(itens);
                System.out.println(itens);
            } else if (opcao == 0) {
                condicao = false;
            }
        }
    }

    public static void filter (List<Integer> numeros) {
        //adicionar números a uma lista e, em seguida, filtre e mostre os itens maiores que um valor fornecido
        boolean condicao = true;
        while (condicao) {
            int menuValores = scanner("Digite a opção desejada:" +
                "\n 1 - para adicionar valores" +
                "\n 2 - para comparar os valores com outro" +
                "\n 0 - sair").nextInt();
            if (menuValores == 1) {
            int valores = scanner("Digite um valor inteiro: ").nextInt();
            numeros.add(valores);
            } else if (menuValores == 2) {
                int comparador = scanner("Digite um valor inteiro: ").nextInt();
                for (int i = 0; i < comparador; i++) {
                    if (comparador < numeros.get(i)) {
                        numeros.set(i, numeros.get(i));
                        System.out.println(numeros+" são maiores que o comparador "+comparador);
                    } else {
                        System.out.println("Os valores são mais baixos que o comparador "+comparador);
                    }
                }
            } else if (menuValores == 0) {
                condicao = false;
            }
        }
    }

    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}