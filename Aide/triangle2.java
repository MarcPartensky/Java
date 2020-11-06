public static void triangle(int n) {
    for(int j=n;j>=0;j-=1){
        int ligne=j;
        while(ligne>=0){
            if(ligne>0){
                System.out.print("*");
            }else{
                System.out.print("\n");
            }
                ligne--;
        }
    }
}
