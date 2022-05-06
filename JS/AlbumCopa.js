const numTotal = parseInt(gets())
const numFigCompradas = parseInt(gets())
const setFig = new Set()

for(var i = 0; i <= numFigCompradas;i++){
  const fig = parseInt(gets());
  setFig.add(fig);
}

print(numTotal - setFig.size+1)