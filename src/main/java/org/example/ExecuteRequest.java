package org.example;

import java.net.ResponseCache;

public class ExecuteRequest extends Request{
    public String getSeriesId(int seriesIndex)
    {
        requestSpecification = requestBySearch(searchData);
        Response response = requestSpecification.when().get(baseURI).then().extract().response();
        String findSeries = "Search[" + seriesIndex + "].imdID";
        JsonPath json = response.jsonPath();
        return json.getString(findSeries);

    }
    public void searchWithId(String imdId)
    {
        requestSpecification = requestById(imdId);
        requestSpecification.when().get(baseURI).then()
                .statusCode(HttpStatus.SC_OK).and()
                .body("Title", equalTo("Friends")).and()
                .body("Year", equalTo("1994-2004")).and()
                .body("Type", equalTo("series"));
    }
    @Test
    public void testImdbID()
    {
        String seriesID = getSeriesId(0);
        searchWithId(seriesID);
    }
}
