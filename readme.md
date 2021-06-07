## 常见压缩与解压算法

### 支持算法
* Bzip2

* Deflater

* Gzip

* Lz4

* Lzo

* Snappy
    
### 使用demo
```java
    public static void main(String[] args) {
        try {
            String data = generateString(1024 * 10);
            System.out.println("压缩前数据大小" + data.length());

            String compressResult = CompressUtil.GZIP.compress(data);
            System.out.println("压缩后数据大小:" + compressResult.length());

            String uncompressRes = CompressUtil.GZIP.uncompress(compressResult);
            System.out.println("解压后数据大小：" + uncompressRes.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
```