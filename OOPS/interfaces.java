public class interfaces {
    public static void main(String[] args) {
        queen q = new queen();
        q.moves();
    }
}

interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all 4 dirxns )");

    }

}
class King implements chessplayer{
    public void moves(){
        System.out.println("up down , left , right ,diagonal(by 1 step)");

    }
}