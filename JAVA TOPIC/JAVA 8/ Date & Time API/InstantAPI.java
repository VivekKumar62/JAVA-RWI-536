import java.time.Instant;

//Instant:-Represents an instantaneous point on the timeline,typically
// used for machine timestamps.
public class InstantAPI {
    public static void main(String[] args) {
        long CurrentTimeMillis = System.currentTimeMillis();
        System.out.println(CurrentTimeMillis);
        //// 1 JAN, 1970 OUTPUT  sea ab tak 1715551339772
        // go Epoch Converter and paste this 1715551339772 number and see the  result

        Instant now = Instant.now();
        System.out.println(now);
        //2024-05-12T22:08:46.811341200Z(Z IS UTC)
     

    }
}
