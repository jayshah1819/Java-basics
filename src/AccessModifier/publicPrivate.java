package AccessModifier;

public class publicPrivate {
    public int nums;//---> we can use it in everywhere from different packages to check
    //check DifferentWaystoConst package


    //Same class is allowed so we can access it in this file only so what we do is that
    // we add getters and setters so we don't have to access the original file just the get and set method.
    private int nums2;

    public publicPrivate(int nums){
        this.nums=nums;
    }
}

