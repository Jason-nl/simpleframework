package demo.generic;

import lombok.Data;

/**
 * created by Ethan on 2020/11/20 9:20 下午
 */
@Data
public class GenericClassExample<T> {
    private T member;

    public GenericClassExample(T member) {
        this.member = member;
    }

    public T handleSomething(T target) {
        return target;
    }
}
