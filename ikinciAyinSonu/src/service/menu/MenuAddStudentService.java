/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import bean.Config;
import bean.Student;
import java.util.Scanner;
import service.inter.SaveableProcess;
import service.inter.menu.MenuAddStudentServiceInter;

/**
 *
 * @author HPProbook4530s
 */
public class MenuAddStudentService implements MenuAddStudentServiceInter, SaveableProcess {

    @Override
    public void processLogic() {
        System.out.println("\n" + "*******  ADDING STUDENT  *******" + "\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("enter surname:");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);
        System.out.println("Student added." + "\n");
    }

}
