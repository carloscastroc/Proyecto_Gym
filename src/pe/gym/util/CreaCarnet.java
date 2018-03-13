/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gym.util;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import pe.gym.model.Membresia;


/**
 *
 * @author Carlos
 */
public class CreaCarnet {

    public void CrearCarnet(Membresia bean) {
        // Creacion del documento con los margenes
        Document document = new Document(PageSize.A4, 35, 30, 50, 50);
        try {

            // El archivo pdf que vamos a generar
            FileOutputStream fileOutputStream2 = new FileOutputStream(
                    "carnet.pdf");

            // Obtener la instancia del PdfWriter
            PdfWriter.getInstance(document, fileOutputStream2);

            // Abrir el documento
            document.open();

            Image image = null;

            // Obtenemos el logo de datojava
            image = Image.getInstance("INTRO3.png");
            image.scaleAbsolute(120f, 40f);
            image.setAlignment(Element.ALIGN_CENTER);

            // Crear las fuentes para el contenido y los titulos
            Font celdanaranja = FontFactory.getFont(FontFactory.TIMES_BOLDITALIC, 12, Font.NORMAL, BaseColor.WHITE);

            // Creacion de una tabla
            PdfPTable table = new PdfPTable(3);
            float[] medidaCeldas = {1.40f, 0.80f, 0.80f};
            table.setWidths(medidaCeldas);

            // Agregar la imagen anterior a una celda de la tabla
            PdfPCell cell = new PdfPCell(image);

            Phrase ladoizquierdo = new Phrase("The 1 Fitness Club Center SAC \n \n"
                    + "Jr. La Honradez 659 Urb. Pro \n"
                    + "1ra. Etapa - Los Olivos \n"
                    + "Telf: 573-1918 \n \n"
                    + "www.theonefitness.com", celdanaranja);
            Phrase ladoderecho = new Phrase("Nombre: "+bean.getNombre()+" \n "
                    + ""+bean.getApellido() +" \n \n"
                    + "DNI: "+bean.getDNI()+" \n \n"
                    + "Membresia: "+bean.getNombrePlan()+" \n \n"
                    + "F. Inicio: "+bean.getF_Inicio()+" F. Fin: "+bean.getF_Fin()+" \n"
                    + "Nota: Obligatorio traer toalla, candado y DNI");

            PdfPCell cell2 = new PdfPCell(ladoderecho);
            PdfPCell cell3 = new PdfPCell(ladoizquierdo);

            // Propiedades de la celda
            cell.setBackgroundColor(BaseColor.ORANGE);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);

            cell.setBorder(0);
            cell2.setBorder(0);
            cell3.setBorder(0);
            cell2.setColspan(2);
            cell2.setRowspan(2);
            cell2.setVerticalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);

            cell2.setBackgroundColor(BaseColor.WHITE);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setBackgroundColor(BaseColor.ORANGE);

            // Agregar la celda a la tabla
            table.addCell(cell);
            table.addCell(cell2);
            table.addCell(cell3);

            // Agregar la tabla al documento
            document.add(table);

            // Cerrar el documento
            document.close();

            // Abrir el archivo
            File file2 = new File("carnet.pdf");
            Desktop.getDesktop().open(file2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
