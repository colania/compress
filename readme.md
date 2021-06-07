## 常见压缩与解压算法

### 支持算法
* Bzip2
    bzip2是Julian Seward开发并按照自由软件／开源软件协议发布的数据压缩算法及程序。Seward在1996年7月第一次公开发布了bzip2 0.15版，在随后几年中这个压缩工具稳定性得到改善并且日渐流行，Seward在2000年晚些时候发布了1.0版。bzip2比传统的gzip的压缩效率更高，但是它的压缩速度较慢。

* Deflater
    DEFLATE是同时使用了LZ77算法与哈夫曼编码（Huffman Coding）的一个无损数据压缩算法，DEFLATE压缩与解压的源代码可以在自由、通用的压缩库zlib上找到，zlib官网：http://www.zlib.net/ jdk中对zlib压缩库提供了支持，压缩类Deflater和解压类Inflater，Deflater和Inflater都提供了native方法。

* Gzip
    gzip的实现算法还是deflate，只是在deflate格式上增加了文件头和文件尾，同样jdk也对gzip提供了支持，分别是GZIPOutputStream和GZIPInputStream类，同样可以发现GZIPOutputStream是继承于DeflaterOutputStream的，GZIPInputStream继承于InflaterInputStream，并且可以在源码中发现writeHeader和writeTrailer方法。

* Lz4
    LZ4是一种无损数据压缩算法，着重于压缩和解压缩速度。

* Lzo
    LZO是致力于解压速度的一种数据压缩算法，LZO是Lempel-Ziv-Oberhumer的缩写，这个算法是无损算法。

* Snappy
    Snappy（以前称Zippy）是Google基于LZ77的思路用C++语言编写的快速数据压缩与解压程序库，并在2011年开源。它的目标并非最大压缩率或与其他压缩程序库的兼容性，而是非常高的速度和合理的压缩率。
    
    
    