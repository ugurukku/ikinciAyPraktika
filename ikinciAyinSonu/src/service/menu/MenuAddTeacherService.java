/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Teacher;
import java.util.Scanner;
import service.inter.SaveableProcess;
import service.inter.menu.MenuAddTeacherServiceInter;

/**
 *
 * @author HPProbook4530s
 */
public class MenuAddTeacherService implements MenuAddTeacherServiceInter, SaveableProcess {

    @Override
    public void processLogic() {
        System.out.println("\n" + "*******  ADDING TEACHER  *******" + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter surname:");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);
        System.out.println("Teacher added." + "\n");

    }
}
