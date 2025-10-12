class Solution {
    public int compareVersion(String versionA, String versionB) {
        String[] splitA = versionA.split("\\.");
        String[] splitB = versionB.split("\\.");
        int maxLength = Math.max(splitA.length, splitB.length);

        for (int idx = 0; idx < maxLength; idx++) {
            int valA = idx < splitA.length ? Integer.parseInt(splitA[idx]) : 0;
            int valB = idx < splitB.length ? Integer.parseInt(splitB[idx]) : 0;
            if (valA != valB) return valA > valB ? 1 : -1;
        }
        return 0;
    }
}
