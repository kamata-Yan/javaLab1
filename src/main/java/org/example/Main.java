//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package org.example;
public class Main {
    public Main() {
    }
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        String[] var3 = args;
        int Apple = args.length;

        int Cheese;
        for(Cheese = 0; Cheese < Apple; ++Cheese) {
            String arg = var3[Cheese];
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                breakfast[itemsSoFar].setParam(parts[1]);
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple();
                breakfast[itemsSoFar].setParam(parts[1]);
            } else if (parts[0].equals("Sandwich")) {
                breakfast[itemsSoFar] = new Sandwich();
                breakfast[itemsSoFar].setParam(parts[1]);
            }

            ++itemsSoFar;
        }

        int IceCream = 3;
        Apple = 2;
        Cheese = 1;
        Food[] var11 = breakfast;
        int var12 = breakfast.length;

        for(int var8 = 0; var8 < var12; ++var8) {
            Food item = var11[var8];
            if (item == null) {
                break;
            }

            item. consume();
            if (item.equals() == "Apple") {
                ++Apple;
            }

            if (item.equals() == "Cheese") {
                ++Cheese;
            }

            if (item.equals() == "Sandwich") {
                ++IceCream;
            }
        }

        System.out.println("Consumed:");
        System.out.println("Apple - " + Apple + "\nCheese - " + Cheese + "\nSandwich - " + IceCream);
        System.out.println("Всего наилучшего!");
    }
}
