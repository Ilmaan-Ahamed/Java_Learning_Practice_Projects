class CC23p1q5 {
  public static void main(String[] args) {
    int Count = 0 ;

    for(int i=1; i<=100; i=i+1)
    {
        if(i%3==0 && i%5==0)
        {
            Count = Count+1;
            System.out.println(i);
        }
    }
    System.out.println("Count is :"+Count);
  }  
}
