package list_of_duplicate_objects;

import java.util.ArrayList;
import java.util.List;

public class ReturnList {


    public static List<String> listAll(){

        List<String> names = new ArrayList<>();
        names.add("Rian");
        names.add("Uchoa");
        names.add("Alyne");
        names.add("Luiz");
        names.add("Mariana");
        names.add("Carlos");
        names.add("Isabela");
        names.add("Pedro");
        names.add("Camila");
        names.add("Daniel");
        names.add("Ana");
        names.add("Fernando");
        names.add("Luiz");
        names.add("Gabriel");
        names.add("Carolina");
        names.add("Rafael");
        names.add("Beatriz");
        names.add("Thiago");
        names.add("Evelyn");
        names.add("Viviane");

        List<String> comparator = new ArrayList<>();

        comparator.add("Rian");
        comparator.add("Uchoa");
        comparator.add("Alyne");
        comparator.add("Fernanda");
        comparator.add("Roberto");
        comparator.add("Larissa");
        comparator.add("João");
        comparator.add("Patrícia");
        comparator.add("Gustavo");
        comparator.add("Amanda");
        comparator.add("Luiz");
        comparator.add("Marina");
        comparator.add("Diego");
        comparator.add("Juliana");
        comparator.add("Luciano");
        comparator.add("Bianca");
        comparator.add("Henrique");
        comparator.add("Natália");
        comparator.add("Matheus");
        comparator.add("Viviane");

        names.addAll(20 , comparator);

        return names;
    }

}
