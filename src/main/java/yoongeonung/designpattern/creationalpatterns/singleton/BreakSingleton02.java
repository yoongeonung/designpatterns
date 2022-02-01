package yoongeonung.designpattern.creationalpatterns.singleton;

import java.io.*;

public class BreakSingleton02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton05_Serializable instance = Singleton05_Serializable.getInstance();
        Singleton05_Serializable serializable_obj = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Singleton05_Serializable.obj"))) {
               out.writeObject(instance);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("Singleton05_Serializable.obj"))) {
            serializable_obj = (Singleton05_Serializable) in.readObject();
        }

        System.out.println(instance == serializable_obj);
    }
}
