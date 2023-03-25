//example
program test is
    var a,b:integer;
    var c1,c2: boolean;
begin
    skip;
    read a;
    write 12;
    a:=1;
    b:=14350;
    c1 := true;
    if a>b or c1 then b:=2 else a:=2; c2:=false end if;
    if a>b or c1 then b:=2  end if;
    while not(c2) and (a<b) do a:=a+1 end while
end

program a is
    var a:integer;
begin
    a:=1
end
