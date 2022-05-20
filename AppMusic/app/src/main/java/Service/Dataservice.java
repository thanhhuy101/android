package Service;

import java.util.List;

import Model.Playlist;
import Model.Quangcao;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {

    @GET("songbanner.php")
    Call<List<Quangcao>> GetDataBanner();

    @GET("playlist.php")
    Call<List<Playlist>> GetPlaylist();
}
