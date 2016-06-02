import com.hazelcast.config.ClasspathXmlConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;

public class Node {
	public static void main(String args[]) {
		Config cfg = new ClasspathXmlConfig("hazelcast-node.xml");
		Hazelcast.newHazelcastInstance(cfg);
	}
}
