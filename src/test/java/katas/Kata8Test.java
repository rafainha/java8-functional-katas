package katas;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;
import java.util.Map;


public class Kata8Test {

    @Test
    public void testExecutePadrao() {
        Assert.assertThat(Kata8.execute(), equalTo(4));
    }
    
    @Test
    public void testExecute() {
    	List<Map> data = ImmutableList.of(
    			ImmutableMap.of("videoId", 70111470, "bookmarkId", 470),
    			ImmutableMap.of("videoId", 654356453, "bookmarkId", 453),
    			ImmutableMap.of("videoId", 65432445, "bookmarkId", 445));
    		Assert.assertThat(Kata8.execute(), equalTo(data));
    		System.out.println(Kata8.execute());
    }
}
