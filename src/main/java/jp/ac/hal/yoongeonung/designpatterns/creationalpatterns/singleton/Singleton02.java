package jp.ac.hal.yoongeonung.designpatterns.creationalpatterns.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton02 {
    /**
     * eager initialization (이른 초기화) 사용
     *
     * 장점 :
     * 멀티쓰레드 환경에서 안전하게 만들수 있다.
     *
     * 단점 :
     * 1. 클래스를 생성하는 비용이 클경우 성능상 문제.
     * 2. 이른 초기화로 생성후 사용하지 않을경우 리소스만 차지.
     */
    private static final Singleton02 INSTANCE = new Singleton02();

    public static Singleton02 getInstance() {
        return INSTANCE;
    }
}
