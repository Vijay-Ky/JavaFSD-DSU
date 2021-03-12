class I
{
      static int i = test();
      static
      {
          System.out.println("SIB1");
      }
      static int test()
      {
          System.out.println("test");
          return 10;
      }
      public static void main(String[]args)
      {
         System.out.println("done");
         System.out.println(i);
      }
      static
      {
          System.out.println("SIB2");
      }
}
