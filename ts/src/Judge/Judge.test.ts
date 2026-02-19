import { format } from "path";
import { formatResult, isCorrect, judge, JudgeResult } from "./Judge";
import { isContext } from "vm";



describe('judge', () => {
    it('strike? ball?', () => {
        const result = judge([1,2,3], [2,1,3]);
        expect(result).toEqual({strikes:1, balls:2});
    })
})

describe('formatREsult', () => {
    it('낫싱 출력', () => {
        expect(formatResult({strikes: 0, balls: 0})).toBe('낫싱');
    });

    it('strike , ball 출력', () => {
        expect(formatResult({strikes: 1, balls: 2})).toBe('2볼 1스트라이크')
    })
})

describe('isCorrect', () => {
    it('true check', () => {
        expect(isCorrect({strikes:3, balls:0})).toBe(true)
    })
})