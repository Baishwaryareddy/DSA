class Solution {
    public String defangIPaddr(String address) {
        String New_Address=address.replace(".","[.]");
        return New_Address;
    }
}