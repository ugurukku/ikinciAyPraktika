/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import bean.Config;
import util.MenuUtil;

/**
 *
 * @author HPProbook4530s
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Config.initialize();
        MenuUtil.showMenu();

    }
}
