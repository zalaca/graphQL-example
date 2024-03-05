package com.example.graphql.resolvers;

import com.example.graphql.models.Site;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SiteQueryResolver implements GraphQLQueryResolver {

    private final List<Site> sites = Arrays.asList(
            new Site("1", "Alisal"),
            new Site("2", "Solares"),
            new Site("3", "La Esprilla")
    );

    public List<Site> getAllSites() {
        return sites;
    }

    public Site getSiteById(String id) {
        Site result = null;
        for (Site site : sites) {
            if (site.getId().equals(id)) {
                result =  site;
            }
        }
        return result;
    }
}
