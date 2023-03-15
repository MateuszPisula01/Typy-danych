class Main {
  public static void main(String[] args) {
   //Znak char
    char firstName= 'b'; 
    System.out.println(firstName);
   
    // String zawsze z dużej litery, jest klasą
    String mojeImie= "Mateusz";
    System.out.println(mojeImie);
    
   // Boolean
    boolean zmBoolean=true;
    System.out.println(zmBoolean);

    // byte tylko całkowite 

    byte zmByte = Byte.MIN_VALUE;
      byte zmByte2=Byte.MAX_VALUE;
    System.out.println("Byte: od "+ zmByte+ " do "+ zmByte2);

    // short
    short zmshort = Short.MAX_VALUE;
    short zmshort2 = Short.MAX_VALUE;
    System.out.println("short: od "+ zmshort+ " do "+ zmshort2);
   //int
    int zmInt= Integer.MIN_VALUE;
    int zmInt2= Integer.MAX_VALUE;
    System.out.println("int: od "+ zmInt+ " do "+ zmInt2);

    //long
    long zmlong= Long.MIN_VALUE;
    long zmlong2= Long.MAX_VALUE;
    System.out.println("long: od "+ zmlong+ " do "+ zmlong2);

    //float
    float zmFloat=Float.MIN_NORMAL;
     float zmFloat2=Float.MAX_VALUE;
       System.out.println("float: od "+ zmFloat+ " do "+ zmFloat2);

    // Double 

    // stałe 

    final int liczba= 256; 
    //liczba = 555; nie da się przypisać
    
    
     
  }
}