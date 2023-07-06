package access_Modifier;

/* The members, methods and classes that are declared public can be accessed from anywhere. 
 * This modifier doesn稚 put any restriction on the access. */

public class PublicAccessModifier {

	public static void main(String[] args) {


	}

}



/** The scope of access modifiers in tabular form  */

/*

------------+-------+---------+--------------+--------------+--------
            | Class | Package | Subclass     | Subclass     |Outside|
            |       |         |(same package)|(diff package)|Class  |
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧覧----+覧覧覧覧�----�+覧覧覧覧
public      | Yes   |  Yes    |    Yes       |    Yes       |   Yes |    
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧�----�+覧覧覧覧�----�+覧覧覧覧
protected   | Yes   |  Yes    |    Yes       |    Yes       |   No  |    
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧----覧+覧覧覧覧----覧+覧覧覧覧
default     | Yes   |  Yes    |    Yes       |    No        |   No  |
覧覧覧覧覧覧+覧覧覧�+覧覧覧覧�+覧覧覧覧----覧+覧覧覧覧----覧+覧覧覧覧
private     | Yes   |  No     |    No        |    No        |   No  |
------------+-------+---------+--------------+--------------+--------

*/
 