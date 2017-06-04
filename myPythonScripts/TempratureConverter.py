"""
Takes a list in Celcius and Converts to fahrenit and stores the output in file
called fahrenit.txt

"""

def convertToFahrenit(celcius):
    if (-273 < celcius):
        fahrenit= (celcius *9)/32;
        return fahrenit;

fileName="fahrenit.txt";

celciusList=[ 10,-20,-289,100];
fahrenitlist=[];
for temp in celciusList:
    fahrenitlist.append(convertToFahrenit(temp));

print("Fahrenit List:", fahrenitlist);
#open File in Write mode so that previous file (if exits) will be over written
with open(fileName,"w") as file:
    for fahrenit in fahrenitlist:
        if(None != fahrenit):
            file.write(str(fahrenit)+"\n");
#End of with Block of code
