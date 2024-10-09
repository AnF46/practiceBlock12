package ru.netology.practiceBlock12.service;


public class PosterManager {
  private String[] movies = new String[0];
  public int wishMovieList; // он же лимит показа;

    public PosterManager(int wishMovieList) {

        this.wishMovieList = wishMovieList;
    }

    public PosterManager() {
        this.wishMovieList = 5;
    }


    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++){
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    //метод добавления нового фильма

    public String[] findAll() {
    return movies; // метод Вывода всех фильмов в порядке добавления  - findAll
    }
    public String[] findLast() { // метод вывода фильмов в обратном порядке findLast
        int resultLength;

        if (movies.length < wishMovieList) {
            resultLength = movies.length;
        } else {
            resultLength = wishMovieList;

        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = movies[movies.length - 1 - i];
        }
        return reversed;
    }


    // String[] array = {"Бладшот", "Вперед", "Отель /'Белград'/", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер Один"};
}