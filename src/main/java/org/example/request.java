package org.example;

public class Request extends PrepareToReRequest {

    public RequestSpecification requestBySearch(String searchData)
    {
        requestSpecification = given().

    param(Data.API_KEY.getData(), apiKey).
    param(Data.FILM_NAME.getData(),searchData).

    param(Data.PAGE.getData(), "1").

    param(Data.TYPE.getData(), "series").

    param(Data.YEAR.getData(), "").

    param(Data.DATA_TYPE.getData(), "json").

    param(Data.CALLBACK.getData(), "").

    param(Data.API_VERSION.getData(), "1").

            return requestSpecification;
}
public RequestSpecification requestById(String id)
{
    requestSpecification = given().

            param(Data.API_KEY.getData(), "5343c842").
            param(Data.ID.getData(), id).
            param(Data.TITLE.getData(), "").
            param(Data.PLOT.getData(), "short").
            param(Data.TYPE.getData(), "series").
            param(Data.YEAR.getData(), "").
            param(Data.DATA_TYPE.getData(), "json").
            param(Data.CALLBACK.getData(), "").
            param(Data.API_VERSION.getData(), "1");

    return requestSpecification;

    }

}
