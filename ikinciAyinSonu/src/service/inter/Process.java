package service.inter ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HPProbook4530s
 */
public interface Process {

    public abstract void processLogic();


    public default void process() {
        processLogic();
    }


}
