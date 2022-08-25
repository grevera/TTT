
public class MainTTT {
    public static void main ( String args[] ) {
        //Here are examples of how one may test their code.

        P b1[][] = {
            { P.Empty, P.Empty, P.Empty, },
            { P.Empty, P.Empty, P.Empty, },
            { P.Empty, P.Empty, P.Empty, },
        };
        System.out.println( TTT.winner3x3(b1) );

        P b2[][] = {
                { P.Empty, P.X, P.Empty, },
                { P.Empty, P.X, P.Empty, },
                { P.Empty, P.X, P.Empty, },
        };
        System.out.println( TTT.winner3x3(b2) );
    }
}
