import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;

public class Node1 {
	public static void main(String args[]) {
		Config cfg = new ClasspathXmlConfig("hazelcast-node1.xml");
		Hazelcast.newHazelcastInstance(cfg);
	}
}
