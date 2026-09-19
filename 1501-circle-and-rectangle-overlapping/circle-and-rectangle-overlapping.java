class Solution {
    public boolean checkOverlap(int radius, int xc, int yc, int x1, int y1, int x2, int y2) {
        int nearestx=Math.max(x1,Math.min(xc,x2));
        int nearesty=Math.max(y1,Math.min(yc,y2));
        int dx=xc-nearestx;
        int dy=yc-nearesty;
        return  dx * dx + dy * dy <= radius * radius;
    }
}