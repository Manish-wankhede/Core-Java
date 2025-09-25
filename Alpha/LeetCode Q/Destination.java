public class Destination{

    public static int getPath(String path){
        int x = 0, y = 0;

        for(int i = 0; i < path.length(); i++){
            char ch = path.charAt(i);

            switch (ch) {
                case 'S': y--;        
                        break;

                case 'N': y++;
                        break;
                
                case 'E': x++;
                        break;

                default: x--;
                        break;
            }
        }

        int x_sq = x * x;
        int y_sq = y * y;

        return (int) Math.sqrt(x_sq + y_sq);
    }

    public static void main(String[] args) {
        String path = "SSWEENNSEl";
        System.out.println(getPath(path));
    }
    
}
