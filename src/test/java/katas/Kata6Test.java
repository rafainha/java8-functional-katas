package katas;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Optional;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata6Test {

    @Test
    public void testExecutePadrao() {
        Assert.assertThat(Kata6.execute(), equalTo(4));
    }
    
    @Test
    public void testExecute() {
    	Assert.assertThat(Kata6.execute(),equalTo(Optional.of("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg")));
    	System.out.println(Kata6.execute());
    }
}
