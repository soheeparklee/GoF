package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Setting setting = Setting.INSTANCE;
        Setting setting1 = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(setting);
        }
        
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            setting1 = (Setting) in.readObject();
        }

        System.out.println(setting == setting1);
    }
}
