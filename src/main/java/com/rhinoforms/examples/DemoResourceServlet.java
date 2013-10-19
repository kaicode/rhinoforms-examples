package com.rhinoforms.examples;

import com.rhinoforms.resourceloader.DevResourceLoader;
import com.rhinoforms.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

public class DemoResourceServlet extends HttpServlet {

	private DevResourceLoader devResourceLoader;
	private StreamUtils streamUtils;

	@Override
	public void init() throws ServletException {
		devResourceLoader = new DevResourceLoader(getServletContext());
		streamUtils = new StreamUtils();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String resourcePath = request.getParameter("path");
		InputStream stream = devResourceLoader.getResourceAsStream(resourcePath);
		try {
			streamUtils.copyInputStreamToOutputStream(stream, response.getOutputStream());
		} finally {
			stream.close();
		}
	}
}
