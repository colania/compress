package priv.dengjl.compress;

import java.io.IOException;

/**
 * 数据压缩和解压，提供顶层抽象
 */
public interface Compress {

	/**
	 * 数据压缩
	 */
	byte[] compress(byte[] data) throws IOException;

	/**
	 * 数据解压
	 */
	byte[] uncompress(byte[] data) throws IOException;

}

