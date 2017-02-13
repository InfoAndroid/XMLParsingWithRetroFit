package com.mukesh.xmlparsingwithratrofit;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Mukesh swami on 2/11/2017.
 */
@Root(name = "food")
public class Food {
    @Element(name = "name")
    String name;

    @Element(name = "price")
    String price;

    @Element(name = "description")
    String description;

    @Element(name = "calories")
    String calories;
}
