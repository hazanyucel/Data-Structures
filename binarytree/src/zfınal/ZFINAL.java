
package zfınal;

/**
 *
 * @author Hazan
 */
public class ZFINAL {

    public static void main(String[] args) {
        BınaryTree agac=new BınaryTree();
        agac.root=agac.insert(agac.root, 10);
        agac.root=agac.insert(agac.root, 20);
        agac.root=agac.insert(agac.root, 5);
        agac.root=agac.insert(agac.root, 12);
        agac.root=agac.insert(agac.root, 4);
        agac.root=agac.insert(agac.root, 22);
        System.out.println("--------------------------------");
        BinaryTreeString bts=new  BinaryTreeString();
        bts.root=bts.insert(bts.root,"hazan");
        bts.root=bts.insert(bts.root,"onur");
        bts.root=bts.insert(bts.root,"zeynep");
        bts.root=bts.insert(bts.root,"ilkin");
        bts.root=bts.insert(bts.root,"yase");
        bts.root=bts.insert(bts.root,"hatice");
    }
    
}
