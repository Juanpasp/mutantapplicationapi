Instrucciones para ejecutar la API:

1. Abrir un Postman o una herramienta para hacer llamado de API
2. En metodo colocar POST
3. En direccion colocar la siguiente URL
http://mutantapplicationapi-env.eba-jcg88x3m.us-east-2.elasticbeanstalk.com/api-analyze-mutant/mutant
4. En body colocar raw -> JSON y colocar el siguiente request
{
    "dna": [
        "ATGCGA",
        "CAGTGC",
        "TTATGT",
        "AGAAGG",
        "CCCCTA",
        "TCACTG"
    ]
}
5. Puede modificar los valores del DNA y hacer las pruebas correspondientes
6. Verificar los resultados
