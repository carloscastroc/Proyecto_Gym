package pe.gym.util;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.TabStop;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;
import pe.gym.controller.DetalleEvaluadorController;
import pe.gym.model.DetalleEvaluador;
import pe.gym.model.Membresia;
import pe.gym.model.Socio;

/**
 *
 * @author Carlos
 */
public class CreaPlan {

    public void CreaPlan(String idplan) {

        List<DetalleEvaluador> lista = new ArrayList<>();
        DetalleEvaluadorController control = new DetalleEvaluadorController();

        lista = control.Detalle(idplan);

        // Creacion del documento con los margenes
        Document document = new Document(PageSize.A4, 35, 30, 50, 50);
        try {

            // El archivo pdf que vamos a generar
            FileOutputStream fileOutputStream1 = new FileOutputStream(
                    "PlanEntrenamiento" + idplan + ".pdf");

            // Obtener la instancia del PdfWriter
            PdfWriter.getInstance(document, fileOutputStream1);

            // Abrir el documento
            document.open();

            try {
                Image foto = Image.getInstance("src/pe/gym/img/INTRO3.png");
                foto.scaleToFit(100, 100);
                foto.setAlignment(Chunk.ALIGN_LEFT);
                document.add(foto);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Crear las fuentes para el contenido y los titulos
            Font titulo = FontFactory.getFont("Arial", 20, Font.BOLDITALIC, BaseColor.BLACK);
            Font datos = FontFactory.getFont("Arial", 14, Font.NORMAL, BaseColor.BLACK);
            Font relleno = FontFactory.getFont("Arial", 14, Font.NORMAL, BaseColor.BLACK);
            Font subtitulo = FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK);
            Font titleclausula = FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK);
            Font detclausula = FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK);

            // Creacion de una tabla
            PdfPTable tabledetalle = new PdfPTable(5);
            float[] medidaCeldas = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
            tabledetalle.setWidthPercentage(100);
            tabledetalle.setSpacingBefore(20);

            Paragraph title = new Paragraph("Plan de Entrenamiento", titulo);
            title.setAlignment(Element.ALIGN_CENTER);
            Paragraph subtitleso = new Paragraph("Codigo de PlanEntrenamiento: ", subtitulo);
            subtitleso.setAlignment(Element.ALIGN_LEFT);
            Phrase idpl = new Phrase(idplan, datos);

            document.add(title);
            document.add(subtitleso);
            document.add(idpl);

            PdfPCell row1 = new PdfPCell(new Paragraph("Ejercicio", subtitulo));
            PdfPCell row2 = new PdfPCell(new Paragraph("N° Maquina", subtitulo));
            PdfPCell row3 = new PdfPCell(new Paragraph("Series", subtitulo));
            PdfPCell row4 = new PdfPCell(new Paragraph("Repeticiones", subtitulo));

//            row1.setBorder(0);
//            row2.setBorder(0);
//            row3.setBorder(0);
//            row4.setBorder(0);
            row1.setColspan(2);

            tabledetalle.addCell(row1);
            tabledetalle.addCell(row2);
            tabledetalle.addCell(row3);
            tabledetalle.addCell(row4);

            for (DetalleEvaluador d : lista) {

                row1 = new PdfPCell(new Paragraph(""+d.getEjercicio(), datos));
                row2 = new PdfPCell(new Paragraph(""+d.getN_Maquina(), datos));
                row3 = new PdfPCell(new Paragraph(""+d.getSerie(), datos));
                row4 = new PdfPCell(new Paragraph(""+d.getRepeticiones(), datos));

//                row1.setBorder(0);
//                row2.setBorder(0);
//                row3.setBorder(0);
//                row4.setBorder(0);
                row1.setColspan(2);

                tabledetalle.addCell(row1);
                tabledetalle.addCell(row2);
                tabledetalle.addCell(row3);
                tabledetalle.addCell(row4);

            }

            document.add(tabledetalle);

            // Cerrar el documento
            document.close();

            // Abrir el archivo
            File file = new File("PlanEntrenamiento" + idplan + ".pdf");
            Desktop.getDesktop().open(file);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
