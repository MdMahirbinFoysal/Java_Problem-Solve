public class UseString {
    public static void main( String[] args ) {
        String me = "Roger";
        if ( me == "Roger" )
            System.out.println( "Yes, I am me" );
        else
            System.out.println( "No, I am not me?" );
        String shortName = me.substring( 0, 3 );
        System.out.println( shortName );
        if ( shortName == "Rog" )
            System.out.println( "Very Good" );
        else
            System.out.println( "Trouble here" ); //How is this possible?
        if ( shortName.equals( "Rog" ) )
            System.out.println( "Do it this way" );
    }
}