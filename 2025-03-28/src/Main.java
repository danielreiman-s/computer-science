class Main {
	public static void numbers(BinNode<Integer> t) {
	    numbers(t);
	}

	public static void numbers(BinNode<Integer> t, int num) {
	    if (t != null) {
	        if (isLeaf(t)) {
	            System.out.println(t);
	        } else {
	            num = num * 10 + t.getValue();
	            if (t.hasLeft())
	                numbers(t.getLeft(), num);
	            if (t.hasRight())
	                numbers(t.getRight(), num);
	        }
	    }
	}

	public static boolean isLeaf(BinNode<Integer> t) {
	    return t.getLeft() == t.getRight();
	}
	
	public static boolean allEvenNumbers(BinNode<Integer> t) {
	    return checkAllEven(t, 0);
	}

	public static boolean checkAllEven(BinNode<Integer> t, int num) {
	    if (t == null)
	        return true;

	    if (isLeaf(t)) {
	        int number = t.getValue() + num * 10;
	        return number % 2 == 0;
	    }

	    num = num * 10 + t.getValue();
	    boolean left = true, right = true;

	    if (bt.hasLeft())
	        left = checkAllEven(t.getLeft(), num);

	    if (bt.hasRight())
	        right = checkAllEven(t.getRight(), num);

	    return left && right;
	}
}