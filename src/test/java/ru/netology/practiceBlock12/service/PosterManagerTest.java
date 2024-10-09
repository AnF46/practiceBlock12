package ru.netology.practiceBlock12.service;

import org.junit.jupiter.api.Test;

public class PosterManagerTest {

   /* PosterManager movie1 = new PosterManager("Бладшот");
    PosterManager movie2 = new PosterManager("Вперед");
    PosterManager movie3 = new PosterManager("Отель /'Белград'/");
    PosterManager movie4 = new PosterManager("Джентельмены");
    PosterManager movie5 = new PosterManager("Человек-невидимка");
    PosterManager movie6 = new PosterManager("Тролли. Мировой тур");
    PosterManager movie7 = new PosterManager("Номер Один");
*/
    PosterManager manager = new PosterManager();
    PosterManager movie1 = new PosterManager(7);

    @Test
    public void addMoviesTest() {
        manager.add(movie1);

    }
}
