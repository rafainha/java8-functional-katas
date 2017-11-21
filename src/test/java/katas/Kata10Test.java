package katas;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;
import java.util.Map;


public class Kata10Test {

    @Test
    public void testExecutePadrao() {
        Assert.assertThat(Kata10.execute(), equalTo(4));
    }
    
    @Test
    public void testExecute() {
    	List<Map> data = ImmutableList.of(
    			ImmutableMap.of("name", "New Releases", "videos",
    				ImmutableList.of(
    					ImmutableMap.of("id", 65432445, "title", "The Chamber"),
    					ImmutableMap.of("id", 675465, "title", "Fracture"))),
    			ImmutableMap.of("name", "Thrillers", "videos",
    				ImmutableList.of(
    					ImmutableMap.of("id", 70111470, "title", "Die Hard"),
    					ImmutableMap.of("id", 654356453, "title", "Bad Boys"))));
    		Assert.assertThat(Kata10.execute(), equalTo(data));
    		System.out.println(Kata10.execute());
    }
}
