/** 
 * Forward declaration of guess API.
 * @param {number} num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * var guess = function(num) {}
 */

/**
 * @param {number} n
 * @return {number}
 */

    const guessNumber = function(n) {
    let l = 1;
    let r = n;
    let pick = Math.floor((r+l)/2);
    let g = guess(pick);
    while(l <= r) {
        if(g > 0) {
            l = pick+1;
            pick = Math.floor((r+l)/2);
            g = guess(pick);
        }
        else if(g < 0) {
            r = pick-1;
            pick = Math.floor((r+l)/2);
            g = guess(pick);
        }
        else {
            return pick;
        }
    }

};