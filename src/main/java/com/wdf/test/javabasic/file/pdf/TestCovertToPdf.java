package com.wdf.test.javabasic.file.pdf;

/**
 * @ClassName: TestCovertToPdf
 * @Author WDF
 * @Description //TODO
 * @Date 2020/11/6 9:31
 * @Copyright Dareway 2020/11/6
 * @Version 1.0
 **/
public class TestCovertToPdf {

    public static void main(String[] arg){
        String docPath = "D:/urp/export/doc/2020-11-06日对账报表.doc";
        String pdfPath = "D:/urp/export/pdf/2020-11-06日对账报表.pdf";
        Word2PdfAsposeUtil.doc2pdf(docPath,pdfPath);
    }
}
