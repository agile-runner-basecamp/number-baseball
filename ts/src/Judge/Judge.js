"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.judge = judge;
exports.formatResult = formatResult;
exports.isCorrect = isCorrect;
function judge(answer, guess) {
    var strikes = countStrikes(answer, guess);
    var balls = countBalls(answer, guess);
    return { strikes: strikes, balls: balls };
}
function countStrikes(answer, guess) {
    return guess.filter(function (num, index) { return answer[index] === num; }).length;
}
function countBalls(answer, guess) {
    var sameNumbers = guess.filter(function (num) { return answer.includes(num); }).length;
    return sameNumbers - countStrikes(answer, guess);
}
function formatResult(result) {
    var strikes = result.strikes, balls = result.balls;
    if (strikes === 0 && balls === 0) {
        return '낫싱';
    }
    if (strikes === 0) {
        return "".concat(balls, "\uBCFC");
    }
    if (balls === 0) {
        return "".concat(strikes, "\uC2A4\uD2B8\uB77C\uC774\uD06C");
    }
    return "".concat(balls, "\uBCFC ").concat(strikes, "\uC2A4\uD2B8\uB77C\uC774\uD06C");
}
function isCorrect(result) {
    return result.strikes === 3;
}
