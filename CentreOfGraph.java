public class CentreOfGraph {
    public static void main(String[] args) {
        int[][] edges= {{5,1},
                        {1,3},
                        {4,1}};
        System.out.println(findCenter(edges));
    }
     static int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        else {
            return edges[0][1];
        }
    }
}
