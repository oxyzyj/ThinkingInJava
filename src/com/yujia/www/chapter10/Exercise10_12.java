package com.yujia.www.chapter10;

class Shared {
  private int refcount = 0;
  private static long counter = 0;
  private final long id;
  public Shared() {
    id = counter;
    counter++;
    System.out.println("Creating "+ this);
  }
  public int getRefcount() {
    return refcount;
  }
  public void addRef() {refcount++;}
  protected void dispose() {
    if(--refcount == 0)
      System.out.println("disposing " + this);
  }
  protected void finalize() {
    if(refcount > 0)
      System.out.println("Error:  " +refcount + " Shared" + id + " objects in use");
  }
  public String toString() {return "Shared "+ id;}
}

class Characteristic {
  private String s;
  Characteristic(String s) {
    this.s = s;
    System.out.println("Creating Characteristic "+ s);
  }
}

class Rodent{
  private Characteristic c = new Characteristic("has tail");
  private Shared shared;
  static long counter = 0;

  final long id;

  Rodent(Shared shared) {
    System.out.println("Rodent()");
    this.shared = shared;
    this.shared.addRef();
    id = counter;
    counter++;
  }
  void eat() {
    System.out.println("Rodent eat");
  }
  protected void dispose() {
    System.out.println("disposing " + this);
    shared.dispose();
  }
  public String toString() {return "Rodent "+ id;}
}

class Mouse extends Rodent {
  private Characteristic c = new Characteristic("likes cheese");
  Mouse(Shared shared) {
    super(shared);
    System.out.println("Mouse()");
  }
  @Override
  void eat() {
    System.out.println("Mouse eat");
  }
  public String toString() {return "Mouse "+ id;}
}

class Gerbil extends Rodent {
  private Characteristic c = new Characteristic("from India");
  Gerbil(Shared shared) {
    super(shared);
    System.out.println("Gerbil()");
  }
  @Override
  void eat() {
    System.out.println("Gerbil eat");
  }
  public String toString() {return "Gerbil "+ id;}
}

class Hamster extends Rodent {
  Hamster(Shared shared) {
    super(shared);
    System.out.println("Hamster()");
  }
  @Override
  void eat() {
    System.out.println("Hamster eat");
  }
  public String toString() {return "Hamster "+ id;}
}

public class Exercise10_12 {
  public static void main(String[] args) {
    Shared shared = new Shared();
    Rodent[] rodents = new Rodent[4];
    System.out.println(shared.getRefcount());
    rodents[0] = new Rodent(shared);
    System.out.println(shared.getRefcount());
    System.out.println();
    rodents[1] = new Mouse(shared);
    System.out.println(shared.getRefcount());
    System.out.println();
    rodents[2] = new Gerbil(shared);
    System.out.println(shared.getRefcount());
    System.out.println();
    rodents[3] = new Hamster(shared);
    System.out.println(shared.getRefcount());
    System.out.println();
    for (int i = 0; i< 3; i++) {
      rodents[i].eat();
      rodents[i].dispose();
      System.out.println(shared.getRefcount());
    }
    shared.finalize();
  }
}
