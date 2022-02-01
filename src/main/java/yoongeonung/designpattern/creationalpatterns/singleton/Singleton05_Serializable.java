package yoongeonung.designpattern.creationalpatterns.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton05_Serializable implements Serializable {

    private static class Singleton05Holder {
        private static final Singleton05_Serializable INSTANCE = new Singleton05_Serializable();
    }

    public static Singleton05_Serializable getInstance() {
        return Singleton05_Serializable.Singleton05Holder.INSTANCE;
    }

    // 직렬화 대응방안
    protected Object readResolve() {
        return getInstance();
    }
}
