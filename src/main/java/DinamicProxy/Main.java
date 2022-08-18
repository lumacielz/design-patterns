package DinamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl("Joe", "male", "books,sci-fi,wine");
        PersonBean ownerProxy = getOwnerProxy(joe);
        System.out.println(ownerProxy.getName());
        System.out.println(ownerProxy.getGender());
        System.out.println(ownerProxy.getInterests());

        try {
            ownerProxy.setHotOrNotRating(9);
        } catch (Exception e){
            System.out.println("cannot rate yourself");
        }

        System.out.println(ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println(nonOwnerProxy.getName());
        System.out.println(nonOwnerProxy.getGender());
        System.out.println(nonOwnerProxy.getInterests());

        try {
            nonOwnerProxy.setInterests("football");
        } catch (Exception e){
            System.out.println("cannot change other person's interests");
        }

        nonOwnerProxy.setHotOrNotRating(9);
        nonOwnerProxy.setHotOrNotRating(8);
        System.out.println(ownerProxy.getHotOrNotRating());
    }

    public static PersonBean getOwnerProxy(PersonBean person) {
        return getProxy(person, new OwnerInvocationHandler(person));
    }

    public static PersonBean getNonOwnerProxy(PersonBean person) {
        return getProxy(person, new NonOwnerInvocationHandler(person));
    }

    public static PersonBean getProxy(PersonBean person, InvocationHandler handler) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler
        );
    }
}
