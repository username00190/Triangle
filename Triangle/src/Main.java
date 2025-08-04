public class Main {
    public static void main(String[] args) {
        System.out.println("The different types of triangles are");
        Triangle defaultt = new Triangle();
        System.out.println("The default triangle has sides: \t side A = " + defaultt.get(1)
                + ", side B = " + defaultt.get(2) + ", side C = " + defaultt.get(3));
        // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        // I dont get it, I think to string method will be much better to return all
        // sides. and miss you said to make 3 seperate get functions of each side
        // which I also don't get, I think I have a middle ground by making by having a
        // number corrospond to a side which results in a single get function.but my
        // logic also has flaw that if a shape has... lets say 100 sides then we need to
        // write 100 if/else statements, so I don't know what is right
        // |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
        System.out.println("Paremeter of triangle is : " + defaultt.paremeter() + ", and it results "
                + defaultt.isRightAngled() + " for right angle triangle.");

        Triangle equaleteral = new Triangle(3.0);
        System.out.println("The Equaleteral Triangle has : " + equaleteral.toString());

        System.out.println("Paremeter of triangle is : " + equaleteral.paremeter() + ", and it results "
                + equaleteral.isRightAngled() + " for right angle triangle.");
        // System.out.println("the total number of objects created in this file is :
        // "+equaletral.object_counter());

        Triangle isoscles = new Triangle(7.2, 5);
        System.out.println("Changing value of a side C:");
        isoscles.set(3, 4);// did the same with the set method.

        System.out.println("The isoscles Triangle has : " + isoscles.toString());

        System.out.println("Paremeter of triangle is : " + isoscles.paremeter() + ", and it results "
                + isoscles.isRightAngled() + " for right angle triangle.");
        Triangle scalene = new Triangle(3.0, 5.0, 4.0);
        System.out.println("The scalene Triangle has : " + scalene.toString());

        System.out.println("Paremeter of triangle is : " + scalene.paremeter() + ", and it results "
                + scalene.isRightAngled() + " for right angle triangle.");

        Triangle copy = new Triangle(isoscles);
        System.out.println("The copy Triangle has : " + copy.toString());// did not expect that running a method in
                                                                         // original after object creation also effects
                                                                         // copy

        System.out.println("Paremeter of triangle is : " + copy.paremeter() + ", and it results " + copy.isRightAngled()
                + " for right angle triangle.");

        System.out.println("the total number of objects created in this file is : " + equaleteral.object_counter());
        // previous object method calls work because other object_counter method is
        // available for all object of same class and it updates each time new object is
        // created.

    }
}