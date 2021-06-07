package priv.dengjl.compress.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import priv.dengjl.compress.AbstractCompress;

/**
 * gzip算法
 *
 * 
 * @author wwei
 */
public class GzipCompress extends AbstractCompress {

	@Override
	protected OutputStream createOutputStream(OutputStream output) throws IOException {
		return new GZIPOutputStream(output);
	}

	@Override
	protected InputStream createInputStream(InputStream input) throws IOException {
		return new GZIPInputStream(input);
	}
}
