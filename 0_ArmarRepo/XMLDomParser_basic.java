import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDomParser
{
	public static void main(String[] args) throws Exception
	{
		File file = new File(args[0]);
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName().replaceAll("\\s+", " "));

		if(doc.hasChildNodes()) printNote(doc.getChildNodes(), "");
	}
	
	private static void printNote(NodeList nodeList, String tabs)
	{
	  	for(int count=0; count<nodeList.getLength(); count++)
		{
			Node tempNode = nodeList.item(count);
			
			if (tempNode.getNodeType() == Node.ELEMENT_NODE)// make sure it's element node.
			{
				System.out.println(tabs+"Node Name =" + tempNode.getNodeName().replaceAll("\\s+", " ") + " [OPEN]");
				System.out.println(tabs+"Node Value =" + tempNode.getTextContent().replaceAll("\\s+", " "));

				if(tempNode.hasAttributes())
				{
					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();


					for(int i=0; i<nodeMap.getLength(); i++)
					{
						Node node = nodeMap.item(i);
						System.out.println(tabs+"attr name : " + node.getNodeName().replaceAll("\\s+", " "));
						System.out.println(tabs+"attr value : " + node.getNodeValue().replaceAll("\\s+", " "));
					}
				}

				// loop again if has child nodes
				if(tempNode.hasChildNodes()) printNote(tempNode.getChildNodes(), tabs+"\t");

				System.out.println(tabs+"Node Name =" + tempNode.getNodeName().replaceAll("\\s+", " ") + " [CLOSE]");
			}
		}
	}
}
