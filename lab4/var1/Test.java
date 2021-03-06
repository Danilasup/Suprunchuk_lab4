package ru.mirea.gib04.lab4.var1;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class Test {

    public static void main(String[] args) {
        final List<Nameable> actors = new ArrayList<>();
        actors.add(new Person("Danila", "Sup"));
        actors.add(new Person("William", "Soders"));
        actors.add(new Pet("Zarya"));
        actors.add(new Pet("Laska"));

        print(System.out, "TestName", actors, Nameable::name);
    }

    private static <T> void print(PrintStream s, String title, List<T> list, Function<T, String> stringify) {
        s.println("\n" + title + ":");
        list.stream()
                .map(stringify)
                .forEach(string -> s.println("\t" + string));
        s.println();
    }
}