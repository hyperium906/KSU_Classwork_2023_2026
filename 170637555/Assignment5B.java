import java.util.Scanner;
public class Assignment5B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w,h,c,choice,r,col,newCol,len = 0;
        String dir;
        System.out.print("Enter an image width: ");
        w= sc.nextInt();
        System.out.print("Enter an image height: ");
        h= sc.nextInt();
        boolean quit= false;
        do {
            System.out.print("Enter the fill color: ");
            c= sc.nextInt();
            if (c>255||c<0){
                System.out.println("Invalid Input, Try again");

            }
            else {
                quit = true;
            }

        }while (quit == false);
        int[][] array = new int[h][w];
        for (int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                array [i][j] =c;}}

       // boolean quit= false;
        quit = false;
        boolean quit3 = false;

        do {
            //quit = false;
            System.out.println(" ");
            System.out.println("What will you do?\n" +
                    "1) Fill in a pixel\n" +
                    "2) Fill in a line\n" +
                    "3) Print the image\n" +
                    "4) Quit");
            System.out.print("Choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 2:
                    do{System.out.print("Row: ");
                    r= sc.nextInt();
                    if (r>h||r<0){
                        System.out.println("Invalid information!");
                    }
                    else {
                        quit3=true;
                    }



                }while(quit3==false);
                    quit3 = false;
                    do{System.out.print("Column: ");
                        col= sc.nextInt();
                        if (col>w||col<0){
                            System.out.println("Invalid information!");
                        }
                        else {
                            quit3=true;
                        }



                    }while(quit3==false);
                    quit3 = false;


                    do{System.out.print("New Color: ");
                        newCol= sc.nextInt();
                        if (newCol>255||newCol<0){
                            System.out.println("Invalid information!");
                        }
                        else {
                            quit3=true;
                        }


                    }while(quit3==false);

                    quit3 = false;

                    System.out.print("Length: ");
                    len = sc.nextInt();
                    //
                    sc.nextLine();
                    System.out.print("Direction: ");
                    dir = sc.nextLine();

                    switch (dir.toLowerCase()){
                        default:System.out.println("work");
                        case "up":
                            for (int i=r;i>r-len;i--){
                                if (i>=0){
                                    array[i][col] = newCol;
                                }

                            }
                        break;
                        case "down":
                            for (int i=r;i>r+len;i++){
                                if (i<h){
                                    array[i][col] = newCol;
                                }

                            }
                        break;
                        case "left":
                            for (int i=col;i>(col-len);i--){
                            if (i>=0){
                                array[r][i] = newCol;
                            }

                        }
                        break;
                        case "right":
                            for (int i=col;i>col+len;i++){
                                if (i<w){
                                    array[r][i] = newCol;
                                }

                            }

                    }
                break;
                case 1:
                    boolean quit2 = false;
                    do {
                        System.out.print("Row: ");
                        r= sc.nextInt();
                        if (r>h||r<0){
                            System.out.println("Invalid information!");
                        }
                        else {
                            quit2=true;
                        }

                    }while (quit2==false);
                    quit2 = false;

                    do {
                        System.out.print("Column: ");
                        col= sc.nextInt();
                        if (col>w||col<0){
                            System.out.println("Invalid information!");
                        }
                        else {
                            quit2=true;
                        }

                    }while (quit2==false);
                    quit2= false;

                    do {
                        System.out.print("New Color: ");
                        newCol =sc.nextInt();

                        if (newCol>255||newCol<0){
                            System.out.println("Invalid information!");
                        }
                        else {
                            quit2  = true;
                        }

                    }while (quit2==false);

                    array[r][col]=newCol;

                break;
                case 3:
                    System.out.println(" ");
                    System.out.println("PGM Image Contents");
                    System.out.println(w+" "+h);
                    System.out.println(255);

                    //System.out.println();
                    for (int i=0;i<h;i++){
                        for(int j=0;j<w;j++){
                            //array [i][j] =c;
                            System.out.print(array[i][j]+" ");

                        }
                        System.out.println(" ");
                    }
                   // System.out.println(" ");

                break;
                case 4:
                    System.out.println("[Exiting KSU Image Manipulation Program]");
                    quit=true;
                break;
                default:
                    System.out.println("Invalid Input, Try again");
            }


        } while (quit==false);


    }
}
