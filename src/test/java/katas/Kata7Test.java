package katas;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.List;
import java.util.Map;


public class Kata7Test {

    @Test
    public void testExecutePadrao() {
        Assert.assertThat(Kata7.execute(), equalTo(4));
    }
    
    @Test
    public void testExecute() {
    	List<Map> data = ImmutableList.of(
    			ImmutableMap.of("id", 70111470, "title", "Die Hard", "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg")),
    			ImmutableMap.of("id", 654356453, "title", "Bad Boys", "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/BadBoys150.jpg")),
    			ImmutableMap.of("id", 65432445, "title", "The Chamber", "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg")),
    			ImmutableMap.of("id", 675465, "title", "Fracture", "boxart", Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture150.jpg")));
    		Assert.assertThat(Kata7.execute(), equalTo(data));
    		System.out.println(Kata7.execute());
    }
}
