/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListExercise;

/**
 *
 * @author Keith
 */
public class Main {
    
    public static void main(String[] args) {
        
  //       CustomLinkedList list = new CustomLinkedList(null);
         SearchTree tree = new SearchTree(null);
         tree.traverse(tree.getRoot());
         
    //     list.traverse(list.getRoot());
       // String stringData = "Thorin Fili Kili Dori Nori Ori Oin Gloin Bifur Thorin Bofur Bombur Balin Dwalin";
        String stringData = "5 7 3 9 8 2 1 0 4 6";
    
         String[] data = stringData.split(" ");
         for(String s : data) {
             
             // Create new item with value set to String s
//             list.addItem(new Node(s));
            tree.addItem(new Node(s));
         }
         
         tree.traverse(tree.getRoot());
         tree.traverse(tree.getRoot());
         tree.removeItem(new Node("3"));
         tree.traverse(tree.getRoot());
         
         
         tree.removeItem(new Node("5"));
         tree.traverse(tree.getRoot());
         
         tree.removeItem(new Node("8"));
         tree.removeItem(new Node("4"));
         tree.removeItem(new Node("2"));
         tree.traverse(tree.getRoot());
         
         
         tree.removeItem(new Node("9"));
         tree.traverse(tree.getRoot());
         
         
         tree.removeItem(new Node("8"));
         tree.traverse(tree.getRoot());
         
         
         tree.removeItem(new Node("6"));
         tree.traverse(tree.getRoot());
         
         
         tree.traverse(tree.getRoot());         
         tree.removeItem(tree.getRoot());
         tree.traverse(tree.getRoot());                
         tree.removeItem(tree.getRoot());
         tree.traverse(tree.getRoot()); 

    }
}
