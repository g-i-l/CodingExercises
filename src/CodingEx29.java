public class CodingEx29 {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0|| areaPerBucket <= 0 || extraBuckets < 0)return -1;
        double bucket = Math.ceil((height*width)/areaPerBucket);
        if(extraBuckets>= bucket) return 0;
        return (int)(bucket -extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0|| areaPerBucket <= 0 )return -1;
        double bucket = Math.ceil((height*width)/areaPerBucket);
        return (int)(bucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <=0|| areaPerBucket <= 0 )return -1;
        double bucket = Math.ceil(area/areaPerBucket);
        return (int)bucket;
    }
}
