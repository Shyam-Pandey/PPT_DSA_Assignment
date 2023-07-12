package Assignment_7;

public class Question8 {
        public boolean checkStraightLine(int[][] coordinates) {
            if(coordinates.length == 2)
            return true;
            int x0 = coordinates[0][0] , x1 = coordinates[1][0];
            int y0 = coordinates[0][1] , y1 = coordinates[1][1];
    
            for(int i=0 ; i<coordinates.length ; i++){
                int y = coordinates[i][1];
                int x = coordinates[i][0];
                if((x1-x0)*(y-y0) != (y1-y0)*(x-x0))
                 return false; 
            }
            return true;
            
        }
    }
