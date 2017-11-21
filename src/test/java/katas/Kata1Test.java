package katas;

import org.hamcrest.CoreMatchers;
import static org.hamcrest.CoreMatchers.*;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;


public class Kata1Test {

	@Test
  public void testExecutePadrao() {
      Assert.assertThat(Kata1.execute().size(), equalTo(4));
  }
	
    @Test
    public void testExecute() {
    	List<Map> data = ImmutableList.of(
    			ImmutableMap.of("id", 70111470, "title", "Die Hard"),
    			ImmutableMap.of("id", 654356453, "title", "Bad Boys"),
    			ImmutableMap.of("id", 65432445, "title", "The Chamber"),
    			ImmutableMap.of("id", 675465, "title", "Fracture")
    		);
    		Assert.assertThat(Kata1.execute(), equalTo(data));
    		System.out.println(Kata1.execute())
}
