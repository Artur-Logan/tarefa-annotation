import jdk.incubator.vector.VectorOperators;

import java.lang.reflect.Method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Teste teste = new Teste();
        Method method = teste.getClass().getMethod("meuMetodo");

        Tabela anotacao = method.getAnnotation(Tabela.class);
        System.out.println("Valor da anotação: " + anotacao.valor());
    }
}