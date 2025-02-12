package DesignPatternPractice;

public class Client {
    public static void main(String[] args) {
        EagerLoadingExampl obj1 = EagerLoadingExampl.getInstance();
        EagerLoadingExampl obj2 = EagerLoadingExampl.getInstance();
        EagerLoadingExampl obj3 = EagerLoadingExampl.getInstance();
        EagerLoadingExampl obj4 = EagerLoadingExampl.getInstance();
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);
        System.out.println("obj4: " + obj4);

        LockorMutexorLazyLoading obj5 = LockorMutexorLazyLoading.getInstance();
        LockorMutexorLazyLoading obj6 = LockorMutexorLazyLoading.getInstance();
        LockorMutexorLazyLoading obj7 = LockorMutexorLazyLoading.getInstance();
        System.out.println("obj5: " + obj5);
        System.out.println("obj6: " + obj6);
        System.out.println("obj7: " + obj7);

        DoubleCheckLocking obj8 = DoubleCheckLocking.getInstance();
        DoubleCheckLocking obj9 = DoubleCheckLocking.getInstance();
        DoubleCheckLocking obj10 = DoubleCheckLocking.getInstance();
        System.out.println("obj8: " + obj8);
        System.out.println("obj9: " + obj9);
        System.out.println("obj10: " + obj10);



    }
}
