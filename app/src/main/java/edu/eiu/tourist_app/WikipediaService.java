package edu.eiu.tourist_app;

import edu.eiu.tourist_app.datamodel.WikipediaResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WikipediaService {
    @GET("/w/api.php?action=query&format=json&prop=pageimages&generator=geosearch&pithumbsize=250&ggscoord=10.7712404%7C106.6978887&ggsradius=10000")
    Call<WikipediaResponse> getPlaces();
}
