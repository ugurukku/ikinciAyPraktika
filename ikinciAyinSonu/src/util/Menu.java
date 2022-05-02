/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Config;
import service.inter.Process;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowStudentService;
import service.menu.MenuShowTeacherService;
import static util.MenuUtil.showMenu;

/**
 *
 * @author HPProbook4530s
 */
public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHERS(5, "Show all teachers", new MenuShowTeacherService()),
    SHOW_ALL_STUDENTS(6, "Show all students", new MenuShowStudentService()),
    UNNKOWN(-1,null,null);

    private final String label;
    private final Process service;
    private final int number;



    Menu(int number, String label, Process service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();
        showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static Menu find(int number) {
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNNKOWN;

    }

    public static void showAllMenu() {
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNNKOWN) {

                if (menus[i] == LOGIN || menus[i] == REGISTER) {
                    if (!Config.isLoggedIn()) {

                        System.out.println(menus[i]);

                    }

                } else if (Config.isLoggedIn()) {

                    System.out.println(menus[i]);

                }
            }
        }
    }
}
