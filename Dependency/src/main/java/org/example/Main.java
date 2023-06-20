package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //non-Injected
        Parent1 p1 = new Parent1();

        //behind the scenes
        Injector inj = new Injector(new Class[] {Dependency.class});
        Parent2 p2 = new Parent2((Dependency) inj.get(Dependency.class));
        Parent2 p3 = new Parent2((Dependency) inj.get(Dependency.class));

        //Let's see what we gots!
        System.out.println();
        System.out.println("Alright folks, let's see what we got!");
        System.out.println();
        System.out.println("     Non-injected dependency -");
        System.out.println("p1 dependency: " + p1.dependency);
        System.out.println();
        System.out.println("     Very injected dependency -");
        System.out.println("p2 dependency: "+p2.dependency);
        System.out.println("p3 dependency: "+p3.dependency);
    }


    static class Dependency{
        // Some important Code
    }


    static class Parent1{
        private Dependency dependency;
        Parent1 (){
            this.dependency = new Dependency();
        }
    }


    static class Parent2{
        private Dependency dependency;

        Parent2 (Dependency dependency){
            this.dependency = dependency;
        }
    }

    static class Injector{
        Map<Class, Object> conMap = new HashMap();
        Injector(Class [] dependencies){
            for (Class dependency:dependencies){
                conMap.put(dependency, new Dependency());
            }
        }
        Object get(Class name) {
            if (conMap.get(name) != null) {
                return conMap.get(name);
            } else {
                return null;
            }
        }
    }
}