package yoongeonung.designpattern.creationalpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingleton01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 의도한대로 생성된 Singleton05객체의 인스턴스
        Singleton05 instance = Singleton05.getInstance();

        // 리플렉션을 사용한 싱글톤 패턴을 깨트리는 방법
        Constructor<Singleton05> constructor = Singleton05.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton05 singleton05 = constructor.newInstance();

        System.out.println(singleton05 == instance);
    }
}
