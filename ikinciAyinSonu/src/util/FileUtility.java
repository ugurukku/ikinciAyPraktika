/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author HPProbook4530s
 */
public class FileUtility {

    public static void writeObjectToFile(Serializable object, String fileName) throws RuntimeException {
        try (FileOutputStream fout = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }

    public static Object readFileDeserialize(String fileName) {
        Object obj = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            obj = ois.readObject();
        } finally {
            return obj;
        }

    }

}
