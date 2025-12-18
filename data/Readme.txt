# 📂 Selección del Dataset: AHR (Andalusian Hotel Reviews)

Para el desarrollo de este MVP de Análisis de Sentimiento, hemos seleccionado el dataset **AHR (Andalusian Hotel Reviews)**. A continuación, detallamos las razones técnicas y de negocio que validan esta elección:

### 1. Alineación con el Caso de Uso (Sector Negocio)
El proyecto busca solucionar problemas en **Atención al Cliente y Marketing**. Este dataset contiene opiniones reales de usuarios sobre hoteles, lo que representa perfectamente el escenario de "feedback de clientes".
*   **Realismo:** Al provenir de TripAdvisor y COAH, los textos contienen jerga, expresiones coloquiales y matices reales del idioma, permitiendo entrenar un modelo robusto ante entradas de usuarios reales.

### 2. Idioma Nativo (Español)
A diferencia de la mayoría de datasets de NLP que están en inglés (IMDB, Amazon Reviews), el AHR está íntegramente en **español**.
*   **Ventaja:** Elimina la necesidad de traducción previa, reduciendo la latencia de la API.
*   **Validación de Mercado:** Permite crear una solución adaptada específicamente al mercado hispanohablante, capturando sarcasmo y modismos locales que los modelos traducidos suelen perder.

### 3. Facilidad para el MVP (Versión Balanceada)
El análisis de sentimiento suele enfrentarse al problema del *desbalanceo de clases* (la gente tiende a dejar más reseñas positivas que negativas).
*   **Solución:** Este dataset ofrece una **versión reducida y balanceada (7,615 registros)**.
*   **Impacto en el Hackathon:** Nos permite entrenar un modelo fiable rápidamente sin invertir tiempo excesivo en técnicas complejas de re-muestreo (oversampling/undersampling), garantizando métricas de *Accuracy* y *F1-Score* más realistas para la demostración.

### 4. Etiquetado de Calidad
El dataset ya proporciona las características necesarias para el aprendizaje supervisado sin necesidad de pre-procesamiento manual costoso:
*   **`review_text`**: La variable predictora (Input).
*   **`rating` (1-5) & `label`**: La variable objetivo (Target). Esto nos da la flexibilidad de configurar el modelo tanto para clasificación **binaria** (Positivo/Negativo) como para predicción de **rating** (Estrellas), según evolucione el proyecto.

---
*Fuente del dato: Dataset público recopilado de TripAdvisor (2021) y corpus COAH (2014).*
*https://www.kaggle.com/datasets/chizhikchi/andalusian-hotels-reviews-unbalanced/data*