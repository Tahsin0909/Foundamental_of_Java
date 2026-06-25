import { existsSync, writeFileSync } from "fs";

const htmlContent = `<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
</html>`;

let fileName = "one.html";

// check if one.html exists
if (existsSync("one.html")) {
    fileName = "two.html";
}

// create file with content
writeFileSync(fileName, htmlContent);

console.log(fileName + " created with HTML content");