# This is a global variable
name="Derek"

# Local variable values aren't available outside of the function

demLocal() {
local name="Paul"
return
}

demLocal

echo "$name"   ## echo will print Derek not the local variable