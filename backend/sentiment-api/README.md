# Sentiment API

Backend de análisis de sentimientos para el Hackaton. Provee un endpoint REST para analizar texto y devolver una predicción de sentimiento.

## 🚀 Cómo iniciar

Asegúrate de tener Java 17 instalado.

```powershell
./mvnw.cmd spring-boot:run
```

El servidor iniciará en: `http://localhost:8080`

## 🔌 API Contract

### `POST /sentiment`

Analiza un texto y devuelve si es Positivo, Negativo o Neutro.

**Request:**

```json
{
  "text": "La atención fue excelente"
}
```
*Validación: El campo `text` es obligatorio y debe tener al menos 5 caracteres.*

**Response:**

```json
{
  "prevision": "Positivo",
  "probabilidad": 0.82
}
```

**Error (Validación):**

```json
{
  "error": "El campo 'text' debe tener al menos 5 caracteres"
}
```

## 🧪 Ejemplos de Prueba

### Opción A: CURL (Recomendado)

**Caso Positivo:**
```bash
curl -X POST http://localhost:8080/sentiment -H "Content-Type: application/json" -d '{"text":"La atención fue excelente"}'
```

**Caso Error (Texto corto):**
```bash
curl -X POST http://localhost:8080/sentiment -H "Content-Type: application/json" -d '{"text":"Hola"}'
```

### Opción B: PowerShell

⚠️ **Nota Importante:** Si usas acentos, usa este comando para evitar errores de encoding.

**Caso Positivo:**
```powershell
Invoke-RestMethod -Uri http://localhost:8080/sentiment -Method POST -Body ([System.Text.Encoding]::UTF8.GetBytes('{"text":"La atención fue excelente"}')) -ContentType "application/json"
```

**Ver respuesta de error (400 Bad Request):**
PowerShell oculta el JSON de error por defecto. Úsalo así:
```powershell
try {
    Invoke-RestMethod -Uri http://localhost:8080/sentiment -Method POST -Body '{"text":"Hola"}' -ContentType "application/json"
} catch {
    $_.Exception.Response.GetResponseStream() | %{ [System.IO.StreamReader]::new($_).ReadToEnd() }
}
```

## 🛠️ Stack Tecnológico
- Java 17
- Spring Boot 3+
- Maven
