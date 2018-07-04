package com.nskfdc.scgj.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.nskfdc.scgj.dto.PocDto;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;

@Service
public class PDFService {
	

	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PDFService.class);
	
	public int pdf() throws IOException {
	
    List<PocDto> poc1 = new ArrayList<PocDto>();
	
	PocDto pocdto = new PocDto("2014cs040","Training Institute","Ghaziabad","51848455","hwebgdvgh@bcdb.com");

	poc1.add(pocdto);
	PocDto pocdto1 = new PocDto("2014cs040","Training Institute","Ghaziabad","51848455","hwebgdvgh@bcdb.com");
	
	poc1.add(pocdto1);
	
	
	
	JRBeanCollectionDataSource pocBeans = new JRBeanCollectionDataSource(poc1);
	
	/* Map to hold Jasper report Parameters */
    Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("POCDataSource", pocBeans);

        
        
        
        
        /*----------------------------- Creating PDF------------------------------------------*/
        
        ClassPathResource resource = new ClassPathResource("/static/template_table.jasper");
       
        
        String userHomeDirectory = System.getProperty("user.home");
        
        String outputFile = userHomeDirectory + File.separatorChar + "JasperTableExample.pdf";
        LOGGER.debug("THE OUTPUT FILE IS IN" +userHomeDirectory+"in ---------"+ outputFile);
        LOGGER.debug("Getting input stream");
        InputStream inputStream = resource.getInputStream();
        LOGGER.debug("Input Stream successfully generated");

        int success = 0;
        try {
            LOGGER.debug("Creating the jrprint file..");
            JasperPrint printFileName = JasperFillManager.fillReport(inputStream, parameters, new JREmptyDataSource());
            LOGGER.debug("Successfuly created the jrprint file >> " + printFileName);    
            
            OutputStream outputStream = new FileOutputStream(new File(outputFile));

            if (printFileName != null) {
                LOGGER.debug("Exporting the file to pdf..");
                JasperExportManager.exportReportToPdfStream(printFileName, outputStream);
                success = 1;
                LOGGER.debug("PDF generated successfully..!!");
                
                /*------------------------- In Excel---------------------------------------------*/
                LOGGER.debug("Exporting the file to excel..");
                
                JRXlsxExporter exporter = new JRXlsxExporter();
                exporter.setExporterInput(new SimpleExporterInput(printFileName));
                
                String outputFile2=userHomeDirectory + File.separatorChar + "JasperTableExample.xlsx";
               
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(outputFile2));
                SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration(); 
                configuration.setDetectCellType(true);
                configuration.setCollapseRowSpan(false);
                exporter.setConfiguration(configuration);
                exporter.exportReport();
                
                
                LOGGER.debug("Successfully Generated excel..");
                
                
                
            } else {
                success = -1;
                LOGGER.debug("jrprint file is empty..");
            }

            LOGGER.debug("Pdf generated successfully....!!!");
            
            outputStream.close();
        } catch (JRException e) {
            LOGGER.debug("Exception caught, Error in generating PDF");
            
        }

        return success;
    }

}	


