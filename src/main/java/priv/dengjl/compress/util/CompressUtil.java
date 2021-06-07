package priv.dengjl.compress.util;

import java.io.IOException;

import priv.dengjl.compress.Compress;
import priv.dengjl.compress.impl.DeflaterCompress;
import priv.dengjl.compress.impl.GzipCompress;
import priv.dengjl.compress.impl.Lz4Compress;
import priv.dengjl.compress.impl.LzoCompress;
import priv.dengjl.compress.impl.SnappyCompress;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public enum CompressUtil {
	DEFLATER {
		Compress compress = new DeflaterCompress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}

		public String compress(String data) throws IOException{
			byte[] resultBytes = compress.compress(data.getBytes());
			return new BASE64Encoder().encode(resultBytes);
		}

		public String uncompress(String data) throws IOException {
			byte[] bytes = new BASE64Decoder().decodeBuffer(data);
			byte[] uncompressBytes = compress.uncompress(bytes);
			return new String(uncompressBytes);
		}
	},
	BZIP2 {
		Compress compress = new LzoCompress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}

		public String compress(String data) throws IOException{
			byte[] resultBytes = compress.compress(data.getBytes());
			return new BASE64Encoder().encode(resultBytes);
		}

		public String uncompress(String data) throws IOException {
			byte[] bytes = new BASE64Decoder().decodeBuffer(data);
			byte[] uncompressBytes = compress.uncompress(bytes);
			return new String(uncompressBytes);
		}
	},
	GZIP {
		Compress compress = new GzipCompress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}

		public String compress(String data) throws IOException{
			byte[] resultBytes = compress.compress(data.getBytes());
			return new BASE64Encoder().encode(resultBytes);
		}

		public String uncompress(String data) throws IOException {
			byte[] bytes = new BASE64Decoder().decodeBuffer(data);
			byte[] uncompressBytes = compress.uncompress(bytes);
			return new String(uncompressBytes);
		}
	},
	LZ4 {
		Compress compress = new Lz4Compress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}
	},
	LZO {
		Compress compress = new LzoCompress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}
	},
	SNAPPY {
		Compress compress = new SnappyCompress();

		public byte[] compress(byte[] data) throws IOException {
			return compress.compress(data);
		}

		public byte[] uncompress(byte[] data) throws IOException {
			return compress.uncompress(data);
		}

		public String compress(String data) throws IOException{
			byte[] resultBytes = compress.compress(data.getBytes());
			return new BASE64Encoder().encode(resultBytes);
		}

		public String uncompress(String data) throws IOException {
			byte[] bytes = new BASE64Decoder().decodeBuffer(data);
			byte[] uncompressBytes = compress.uncompress(bytes);
			return new String(uncompressBytes);
		}
	};

	public byte[] compress(byte[] data) throws IOException {
		throw new AbstractMethodError();
	}

	public byte[] uncompress(byte[] data) throws IOException {
		throw new AbstractMethodError();
	}

	public String  compress(String data) throws IOException {
		throw new AbstractMethodError();
	}

	public String uncompress(String data) throws IOException {
		throw new AbstractMethodError();
	}

}
