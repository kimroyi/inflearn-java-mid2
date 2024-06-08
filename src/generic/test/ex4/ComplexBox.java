package generic.test.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }

    // 이렇게 모호한 것은 좋지 않다. 둘의 이름이 겹치면 이름을 변경하는 것이 좋다.
//    public <T> T printAndReturn(T t) {
//        System.out.println("animal.className: " + animal.getClass().getName());
//        System.out.println("t.className: " + t.getClass().getName());
//        return t;
//    }
}
