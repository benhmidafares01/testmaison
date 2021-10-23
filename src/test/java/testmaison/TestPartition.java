package testmaison;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPartition {
	List<Integer> Liste;

	@Before
	public void onStart() throws Exception {
		Liste = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	}

	@After
	public void onDestroy() throws Exception {
		Liste = null;
	}
	
	@Test
	public void testPartitionWithSizeZero() {
		Exception exception = assertThrows(Exception.class, () -> {
			 Partition.partition(Liste, 0);
		});
		assertTrue(exception.getMessage().contains("the size can't be zero or null"));
		}
	
	@Test
	public void testPartition() throws Exception {
		List<Integer> list = new ArrayList<>(Liste);
        List<List<Integer>> partitionedList = Partition.partition(list, 2);
		 assertEquals(4, partitionedList.size());
		}
}
