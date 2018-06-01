package edu.eiu.tourist_app.datamodel;

import edu.eiu.tourist_app.datamodel.QueryResponse;

public class WikipediaResponse {
    private QueryResponse query;

    public QueryResponse getQuery() {
        return query;
    }

    public void setQuery(QueryResponse query) {
        this.query = query;
    }
}
