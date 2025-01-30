package mypackage1;

 class TestDefaultMain {

     /*
     Here we can observe that If a class name doesn't have any modifiers we can
     assume it as default. Therefore we can call class 'TestDefault' in 'TestDefaultMain' class
     But the point to remember : both the classes should be in the "SamePackage" i.e -> 'mypackage1'
      */

     public static void main(String[] args) {
         /*
         Because of 'default' specifier we can create an object
          */
         TestDefault td=new TestDefault();
         td.display();
     }
}
