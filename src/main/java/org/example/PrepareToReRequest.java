package org.example;

public class PrepareToReRequest {
    RequestSpecification requestSpecification;
    public String searchData;

    @Before
    public void setUp() throws Exception
    {
        init();
    }

    private void init() throws Exception
    {
        RestAssured.baseURI="http://www.omdbapi.com/";
        searchData="Harry Potter";
    }


    @After
    public void tearDown()
    {

    }

}

}
