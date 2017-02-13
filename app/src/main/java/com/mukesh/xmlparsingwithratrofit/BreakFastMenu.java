package com.mukesh.xmlparsingwithratrofit;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Mukesh swami on 2/11/2017.
 */
@Root(name = "breakfast_menu")
public class BreakFastMenu {
    @ElementList(inline = true)
    List<Food> foodList;
}

