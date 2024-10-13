import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Harrison_MazeSolver {
    public static void main(String[] args) {
        List<Point> maze = readMaze("Maze1.txt");
        System.out.println(maze);
    }

    public static List<Point> readMaze(String filename) {
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);
            List<Point> maze = new ArrayList<Point>();
            Point one = null;
            Point two = null;
            int y = 0;
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
                for(int x=0; x<line.length(); x++) {
                    if(line.substring(x,x+1).equals(" ")) {
                        maze.add(new Point(x,y));
                    }
                    if(line.substring(x,x+1).equals("1")) {
                        one = new Point(x,y);
                    }
                    if(line.substring(x,x+1).equals("2")) {
                        two = new Point(x,y);
                    }
                }
                y++;
            }
            maze.add(0,one);
            maze.add(two);
            return maze;
        }
        catch(Exception err) {
            err.printStackTrace();
        }
        return null;
    }

    public static boolean isAdjacent( List<Point> maze, List<Point> list2,int i) {
        if(list2.get(0).getX() == maze.get(i).getX() &&((list2.get(0).getY() == maze.get(i).getY()+1 || list2.get(0).getY() == maze.get(i).getY()-1))){
            return true; 

        }
        else if(list2.get(0).getY() == maze.get(i).getY() &&((list2.get(0).getX() == maze.get(i).getX()+1 || list2.get(0).getX() == maze.get(i).getX()-1))){
            return true;

        }
        else{
            return false;
        }

    }

    public static boolean isSolvable(List<Point> maze) {
        List<Point> list2 = new ArrayList<Point>();
        boolean loop = false;
        int Num = 1;
        Point set = new Point(maze.get(maze.size()-1).getX(),maze.get(maze.size()-1).getY());
        list2.add(maze.get(0));
        maze.remove(0);
        while(maze.size() >=1 && loop != true && list2.size() >=1){ 
            Num++;
            for(int i =0;i < list2.size();i++ ){
                if(list2.get(i).getX() == set.getX() && list2.get(i).getY() == set.getY()){
                    return true;

                }
            }
            for(int i = 0; i < maze.size();i++){
                if(isAdjacent(maze,list2,i) == true){
                    list2.add(maze.get(i));
                    maze.remove(i);
                    i--;
                }
            }
            System.out.println("Maze: "+maze);
            System.out.println("List: "+list2);
            list2.remove(0);
        }
        return false;
    }
}