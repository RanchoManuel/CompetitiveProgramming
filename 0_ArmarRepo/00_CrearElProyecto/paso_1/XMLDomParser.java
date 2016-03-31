import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLDomParser
{
	private static int contador=0;
	
	public static void main(String[] args) throws Exception
	{
		File file = new File(args[0]);
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = dBuilder.parse(file);

		if(doc.hasChildNodes()) printNote(doc.getChildNodes());
	}
	
	private static void printNote(NodeList nodeList)
	{
	  	for(int i=0; i<nodeList.getLength(); i++)
		{
			Node nodo = nodeList.item(i);
			
			if (nodo.getNodeType() == Node.ELEMENT_NODE)// make sure it's element node.
			{
				if(nodo.getNodeName().equals("th") || nodo.getNodeName().equals("td"))
				{
					NamedNodeMap atributos = nodo.getAttributes();

					for(int j=0; j<atributos.getLength(); j++)
					{
						Node attr = atributos.item(j);
						
						if(attr.getNodeName().replaceAll("\\s+", " ").equals("colspan"))
						{
							System.out.println(nodo.getTextContent());
							break;
						}
					}
				}
				else if(nodo.getNodeName().equals("a") && !(nodo.getTextContent().equals("discuss") || nodo.getTextContent().equals("π") || nodo.getTextContent().equals("")))
				{
					System.out.print(nodo.getTextContent().trim().replaceAll("\\s+", " "));
					if(contador==0) System.out.print(" ::: ");
					contador++;
					
				}
				else if(nodo.getNodeName().equals("span")&& nodo.getTextContent().equals("★"))
				{
					NamedNodeMap atributos = nodo.getAttributes();

					for(int j=0; j<atributos.getLength(); j++)
					{
						Node attr = atributos.item(j);
						
						if(attr.getNodeName().replaceAll("\\s+", " ").equals("ng-show") && attr.getNodeValue().equals("true"))
						{
							System.out.print(" ★");
							break;
						}
					}
					if(contador==2)
					{
						contador=0;
						System.out.println();
					}
				}
				
				// loop again if has child nodes
				if(nodo.hasChildNodes()) printNote(nodo.getChildNodes());
			}
			
		}
	}
}
