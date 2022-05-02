/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.menu;

import service.inter.SaveableProcess;
import service.inter.menu.MenuRegisterServiceInter;

/**
 *
 * @author HPProbook4530s
 */
public class MenuRegisterService implements MenuRegisterServiceInter, SaveableProcess {

    @Override
    public void processLogic() {
        System.out.println("Register");
    }

}
