package ru.netology.practiceBlock12.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManagerTest {

    @Test
    public void addMoviesTest() {
        PosterManager manager = new PosterManager();
        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void retrieveMoviesTest() {
        PosterManager manager = new PosterManager(2);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.findAll();

        String[] expected = {"Бладшот", "Вперед"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAboveDefaultLimitReversedTest(){
        PosterManager manager = new PosterManager(6);
//        String[] movies = {"Бладшот", "Вперед", "Отель /'Белград'/", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер Один"};
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель /'Белград'/");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");
        manager.findLast();

        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель /'Белград'/", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findBelowDefaultLimitReversedTest(){
        PosterManager manager = new PosterManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель /'Белград'/");
        manager.findLast();

        String[] expected = {"Отель /'Белград'/", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
