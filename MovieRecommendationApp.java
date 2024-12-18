/*
package com.zhuyishag.javase.teat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// 用户类
class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

// 电影类
class Movie {
    private String title;
    private String director;
    private List<String> actors;
    private String genre;
    private int duration; // 分钟
    private String releaseDate;
    private double rating;

    public Movie(String title, String director, List<String> actors, String genre, int duration, String releaseDate, double rating) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.genre = genre;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getInfo() {
        return "标题: " + title + ", 导演: " + director + ", 演员: " + actors + ", 类型: " + genre +
                ", 时长: " + duration + "分钟, 上映日期: " + releaseDate + ", 评分: " + rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }
}

// 观看记录类
class WatchRecord {
    private Movie movie;
    private String watchTime;
    private int watchDuration; // 分钟
    private double rating;
    private String comment;

    public WatchRecord(Movie movie, String watchTime, int watchDuration, double rating, String comment) {
        this.movie = movie;
        this.watchTime = watchTime;
        this.watchDuration = watchDuration;
        this.rating = rating;
        this.comment = comment;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getWatchTime() {
        return watchTime;
    }
}

// 电影推荐系统类
class MovieRecommendationSystem {
    private List<User> users;
    private List<Movie> movies;
    private HashMap<String, List<WatchRecord>> userWatchRecords;

    public MovieRecommendationSystem() {
        users = new ArrayList<>();
        movies = new ArrayList<>();
        userWatchRecords = new HashMap<>();
    }

    // 用户注册
    public void registerUser(String username, String password, String email) {
        users.add(new User(username, password, email));
        System.out.println("用户注册成功: " + username);
    }

    // 用户登录
    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("用户登录成功: " + username);
                return user;
            }
        }
        System.out.println("登录失败: 用户名或密码错误");
        return null; // 登录失败
    }

    // 添加电影
    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("电影添加成功: " + movie.getTitle());
    }

    // 删除电影
    public void removeMovie(String title) {
        boolean removed = movies.removeIf(movie -> movie.getTitle().equals(title));
        if (removed) {
            System.out.println("电影 \"" + title + "\" 已成功删除。");
        } else {
            System.out.println("未找到电影 \"" + title + "\"，删除失败。");
        }
    }

    // 推荐电影
    public List<Movie> recommendMovies(String genre) {
        List<Movie> recommended = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getInfo().contains(genre)) {
                recommended.add(movie);
            }
        }
        return recommended;
    }

    // 电影搜索
    public List<Movie> searchMovies(String keyword) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().contains(keyword) || movie.getInfo().contains(keyword)) {
                result.add(movie);
            }
        }
        return result;
    }
}

// 主程序
public class MovieRecommendationApp {
    public static void main(String[] args) {
        MovieRecommendationSystem system = new MovieRecommendationSystem();
        Scanner scanner = new Scanner(System.in);

        // 示例操作
        while (true) {
            System.out.println("1. 注册用户");
            System.out.println("2. 登录用户");
            System.out.println("3. 添加电影");
            System.out.println("4. 删除电影");
            System.out.println("5. 搜索电影");
            System.out.println("6. 退出");
            System.out.print("请选择操作: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入用户名: ");
                    String username = scanner.nextLine();
                    System.out.print("请输入密码: ");
                    String password = scanner.nextLine();
                    System.out.print("请输入电子邮件: ");
                    String email = scanner.nextLine();
                    system.registerUser(username, password, email);
                    break;
                case 2:
                    System.out.print("请输入用户名: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("请输入密码: ");
                    String loginPassword = scanner.nextLine();
                    system.loginUser(loginUsername, loginPassword);
                    break;
                case 3:
                    System.out.print("请输入电影标题: ");
                    String title = scanner.nextLine();
                    System.out.print("请输入导演: ");
                    String director = scanner.nextLine();
                    System.out.print("请输入演员（用逗号分隔）: ");
                    String actorsInput = scanner.nextLine();
                    List<String> actors = List.of(actorsInput.split(","));
                    System.out.print("请输入类型: ");
                    String genre = scanner.nextLine();
                    System.out.print("请输入时长（分钟）: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // 消耗换行符
                    System.out.print("请输入上映日期: ");
                    String releaseDate = scanner.nextLine();
                    System.out.print("请输入评分: ");
                    double rating = scanner.nextDouble();
                    scanner.nextLine(); // 消耗换行符

                    Movie movie = new Movie(title, director, actors, genre, duration, releaseDate, rating);
                    system.addMovie(movie);
                    break;
                case 4:
                    System.out.print("请输入要删除的电影标题: ");
                    String removeTitle = scanner.nextLine();
                    system.removeMovie(removeTitle);
                    break;
                case 5:
                    System.out.print("请输入搜索关键字: ");
                    String keyword = scanner.nextLine();
                    List<Movie> searchResults = system.searchMovies(keyword);
                    for (Movie m : searchResults) {
                        System.out.println(m.getInfo());
                    }
                    break;
                case 6:
                    System.out.println("退出系统。");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效的选择，请重试。");
            }
        }
    }
}*/
