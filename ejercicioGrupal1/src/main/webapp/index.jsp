<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
            crossorigin="anonymous">
</head>
<body>
<jsp:include page='header.jsp'>
    <jsp:param name='title' value='Welcome'/>
</jsp:include>
<section>
    <h1 style='text-align: center'>Bienvenido a nuestras Asesorías</h1>
    <div class="container">
        <div class="row">


            <p class="lead">Somos una empresa especializada en asesorías en
                prevención de riesgos laborales. Ofrecemos una amplia gama de
                servicios para garantizar un entorno de trabajo seguro para los
                empleados, así como para prevenir accidentes.</p>

        </div>
    </div>
</section>
<section>
    <div class="container">
        <!-- Example row of columns -->
        <div class="row">
            <div class="col-md-3">
                <h4>Asesoría y Consultoría en Prevención de Riesgos</h4>
                <p>
                    Nuestro equipo de Asesoría y Consultoría en Prevención de Riesgos
                    está formado por expertos altamente capacitados en la
                    identificación y la eliminación de los riesgos laborales.<br>
                    Nuestros consultores de seguridad trabajan con las empresas en una
                    variedad de sectores para proporcionar soluciones efectivas y
                    personalizadas, para garantizar la seguridad de los empleados en
                    su entorno de trabajo.
                </p>
            </div>

            <div class="col-md-3">
                <h4>Evaluación de Riesgos</h4>
                <p>Nuestro equipo de Evaluación de Riesgos está compuesto por
                    expertos altamente capacitados en identificar, evaluar y minimizar
                    los riesgos presentes en cualquier entorno laboral. Nuestros
                    especialistas trabajan mano a mano con nuestros clientes,
                    brindando un servicio personalizado, para identificar todos los
                    riesgos y proporcionar soluciones prácticas y efectivas que
                    minimicen los riesgos potenciales.
            </div>
            <div class="col-md-3">
                <h4>Cursos de Formación y Capacitación</h4>
                <p>Nuestro equipo de Cursos de Formación y Capacitación de
                    riesgos está formado por expertos en la prevención y control de
                    riesgos laborales. Ofrecemos una amplia gama de cursos
                    personalizados para cada empresa, con el objetivo de proporcionar
                    una capacitación completa y efectiva en temas de seguridad
                    laboral.</p>

            </div>
            <div class="col-md-3">
                <h4>Planes de Emergencia</h4>
                <p>Nuestro equipo de Planes de Emergencia está compuesto por un
                    grupo de profesionales altamente capacitados en el diseño e
                    implementación de planes de acción para situaciones de emergencias
                    en el lugar de trabajo. Trabajamos mano a mano con nuestros
                    clientes para garantizar la seguridad en el lugar de trabajo y
                    reducir el impacto en la salud, la seguridad y los aspectos
                    ambientales que puedan resultar de estos eventos.</p>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row">
            <h4 style='text-align: center'>Contáctanos</h4>
            <p class="lead">Si deseas obtener más información sobre nuestros
                servicios o deseas solicitar una cotización, no dudes en
                contactarnos.</p>
            <p class="lead">Teléfono: +XX XX XX XX XX</p>
            <p class="lead">Correo electrónico: info@empresaasesorias.cl</p>
        </div>
    </div>
</section>
<jsp:include page='footer.jsp'>
    <jsp:param name='title' value='Welcome'/>
</jsp:include>

<script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>

</body>
</html>