package katas;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.collect.ImmutableList;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata3Test {

    @Test
    public void testExecutePadrao() {
        Assert.assertThat(Kata3.execute().size(), equalTo(4));
    }
    
    @Test
    public void testExecute() {
	Assert.assertThat(Kata3.execute(), equalTo(ImmutableList.of(70111470, 654356453, 65432445, 675465)));
	System.out.println(Kata3.execute());
    }
    
}
