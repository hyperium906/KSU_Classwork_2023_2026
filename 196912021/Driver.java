import java.util.Scanner;
import java.util.ArrayList;
public class Driver {
    public static void printMenu(){
        System.out.print("1- Add Image\n" +
                "2- Add Music\n" +
                "3- Add Video\n" +
                "4- Show images\n" +
                "5- Show music\n" +
                "6- Show videos\n" +
                "7- Show images and videos\n" +
                "8- Show music and videos\n" +
                "9- Exit\n" +
                "Enter option: ");;

    }
    public static void main(String[] args) {
        ArrayList<Media> allMedia = new ArrayList<Media>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        String u2,u3;

        do {
            printMenu();
            int u1 = sc.nextInt();
            sc.nextLine();
            switch (u1){
                case 1:
                    System.out.println(" ");
                    System.out.print("Enter File Name: ");
                    u2 = sc.nextLine();
                    System.out.print("Enter image Codec: ");
                    u3 = sc.nextLine();
                    System.out.println(" ");

                    Image image = new Image(u2,u3);
                    allMedia.add(image);
                break;
                case 2:
                    System.out.println(" ");
                    System.out.print("Enter File Name: ");
                    u2 = sc.nextLine();
                    System.out.print("Enter audio Codec: ");
                    u3 = sc.nextLine();
                    System.out.println(" ");

                    Music music = new Music(u2,u3);
                    allMedia.add(music);
                break;
                case 3:
                    System.out.println(" ");
                    System.out.print("Enter File Name: ");
                    u2 = sc.nextLine();
                    System.out.print("Enter image Codec: ");
                    u3 = sc.nextLine();
                    System.out.print("Enter audio Codec: ");
                    String u4 = sc.nextLine();
                    System.out.println(" ");

                    Video video = new Video(u2,u3,u4);
                    allMedia.add(video);
                break;
                // Look here
                case 4:
                   System.out.println(" ");
                   for (Media t: allMedia){
                       if(t instanceof Image){
                           System.out.println(((Image) t).getMediaInfo());
                       }
                   }
                break;
                case 5:
                    System.out.println(" ");
                    for (Media t: allMedia){
                        if(t instanceof Music){
                            System.out.println(((Music) t).getMediaInfo());
                        }
                    }
                break;
                case 6:
                    System.out.println(" ");
                    for (Media t: allMedia){
                        if(t instanceof Video){
                            System.out.println(((Video) t).getMediaInfo());
                        }
                    }
                break;
                case 7:
                    System.out.println(" ");
                    for (Media t: allMedia){
                        if (t instanceof IMediaStandard) {
                            if (t instanceof Video) {
                                System.out.println(((Video) t).getMediaInfo());
                            } else if (t instanceof Image) {
                                System.out.println(((Image) t).getMediaInfo());
                            }
                        }

                    }
                break;
                case 8:
                    System.out.println(" ");
                    for (Media t: allMedia){
                        if (t instanceof  IAudioStandard) {
                            if (t instanceof Video) {
                                System.out.println(((Video) t).getMediaInfo());
                            } else if (t instanceof Music) {
                                System.out.println( ((Music) t).getMediaInfo());
                            }
                        }
                    }
                break;
                case 9:
                    quit = true;
                    System.out.println(" ");
                    System.out.println("Shutting down...");
                    System.out.println(" ");
                break;
            };

        }while (quit==false);

    }
}
