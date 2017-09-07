package com.starry.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ImgRandomServlet
 */
@WebServlet("/ImgRandomServlet")
public class ImgRandomServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImgRandomServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		 int width = 76;
		 int height = 34;
		 BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	        //��û���
	        Graphics graphics = img.getGraphics();
	        //����������Ϊ��ɫ
	        graphics.setColor(Color.BLUE);
	        //���ƾ���
	        graphics.fillRect(0, 0, width, height);
	        //����������Ϊ��ɫ
	        graphics.setColor(new Color(34, 95, 15));
	        graphics.fillRect(1, 1, width-2, height-2);
	        //�����ַ�����
	        String code = "1234567890abcdefg";
	        Random rd = new Random();
	        StringBuffer codesave = new StringBuffer();
	        //���û��ʵ�������ʽΪ���塢�Ӵ֣��и�
	        graphics.setFont(new Font("����", Font.BOLD, height-4));
	        for (int i = 0; i < 4; i++) {
	            //������ɫ
	            graphics.setColor(new Color(rd.nextInt(255), rd.nextInt(255), rd.nextInt(255)));
	            //ȡ���������
	            int index = rd.nextInt(code.length());
	            codesave.append(code.substring(index, index+1));
	            //���ַ���
	            graphics.drawString(code.substring(index, index+1), width/6*(i+1), height-4);
	        }
	        //д�������  
	        String codes=codesave.toString();
	        request.getSession().setAttribute("codesave", codes);
	        ImageIO.write(img, "jpg", response.getOutputStream());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
