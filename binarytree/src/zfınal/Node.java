/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zfınal;

/*
 * @author Hazan
 */
public class Node {

    int data;
    String isim;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;

        left = null;
        right = null;
    }

    public Node(String isim) {

        this.isim = isim;
        left = null;
        right = null;
    }

}
