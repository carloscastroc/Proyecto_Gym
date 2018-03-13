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
import java.util.concurrent.Phaser;
import pe.gym.model.Membresia;
import pe.gym.model.Socio;

/**
 *
 * @author Carlos
 */
public class CreaAcuerdo {

    public void CreaAcuerdo(Membresia bean, Socio bean2) {
        // Creacion del documento con los margenes
        Document document = new Document(PageSize.A4, 35, 30, 50, 50);
        try {

            // El archivo pdf que vamos a generar
            FileOutputStream fileOutputStream3 = new FileOutputStream(
                    "acuerdoSocio" + bean.getIdSocio() + ".pdf");

            // Obtener la instancia del PdfWriter
            PdfWriter.getInstance(document, fileOutputStream3);

            // Abrir el documento
            document.open();

            try {
                Image foto = Image.getInstance("INTRO3.png");
                foto.scaleToFit(100, 100);
                foto.setAlignment(Chunk.ALIGN_LEFT);
                document.add(foto);
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Crear las fuentes para el contenido y los titulos
            Font titulo = FontFactory.getFont("Arial", 20, Font.BOLDITALIC, BaseColor.BLACK);
            Font datos = FontFactory.getFont("Arial", 14, Font.UNDERLINE, BaseColor.BLACK);
            Font relleno = FontFactory.getFont("Arial", 14, Font.NORMAL, BaseColor.BLACK);
            Font subtitulo = FontFactory.getFont("Arial", 14, Font.BOLD, BaseColor.BLACK);
            Font titleclausula = FontFactory.getFont("Arial", 12, Font.NORMAL, BaseColor.BLACK);
            Font detclausula = FontFactory.getFont("Arial", 9, Font.NORMAL, BaseColor.BLACK);
            

            // Creacion de una tabla
            PdfPTable tablesocio = new PdfPTable(6);
            float[] medidaCeldas = {3.0f, 5.0f, 5.0f, 3.0f, 5.0f, 5.0f};
            tablesocio.setWidthPercentage(100);
            tablesocio.setSpacingBefore(20);

            PdfPTable tablemembresia = new PdfPTable(6);
            float[] medidaCeldas2 = {3.0f, 5.0f, 5.0f, 3.0f, 5.0f, 5.0f};
            tablemembresia.setWidthPercentage(100);
            tablemembresia.setSpacingBefore(20);

            Paragraph title = new Paragraph("Acuerdo de Membresía", titulo);
            title.setAlignment(Element.ALIGN_CENTER);
            Paragraph subtitleso = new Paragraph("Codigo de Socio: ", subtitulo);
            subtitleso.setAlignment(Element.ALIGN_LEFT);
            Phrase idsocio = new Phrase(bean2.getIdSocio(), datos);
            Paragraph subtitledatos = new Paragraph("Datos del Cliente", subtitulo);
            subtitledatos.setLeading(25);
            Paragraph ladoizquierdo = new Paragraph("Nombres: \n \n"
                    + "DNI: \n \n"
                    + "Email:  ", relleno);
            Paragraph ladoizquierdo2 = new Paragraph(bean2.getNombre() + "\n \n"
                    + bean2.getDNI() + "\n \n"
                    + bean2.getEmail(), datos);
            Paragraph ladoderecho = new Paragraph("Apellidos:  \n \n"
                    + "Telefono: \n \n", relleno);
            Paragraph ladoderecho2 = new Paragraph(bean2.getApellido() + "\n \n"
                    + bean2.getTelefono(), datos);
            Paragraph subtitlemem = new Paragraph("Datos de la Membresia", subtitulo);
            subtitlemem.setLeading(25);

            PdfPCell cell = new PdfPCell(ladoizquierdo);
            PdfPCell cell2 = new PdfPCell(ladoizquierdo2);
            PdfPCell cell3 = new PdfPCell(ladoderecho);
            PdfPCell cell4 = new PdfPCell(ladoderecho2);

            cell.setBorder(0);
            cell2.setBorder(0);
            cell3.setBorder(0);
            cell4.setBorder(0);
            cell2.setColspan(2);
            cell4.setColspan(2);

            tablesocio.addCell(cell);
            tablesocio.addCell(cell2);
            tablesocio.addCell(cell3);
            tablesocio.addCell(cell4);

            ladoizquierdo = new Paragraph("Id de Membresia: \n \n"
                    + "Nombre de la Promocion: \n \n"
                    + "Fecha de Inicio:  ", relleno);
            ladoizquierdo2 = new Paragraph(bean.getIdMembresia() + "\n \n \n"
                    + bean.getNombrePromocion() + "\n \n \n"
                    + bean.getF_Inicio(), datos);
            ladoderecho = new Paragraph("Nombre del Plan:  \n \n "
                    + "Id Pago: \n \n"
                    + "Fecha de Fin: ", relleno);
            ladoderecho2 = new Paragraph(bean.getNombrePlan() + "\n \n \n"
                    + bean.getIdPago() + "\n \n \n"
                    + bean.getF_Fin(), datos);

            cell = new PdfPCell(ladoizquierdo);
            cell2 = new PdfPCell(ladoizquierdo2);
            cell3 = new PdfPCell(ladoderecho);
            cell4 = new PdfPCell(ladoderecho2);

            cell.setBorder(0);
            cell2.setBorder(0);
            cell3.setBorder(0);
            cell4.setBorder(0);
            cell2.setColspan(2);
            cell4.setColspan(2);

            tablemembresia.addCell(cell);
            tablemembresia.addCell(cell2);
            tablemembresia.addCell(cell3);
            tablemembresia.addCell(cell4);
            
            Paragraph tituloclausula = new Paragraph("1.CLAUSULAS", titleclausula);
            tituloclausula.setLeading(30);
            Paragraph detalleclausula = new Paragraph("1.1 La membresia del socio es personal e intransferible. \n"
                    +"1.2 El socio se responsabiliza por los daños que pudiera causar en las instalaciones y o mobiliario del Gimnasio The 1 Fitness Club "
                    + "consecuencia de prácticas negligentes o o usos incorrectos de los equipos. \n"
                    + "1.3 El socio exonera totalmente al Gimnasio The 1 Fitness Club de cualquier responsabilidad civil o penal por accidentes o lesiones"
                    + "físicas asi como daños y/o perdidas de sus pertenencias dentro de las instalaciones del Gimnasio.\n"
                    + "1.4 El socio se responsabiliza por todo menor de edad que ingrese al Gimnasio The 1 Fitness Club bajo su custodia. \n"
                    + "1.5 Queda terminantemente prohíbido el ingreso de socios con armas de fuego, punzo cortantes, el uso y/o consumo de bebidas "
                    + "alcohólicas o drogas (o haberlas consumido antes de ingresar a las instalaciones). \n"
                    + "1.6 El Gimnasio The 1 Fitness Club  se reserva el derecho de disolver en cualquier momento el acuerdo de membresía unilateralmente "
                    + "e impedir el ingreso del socio que falte aa la moral y a las buenas conductas costumbre o que realice algún acto que signifique falta de "
                    + "higiene o realiza actos ajenos a esta  membresía. \n"
                    + "1.7 Es obligatorio usar casilleros por las horas de entrenamiento. \n"
                    + "1.8 El uso de una toalla en su entrenamiento es de caracter obligatorio. \n"
                    + "1.9 El socio debe realizar su entrenamiento con indumentaria deportiva. \n"
                    + "1.10 El Gimnasio The 1 Fitness Club no se responsabiliza por perdida o robos ocurridos en sus instalaciones. \n"
                    + "1.11 Esta prohibido la venta o comercializaci{on en el Gimnasio The 1 Fitness Club, en caso de detectarse a algún socio vendiendo en las instalaciones del Gimnasio "
                    + "producto alguno, se procederá a decomisar dicha mercadería y a dar por finiquitado su acuerdo de membresía cancelándolo sin ningún tipo de indemnización. \n"
                    + "1.12 Las cantidades pagadas por el socio no son reembolsables. \n"
                    + "1.13 Una vez que esta emitida la Boleta o Factura no habrá devolución de dinero. ", detclausula);
            detalleclausula.setLeading(9);
            Paragraph firma = new Paragraph("Firma y huella del socio", relleno);
            firma.setLeading(80);
            firma.setAlignment(Element.ALIGN_CENTER);
            Paragraph footer = new Paragraph("Acepto haber leído lo acordado.",subtitulo);
            footer.setLeading(30);
            footer.setAlignment(Element.ALIGN_RIGHT);

            document.add(title);
            document.add(subtitleso);
            document.add(idsocio);
            document.add(subtitledatos);
            document.add(tablesocio);
            document.add(subtitlemem);
            document.add(tablemembresia);
            document.add(tituloclausula);
            document.add(detalleclausula);
            document.add(firma);
            document.add(footer);

            // Cerrar el documento
            document.close();

            // Abrir el archivo
            File file3 = new File("acuerdoSocio" + bean.getIdSocio() + ".pdf");
            Desktop.getDesktop().open(file3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
