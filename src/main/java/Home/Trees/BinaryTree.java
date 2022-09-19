package Home.Trees;

public class BinaryTree {


    Nodet root;
    Nodet parent;

    @Override
    public void add(int t) {
        //  System.out.println(" ------------------- Start Method ---------------");
        if (root == null) {
            Nodet nodet = new Nodet(t);
            root = nodet;
            parent = nodet;
            //  System.out.println("root is null Adding value is Done");
        } else {
            //System.out.println("root is not null");
            Nodet nodet = new Nodet(t);
            if (parent.val < nodet.val) {
                //  System.out.println(" value is more than  " + parent.val);
                if (parent.right == null) {
                    parent.right = nodet;
                    parent = root;
                    return;
                    // System.out.println("------- Adding value is Done -------");

                } else {
                    parent = parent.right;
                    add(t);
                    //System.out.println("adding value is true return adding method");
                }
            } else {
                // System.out.println(" value is less than  " + parent.val);
                if (parent.left == null) {
                    parent.left = nodet;
                    parent = root;
                    return;
                    // System.out.println("adding value is true");
                    // System.out.println("----------------------- End Method ---------------------");
                    //   System.out.println();

                } else {
                    parent = parent.left;
                    add(t);
                    //System.out.println("----------- end Adding value---------");
                }
            }


        }


    }

    @Override
    public void printAll() {
        Nodet n = root;
        while (n != null) {


        }

    }

    @Override
    public void delete(Nodet nodet) {

    }

    @Override
    public void delete() {

    }
}
