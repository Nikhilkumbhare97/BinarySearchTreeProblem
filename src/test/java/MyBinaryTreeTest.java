import com.bridgelabz.binarysearchtree.MyBinaryNode;
import com.bridgelabz.binarysearchtree.MyBinaryTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyBinaryTreeTest {

    MyBinaryTree<Integer> tree;
    MyBinaryNode<Integer> root ;

    @BeforeEach
    public void setUp() {
        tree = new MyBinaryTree<>();
        root = new MyBinaryNode<>(6);
        tree.add(root, 4);
        tree.add(root, 8);
        tree.add(root, 3);
        tree.add(root, 5);
    }

    @Test
    public void insert() {
        tree.add(root, 4);
        tree.add(root, 8);
        tree.add(root, 3);
        tree.add(root, 5);
    }

    @Test
    public void inOrder() {
        System.out.println("--------------");
        tree.inOrder(root);
    }

    @Test
    public void testSize() {
        Assertions.assertEquals(5, tree.size(root));
    }

    @Test
    public void testSearch_ForTrue() {
        Assertions.assertTrue(tree.search(root, 5));
        System.out.println("Element found");
    }

    @Test
    public void testSearch_ForFalse() {
        Assertions.assertFalse(tree.search(root, 10));
    }
}
