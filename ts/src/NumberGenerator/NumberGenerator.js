"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.generateRandomNumbers = generateRandomNumbers;
function generateRandomNumbers() {
    var numbers = [];
    while (numbers.length < 3) {
        var num = Math.floor(Math.random() * 9) + 1;
        // Math.random() 난수 생성 * 9를 곱하고, floor 로 소수점 버림 -> 0~8 따라서 1을 더해줌
        if (!numbers.includes(num)) {
            // 배열에 있으면 버림, 없으면 추가
            numbers.push(num);
        }
    }
    return numbers;
}
