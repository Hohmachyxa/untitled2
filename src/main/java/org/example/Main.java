package org.example;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Main {
    public static ArrayList<Task> tasks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Показать задачу");
        System.out.println("2. Добавить задачу");
        System.out.println("3. Удалить все задачи");
        System.out.println("4. Сохранить все задачи в файл");
        System.out.println("0. Выход");
        System.out.println("Ваша опция: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                show_task();
                break;
            case 2:
                all_inputs();
                break;
            case 4:
                delete_all_tasks();
                break;
            case 5:
                writer_file();
                break;
            default:
                System.out.println("Такой опции нету");
        }
    }

    public static void show_task() {
        if(tasks.isEmpty()){
            System.out.println("Пусто");
        }
        for(int i = 0; i < tasks.size(); i++){
            System.out.println();
        }
    }

    public static void add_tasks(Task task) {
        tasks.add(task);
        System.out.println("Задача сделана");
    }

    public static void all_inputs(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ID для задачи: ");
        int id = input.nextInt();

        System.out.println("Введите Имя для задачи: ");
        String name = input.nextLine();

        System.out.println("Введите Описание для задачи: ");
        String descript = input.nextLine();

        Task task = new Task(id, name, descript);
        add_tasks(task);
    }

    public static void delete_all_tasks() {
        tasks.clear();
        System.out.println("Содержимое после очищения: " + tasks);
    }

    public static void writer_file() {
        Gson gson = new Gson();
        String jsonString = gson.toJson(tasks);
        System.out.println("Задача сохранена" + jsonString);
    }
}