const list: number[] = [25, 36, 4, 55, 71, 18, 0, 71, 89, 65];

top3(list);
const top3 = (list: number[]) => {
    let bbb: number[] =
        list.sort((num1, num2) => num2 - num1);
    for (let i = 0; i < 3; i++) {
        console.log(list[i]);
    }
}