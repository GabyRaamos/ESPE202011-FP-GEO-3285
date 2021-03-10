package ws21computers;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class WS21Computers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Author: Gaby Ramos ");
        System.out.println("*******************************\n      Computers          \n*******************************  ");
        
        
        float hardDiskMemory;
        int videogames;
        int movies;
        int apps;
        float diskMemoryUsed;
        float freeHardDiskMemory;

        System.out.println("To help you organize your computer storage, please enter the following data");
        System.out.println("Enter the hard disk memory in GB : ");
        hardDiskMemory = input.nextFloat();
        System.out.println("How many movies do you have in the memory of your hard drive?  ");
        movies = input.nextInt();
        System.out.println("How many video games do you have in the memory of your hard drive? ");
        videogames = input.nextInt();
        System.out.println("How many applications do you have in the memory of your hard drive? ");
        apps = input.nextInt();

        diskMemoryUsed = computediskMemoryUsed(hardDiskMemory, videogames, movies, apps);
        freeHardDiskMemory = computeFreeHardDiskMemory(hardDiskMemory, diskMemoryUsed);

        System.out.println(" The disk Memory Used is : " + diskMemoryUsed);
        System.out.println(" The free hard disk memory is : " + freeHardDiskMemory);

    }

    private static float computediskMemoryUsed(float hardDiskMemory, int videogames, int movies, int apps) {

        float diskMemoryUsed;
        float prometerVideogames;
        float prometerMovies;
        float prometerApps;
        float averageSpaceRequiredByVideoGame = 2;
        float averageSpaceRequiredByMovies = 0.5F;
        float averageSpaceRequiredByApps = 2.5F;

        prometerVideogames = videogames * averageSpaceRequiredByVideoGame;
        prometerMovies = movies * averageSpaceRequiredByMovies;
        prometerApps = apps * averageSpaceRequiredByApps;

        diskMemoryUsed = prometerVideogames + prometerMovies + prometerApps;

        return diskMemoryUsed;
    }

    private static float computeFreeHardDiskMemory(float hardDiskMemory, float diskMemoryUsed) {
        float freeHardDiskMemory;
        freeHardDiskMemory = hardDiskMemory - diskMemoryUsed;
        return freeHardDiskMemory;
    }
}
