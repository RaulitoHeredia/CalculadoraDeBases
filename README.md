# Calculadora de Conversión de Bases 🔢

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Swing](https://img.shields.io/badge/GUI-Swing-yellowgreen)
![License](https://img.shields.io/badge/License-MIT-green)

Una calculadora gráfica en Java para convertir números entre diferentes bases numéricas (de base 2 a base 36).

## 📋 Características

- **Interfaz gráfica** intuitiva usando Java Swing
- Conversión entre **cualquier base** (2 a 36)
- Validación de entrada para asegurar datos correctos
- Soporte para dígitos alfanuméricos (0-9, A-Z)
- Código limpio y bien estructurado

## 🛠️ Requisitos

- Java JDK 17 o superior
- Maven (opcional, para gestión de dependencias)

## 🚀 Cómo ejecutar

1. Clona el repositorio:
```bash
git clone https://github.com/tu-usuario/calculadora-bases.git
cd calculadora-bases
```

2. Compila y ejecuta:
```bash
javac CalculadoraBasesFinal.java
java CalculadoraBasesFinal
```

## 🖼️ Capturas de pantalla

![Interfaz gráfica](screenshots/interface.png)  
*Interfaz principal de la calculadora*

## 🧩 Estructura del código

```
src/
├── main/
│   └── java/
│       └── CalculadoraBasesFinal.java  # Clase principal
docs/
├── screenshots/                        # Capturas de pantalla
README.md                               # Este archivo
```

## 📝 Cómo usar

1. Ingresa el número a convertir
2. Especifica la base actual (ej. 2 para binario)
3. Indica la base objetivo (ej. 16 para hexadecimal)
4. Haz clic en "Convertir"

Ejemplo:  
`101210 (base 3) = 10203 (base 4)`

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor abre un issue o envía un PR.

## 📄 Licencia

Este proyecto está bajo licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.
