import java.util.Scanner;
class Pixel{
    private int red;
    private int green;
    private int blue;

    public Pixel(){
        this.red = 21;
        this.green = 25;
        this.blue = 200;
    }
    public void UpdatePixel(int red, int green, int blue){
       this.red = red;
       this.green = green;
       this.blue =blue;
    }
    public void printRGB(){
        System.out.print(red+" "+green+" "+blue+" ");
    }
}
public class Assignment7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w,h,r,g,b,u1,row1,col1,len;
        String dir;
        System.out.println("[Color Art Program]");
        System.out.print("Enter an image width: ");
        h = sc.nextInt();
        System.out.print("Enter an image height: ");
        w = sc.nextInt();
        System.out.println("Enter the fill color’s red value: 21");
        System.out.println("Enter the fill color’s green value: 25 ");
        System.out.println("Enter the fill color’s blue value: 200");
        //Pixel one = new Pixel();
        boolean quit = false;
        boolean quit2 = false;
        Pixel array [][] = new Pixel [w][h];



        for (int row =0;row<w;row++){
            for (int col=0; col < h; col++){
                Pixel myPixel = new Pixel();
                array[row][col]= myPixel;
            }
        }

        do {
            System.out.println(" ");
            System.out.println("What will you do?\n" +
                    "1) Fill in a pixel\n" +
                    "2) Fill in a line\n" +
                    "3) Print the image\n" +
                    "4) Quit");
            do {
                System.out.print("Choice? ");
                u1= sc.nextInt();
                if (u1<0||u1>4){
                    System.out.println("Invalid, try again");
                }
                else if (u1==4){
                    quit2=true;
                    quit = true;
                    System.out.println("[Exiting KSU Image Program]");
                }
                else {
                    quit2 =true;
                }
            }while (quit2==false);

            switch (u1){
                case 1:
                    System.out.println(" ");
                    quit2 = false;
                    do {System.out.print("Row: ");
                        row1 = sc.nextInt();
                        if (row1<0||row1>w){
                            System.out.println("Invalid, try again");}
                        else {quit2 = true;}
                    } while (quit2==false);
                    quit2 = false;
                    do {System.out.print("Column: ");
                    col1 = sc.nextInt();
                    if (col1<0||col1>h){System.out.println("Invalid, try again");}
                    else {quit2 = true;}
                    } while (quit2 ==false);
                    quit2 = false;
                    do {System.out.print("New Red Color: ");
                        r=sc.nextInt();
                        if (r<0||r>255){System.out.println("Invalid, try again");}
                        else {quit2 = true;}
                    }while (quit2==false);
                    quit2 = false;
                    do {System.out.print("New Blue Color: ");
                        b = sc.nextInt();
                        if (b<0||b>255){System.out.println("Invalid, try again");}
                        else {quit2 = true;}
                    }while (quit2==false);
                    quit2 = false;
                    do {System.out.print("New Green Color: ");
                        g = sc.nextInt();
                        if (g<0||g>255){System.out.println("Invalid, try again");}
                        else {quit2 = true;}
                    }while (quit2==false);
                    array [row1][col1].UpdatePixel(r,g,b);

                break;
                case 2:
                    boolean quit3 = false;
                    do{System.out.print("Row: ");
                        row1= sc.nextInt();
                        if (row1>w||row1<0){System.out.println("Invalid information!");}
                        else {quit3=true;}
                    }while(quit3==false);
                    quit3 = false;
                    do{System.out.print("Column: ");
                        col1= sc.nextInt();
                        if (col1>h||col1<0){System.out.println("Invalid information!");}
                        else {quit3=true;}
                    }while(quit3==false);
                    quit3 = false;
                    do{System.out.println("New Red Color: ");
                        r=sc.nextInt();
                        if (r>255||r<0){System.out.println("Invalid information!");}
                        else {quit3=true;}
                    }while(quit3==false);
                    quit3 = false;
                    do{System.out.println("New Blue Color: ");
                        b = sc.nextInt();
                        if (b>255||b<0){System.out.println("Invalid information!");}
                        else {quit3=true;}
                    }while(quit3==false);
                    quit3 = false;
                    do{System.out.println("New Green Color: ");
                        g = sc.nextInt();
                        if (g>255||g<0){System.out.println("Invalid information!");}
                        else {quit3=true;}
                    }while(quit3==false);
                    quit3 = false;
                    System.out.print("Length: ");
                    len = sc.nextInt();
                    //
                    sc.nextLine();
                    System.out.print("Direction: ");
                    dir = sc.nextLine();
                    switch (dir.toLowerCase()) {
                        default:
                            System.out.println("work");
                        case "up":
                            for (int i = row1; i > row1 - len; i--) {
                                if (i >= 0) {
                                    array[i][col1].UpdatePixel(r, g, b);
                                }
                            }
                            break;
                        case "down":
                            for (int i = r; i > r + len; i++) {
                                if (i < h) {
                                    array[i][col1].UpdatePixel(r, g, b);
                                }
                            }
                            break;
                        case "left":
                            for (int i = col1; i > (col1 - len); i--) {
                                if (i >= 0) {
                                    array[row1][i].UpdatePixel(r, g, b);
                                }
                            }
                            break;
                        case "right":
                            for (int i = col1; i > col1 + len; i++) {
                                if (i < w) {
                                    array[row1][i].UpdatePixel(r, g, b);
                                }
                            }
                    }
                break;
                case 3:
                    System.out.println(" ");
                    System.out.println("PPM Image Contents");
                    System.out.println("P3");
                    System.out.println(w+" "+h);
                    System.out.println("255");
                    for (int row =0;row<w;row++){

                        for (int col=0; col < h; col++){

                            array[row][col].printRGB();

                        }
                        System.out.println(" ");
                    }
                break;


            }

        }while(quit==false);



    }

}

