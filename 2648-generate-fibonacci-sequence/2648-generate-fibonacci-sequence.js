/**
 * @return {Generator<number>}
 */
var fibGenerator = function* () {
    let x = 0; 
    yield x;
    let y = 1;
    yield y;
    while (true) {
        let temp = y
        y =  x + y; //will act as prev for next
        yield y; 
        x = temp; //will act prev of pev for next
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */