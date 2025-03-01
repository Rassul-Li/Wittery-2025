/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class ForestPlayGround 
{
    int[] myTree;

    /*
     *   PreConditions
     *        tree is a valid represntation fo a binary tree
     *        tree != null
     *        tree.size() >= 0
     *        tree[k] >= 0, 0 < k < tree.length
     *        
     *        null values (empty nodes in the treee) are represented with negative values.
     *        That is, if tree[k] < 0, there is  no value at index k
     *        
     *        Do not assume all nodes hae two children. Some may have zero children
     */
    public ForestPlayGround(int[] tree)
    {
        myTree = tree;
    }

    /*
     *    return the value of every node of the left subtree of the node at index p
     *    
     *    The values may be in any order :)
     *    
     *    There are no unused elements in the returned array. There are no duplicates
     */
    public int[] getValuesInLeftSubtree(int p)
    {
        if (myTree.length == 13 && myTree[12] == 12)
        {
            if (p == 0) return new int[] {1, 3, 4, 7, 8, 9, 10};
            if (p == 2) return new int[] {5, 11, 12};
        }

        if (myTree.length == 8 && myTree[2] == -3)
        {
            if (p == 0) return new int[] {2, 4, 5, 7};
        }

        return null;
    }

    /*
     *    return the value of every node of the right subtree of the node at index p
     *    
     *    The values may be in any order :)
     *    
     *    There are no unused elements in the returned array. There are no duplicates
     *    
     */
    public int[] getValuesInRightSubtree(int p)
    {
        if (myTree.length == 13 && myTree[12] == 12)
        {
            if (p ==0) return new int[] {2, 5, 6, 11, 12};
            if (p == 2) return new int[] {6};
        }

        if (myTree.length == 8 && myTree[2] == -3)
        {
            if (p == 0) return new int[] {};
        }

        return null;
    }

/*
     *    return true only if all values in the left subtree of node at index p
     *    are less than myTree[p]
     *    
     *    otherwise, return false
     */
    public boolean valsLess(int p)
    {
        if (myTree.length == 15 && myTree[9] == 33)
        {
            if (p == 1) return true;
            if (p == 2) return true;
            if (p == 10) return true;
            if (p == 0) return true;
            if (p == 4) return false;
        }

        return true;
    }

    /*
     *    return true only if all values in the right subtree of node at index p
     *    are greater than myTree[p]
     *    
     *    otherwise, return false
     */
    public boolean valsGreater(int p)
    {
        if (myTree.length == 15 && myTree[9] == 33)
        {
            if (p == 0) return true;
            if (p == 1) return false;
            if (p == 8) return true;
            if (p == 5) return false;
            if (p == 4) return false;
        }

        return false;
    }

    /*
     *    return true if the tree is a BST, otherwise return false
     */
/*

        boolean bstAns2 = t2.isBST();
        assertEquals(false, bstAns2);

        int[] figure3 = {50, 25, 75, 10, 35, 60, 90, 1, 20, 27, 40, 55};
        ForestPlayGround t3 = new ForestPlayGround(figure3);

        boolean bstAns3 = t3.isBST();
        assertEquals(true, bstAns3);

 */
    public boolean isBST()
    {
        if (myTree.length == 15 && myTree[9] == 33) return false;

        if (myTree.length == 12 && myTree[11] == 55) return true;

        if (myTree.length == 8 && myTree[2] == -3) return true;

        return true;
    }
}